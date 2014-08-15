package com.elkardumen.carga;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Properties;

import org.apache.log4j.Logger;

public class SolicitarInformacion {
	

	
	private static Logger logger = Logger.getLogger(SolicitarInformacion.class);
	private String ip;
	private int puerto;

	
	public SolicitarInformacion() throws IOException {
		super();
		
		
		Properties configuration = new Properties();
        InputStream in = getClass().getResourceAsStream("/monitor.properties");
        configuration.load(in);
        this.ip=configuration.getProperty("ipOrigen");
        this.puerto=Integer.valueOf(configuration.getProperty("puertoLoadIni"));
		
        
		logger.info("**************************************************");
		logger.info("SOLICITANDO INFORMACION A: " + ip + ":" + puerto);
		logger.info("**************************************************");
	}
	

	//metodo que es llamdo desde javascript
	public List<String> obtenerCargaInicialInformation(String typo) {
		//objeto para generar la llamada de informacion desde el socket
		OnDemandClient informacionClient = new OnDemandClient(ip, puerto);
		return informacionClient.requestInformationInitial(typo, "");
	}
	
	
	
	

}
