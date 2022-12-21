package com.nttdatacenters.springt2.arr.services;

import java.util.List;

import com.nttdatacenters.springt2.arr.persistence.Pedido;
import com.nttdatacenters.springt2.arr.persistence.Producto;

/** 
 * Servicio de gestión de pedidos
 * 
 * @author Alexandra Rodríguez
 *
 */
public interface GestionPedidoI {
	public List<Producto> getProductoConPVPCalculado(Pedido pedido);
}
