package com.nttdatacenters.springt2.arr.persistence;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Repositorio pedidos
 * 
 * @author Alexandra Rodríguez
 *
 */

@Repository
public interface PedidoRepositoryI extends JpaRepository <Pedido, Long>{
	
	/**
	 * Búsqueda Pedido por Id
	 * 
	 * @param id
	 * @return
	 */
	public List<Pedido> findById (final long id);

}
