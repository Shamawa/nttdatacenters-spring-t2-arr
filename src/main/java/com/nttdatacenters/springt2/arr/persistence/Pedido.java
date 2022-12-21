package com.nttdatacenters.springt2.arr.persistence;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

/**
 * Tabla Pedidos
 * 
 * @author Alexandra Rodriguez
 *
 */
@Entity
@Table(name = "T_PEDIDO")
public class Pedido {

	private static final long serialVersionUID = 1L;

	/** ID del Pedido (PK) **/
	private long IdPedido;

	/** Nombre del destinatario */
	private String Destinarario;

	/** Dirección del destinatario */
	private String Direccion;

	/* Esta fuera de la Peninsula */
	private boolean fueraDePeninsula;

	/* Lista de Productos **/
	private List<Producto> productosList;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "C_PK_PEDIDO_ID")
	public long getIdPedido() {
		return IdPedido;
	}

	/**
	 * 
	 * @param idPedido
	 */
	public void setIdPedido(long idPedido) {
		IdPedido = idPedido;
	}

	/**
	 * 
	 * @return nombre del Destinatario
	 */
	@Column(name = "C_NAME", nullable = false)
	public String getDestinarario() {
		return Destinarario;
	}

	public void setDestinarario(String destinarario) {
		Destinarario = destinarario;
	}

	/**
	 * 
	 * @return Dirección
	 */
	@Column (name = "C_DIRECCION")
	public String getDireccion() {
		return Direccion;
	}

	public void setDireccion(String direccion) {
		Direccion = direccion;
	}

	/**
	 * 
	 * @return boolean Peninsula
	 */
	@Column (name = "C_ES_PENINSULA")
	public boolean isFueraDePeninsula() {
		return fueraDePeninsula;
	}

	public void setFueraDePeninsula(boolean fueraDePeninsula) {
		this.fueraDePeninsula = fueraDePeninsula;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	/**
	 * 
	 * @return Producto o lista de productos
	 */
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER, mappedBy = "owner")
	public List<Producto> getProductosList() {
		return productosList;
	}

	public void setProductosList(List<Producto> productosList) {
		this.productosList = productosList;
	}

}
