package com.educandoweb.curso.servicies.exceptions;

public class ResourceNotFoundException extends RuntimeException{
	private static final long serialVersionUID = 1L;
	
	public ResourceNotFoundException(Object id) {
		super("ressource not found. id: " + id);
	}

}
