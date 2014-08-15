package com.elkardumen.carga;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;

import com.google.gson.Gson;

public class OnDemandClient {
	private static Logger logger = Logger.getLogger(OnDemandClient.class);
	private String ip;
	private int port;
	
	public OnDemandClient(String ip, int port) {
		this.ip = ip;
		this.port = port;
	}

	public List<String> requestHistory(String type, int sucursalId) {
		List<String> returnValue = new ArrayList<String>();
		OnDemandSocket clientSocket = null; 
		try {
			clientSocket = new OnDemandSocket(ip, port);
			
			String json = obtenerJson(type, sucursalId);

			logger.info("Solicitando a SOCKET: " + json);
			clientSocket.sendLine(json);
	        
	        String response = null;
            while ((response = clientSocket.readLine()) != null) {
            	logger.info("Mensaje de ventanillasEsper: " + response);
                if (!response.equals("EOF")) {
                	returnValue.add(response);
                } else {
                	break;
                }
            }
            logger.info("Finaliza conexion con ventanillasEsper.");
		} catch (IOException e) {
			logger.info("Error en la comunicacion con ventanillasEsper." + e.getMessage());
		} finally {
			if (clientSocket != null) {
				clientSocket.close();
			}
		}
		
		
		
		return returnValue;
	}


	
	
	public List<String> requestInformationInitial(String type, String sucursalId) {
		List<String> returnValue = new ArrayList<String>();
		OnDemandSocket clientSocket = null; 
		try {
			clientSocket = new OnDemandSocket(ip, port);
			
			String json = obtenerJson(type, 0);

			logger.info("Solicitando a informacion al Socket: " + json);
			clientSocket.sendLine(json);
	        
	        String response = null;
            while ((response = clientSocket.readLine()) != null) {
            	logger.info("Mensaje del socket: " + response);
                if (!response.equals("EOF")) {
                	returnValue.add(response);
                } else {
                	break;
                }
            }
            logger.info("Finaliza conexion con Socket.");
		} catch (IOException e) {
			logger.info("Error en la comunicacion con Socket." + e.getMessage());
		} finally {
			if (clientSocket != null) {
				clientSocket.close();
			}
		}
//		System.out.println(returnValue);
		
		return returnValue;
	}
	
	
	private String obtenerJson(String type, int sucursalId) {
		Gson gson = new Gson();
		OnDemandJsonRequest json = new OnDemandJsonRequest();

		json.setType(type);
		json.setSucursalId(sucursalId);

		return gson.toJson(json);
	}
}
