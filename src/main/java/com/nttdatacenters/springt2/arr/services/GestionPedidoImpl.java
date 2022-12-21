package com.nttdatacenters.springt2.arr.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.nttdatacenters.springt2.arr.persistence.Pedido;
import com.nttdatacenters.springt2.arr.persistence.Producto;

/**
 * Servicio de Gestion de Pedidos
 * 
 * @author ACER
 *
 */

@Service
public class GestionPedidoImpl  implements GestionPedidoI{

	@Override
	public List<Producto> getProductoConPVPCalculado(Pedido pedido) {
		for (Producto producto : pedido.getProductosList()) {
			if (pedido.isFueraDePeninsula()) {
				producto.setPrecioConIVA(producto.getPrecioSinImpuestos() * 0.04) ;
			} else {
				producto.setPrecioConIVA(producto.getPrecioSinImpuestos() * 1.21);
			}
		}
		
		return pedido.getProductosList();
	}

}
