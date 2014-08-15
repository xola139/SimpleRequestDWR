package com.elkardumen.carga;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

import org.apache.log4j.Logger;

public class OnDemandSocket {
	private static Logger logger = Logger.getLogger(OnDemandSocket.class);
	private Socket socket;
	private BufferedReader in;
	private PrintWriter out;

	public OnDemandSocket(String ip, int port) throws IOException {
		socket = new Socket(ip, port);
		in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
		out = new PrintWriter(socket.getOutputStream(), true);
	}
	public OnDemandSocket(Socket socket) throws IOException {
		this.socket = socket;
		in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
		out = new PrintWriter(socket.getOutputStream(), true);
	}
	public void sendLine(String message) {
		out.println(message);
	}
	
	public String readLine() throws IOException {
		return in.readLine();
	}
	
	public void close() {
		try {
			socket.close();
		} catch (IOException e) {
			logger.error("Excepcion al cerrar el socket: " + e.getMessage());
		}
	}
	public PrintWriter getOut() {
		return out;
	}
	public void setOut(PrintWriter out) {
		this.out = out;
	}
	public boolean isClosed() {
		return socket.isClosed();
	}
	
}
