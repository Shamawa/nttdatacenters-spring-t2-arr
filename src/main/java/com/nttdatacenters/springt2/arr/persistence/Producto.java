package com.nttdatacenters.springt2.arr.persistence;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

/**
 * Tabla Productos
 * 
 * @author Alexandra Rodríguez
 *
 */
@Entity
@Table
public class Producto {

	// Un producto tendrá un identificador, nombre, un precio PVP y un precio sin
	// impuestos

	/** SERIAL VERSION */
	private static final long serialVersionUID = 1L;

	/** ID */
	private long idProducto;

	/** Nombre del producto */
	private String nombre;

	/** Precio del produco */
	private double precioConIVA;

	/** Numero de pedido */
	private long numPedido;

	/** PRecio sin Impuestos */
	private double precioSinIVA;

	// GETTERS AND SETTERS

	/**
	 * @return IdProducto
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "C_PK_PRODUCTO_ID")
	public long getIdProducto() {
		return idProducto;
	}

	/**
	 * 
	 * @param idProducto
	 */
	public void setIdProducto(long idProducto) {
		this.idProducto = idProducto;
	}

	/**
	 * @return nombre
	 */
	@Column(name = "C_NOMBRE", nullable = false)
	public String getNombre() {
		return nombre;
	}

	/**
	 * 
	 * @param nombre
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Column(name = "C_PRECIO_PVP", nullable = false)
	public double getPrecioPVP() {
		return precioConIVA;
	}

	public void setPrecioConIVA(double precioConIVA) {
		this.precioConIVA = precioConIVA;
	}

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "C_FK_PEDIDO_ID", referencedColumnName = "C_PK_PEDIDO_ID")
	public long getNumPedido() {
		return numPedido;
	}

	public void setNumPedido(long numPedido) {
		this.numPedido = numPedido;
	}

	public double getPrecioSinImpuestos() {
		return precioSinIVA;
	}

	public void setPrecioSinIVA(double precioSinIVA) {
		this.precioSinIVA = precioSinIVA;
	}

}
