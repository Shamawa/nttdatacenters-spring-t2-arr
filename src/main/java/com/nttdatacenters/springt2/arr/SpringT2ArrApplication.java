package com.nttdatacenters.springt2.arr;

import java.util.ArrayList;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.nttdatacenters.springt2.arr.persistence.Pedido;
import com.nttdatacenters.springt2.arr.persistence.Producto;
import com.nttdatacenters.springt2.arr.services.GestionPedidoImpl;

/**
 * 
 * @author Alexandra Rodríguez
 *
 */
@SpringBootApplication
public class SpringT2ArrApplication {

	/**
	 * Método principal
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		SpringApplication.run(SpringT2ArrApplication.class, args);
		
		GestionPedidoImpl gestionPedidoImpl = new GestionPedidoImpl();
		
		Producto producto1 = new Producto();
		producto1.setIdProducto(1L);
		producto1.setNombre("Producto 1");
		producto1.setNumPedido(1L);
		producto1.setPrecioSinIVA(100.0);
		
		Producto producto2 = new Producto();
		producto2.setIdProducto(2L);
		producto2.setNombre("Producto 2");
		producto2.setNumPedido(1L);
		producto2.setPrecioSinIVA(200.0);
		
		ArrayList<Producto> productosList = new ArrayList<Producto>();
		productosList.add(producto1);
		productosList.add(producto2);
		
		Pedido pedido = new Pedido();
		pedido.setIdPedido(1L);
		pedido.setDestinarario("NTT Data");
		pedido.setDireccion("C/ de NTT Data");
		pedido.setProductosList(productosList);
		pedido.setFueraDePeninsula(false);
		
		for (Producto producto : pedido.getProductosList()) {
			System.out.println("Pedido fuera de peninsula: " + pedido.isFueraDePeninsula());
			System.out.println("Precio producto sin impuestos: " + producto.getPrecioSinImpuestos());
		}
		
		gestionPedidoImpl.getProductoConPVPCalculado(pedido);
		
		for (Producto producto : pedido.getProductosList()) {
			System.out.println("Pedido fuera de peninsula: " + pedido.isFueraDePeninsula());
			System.out.println("Precio producto sin impuestos: " + producto.getPrecioPVP());
		}
		
	}
	
	

}
