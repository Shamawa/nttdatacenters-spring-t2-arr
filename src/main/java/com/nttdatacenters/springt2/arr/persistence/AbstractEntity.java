package com.nttdatacenters.springt2.arr.persistence;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.MappedSuperclass;

/**
 * 
 * @author Alexandra Rodríguez
 *
 */
@MappedSuperclass
public abstract class AbstractEntity implements Serializable {
	
	/** SERIAL VERSION */
	private static final long serialVersionUID = 1L;

	/** User de creación */
	private String createPedido;

	/** Fecha de creación */
	private String createDate;

	@Column(name ="C_CREATE_PEDIDO")
	public String getCreatePedido() {
		return createPedido;
	}

	public void setCreatePedido(String createPedido) {
		this.createPedido = createPedido;
	}

	@Column(name = "C_CREATE_DATE")
	public String getCreateDate() {
		return createDate;
	}

	public void setCreateDate(String createDate) {
		this.createDate = createDate;
	}
	
	

}
