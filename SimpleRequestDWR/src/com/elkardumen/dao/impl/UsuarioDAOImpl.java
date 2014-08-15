package com.elkardumen.dao.impl;

import java.util.List;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

import com.elkardumen.bean.Usuario;
import com.elkardumen.dao.UsuarioDAO;



public class UsuarioDAOImpl extends JdbcDaoSupport implements UsuarioDAO
{
	
	
	
public List<Usuario> getDatosUsuarios(){
		
		String sql = "select id,firstname,lastname,email,password from usuario";
		List<Usuario> usuarios = getJdbcTemplate().query(sql,new BeanPropertyRowMapper(Usuario.class));
		System.out.println(">>><"+usuarios);
		return usuarios;
	
	}
	
//public void insert(Usuario user){
//	 
//	String sql = "update usuario " +
//		" set firstname=?,lastname=?,email=?,password=? where id=?";
//	getJdbcTemplate().update(sql, new Object[] { user.getFirstname(),user.getLastname(),user.getEmail(),user.getPassword(),user.getId()});
//
//}
//	
	
		
}
