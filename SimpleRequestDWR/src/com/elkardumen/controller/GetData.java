package com.elkardumen.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.elkardumen.bean.Usuario;
import com.elkardumen.dao.UsuarioDAO;
import com.google.gson.Gson;



@Controller
public class GetData {
	
	 @Autowired  UsuarioDAO usuarioDAO;
	 
	 public String getListaUsuarios() {
		
//		 String fecha = request.getParameter("fecha");
//		 String parametro2 = request.getParameter("parametro2");
//		 
		 
		 try{
			 List<Usuario> lst=usuarioDAO.getDatosUsuarios();	 
			 return new Gson().toJson(lst);
			 
		 }catch(Exception e){
			 e.printStackTrace();
		 }
		 
    	
		return null;
 
	}
	 

	
	 
	 

}
