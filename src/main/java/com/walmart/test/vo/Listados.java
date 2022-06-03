package com.walmart.test.vo;

import java.io.Serializable;
import java.util.List;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;


public class Listados implements Serializable {

	private static final long serialVersionUID = 1L;

	@NotNull(message = "listadoA no puede ser Null.")
	@NotEmpty(message = "listadoA no puede estar vacio.")
	private List<String> listadoA;

	@NotNull(message = "listadoB no puede ser Null.")
	@NotEmpty(message = "listadoB no puede estar vacio.")
    private List<String> listadoB;

	public List<String> getListadoA() {
		return listadoA;
	}
	public void setListadoA(List<String> listadoA) {
		this.listadoA = listadoA;
	}
	
	public List<String> getListadoB() {
		return listadoB;
	}
	public void setListadoB(List<String> listadoB) {
		this.listadoB = listadoB;
	}
}
