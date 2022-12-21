package com.nttdatacenters.springt2.arr.persistence;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Repositorio Productos
 * 
 * @author Alexandra Rodríguez
 *
 */
public interface ProductoRepositoyI extends JpaRepository<Producto, Long>{

/**
 * Búsqueda de productos por ID
 * 
 * @param id 
 * @return
 */
	public List<Producto> findById (final long id);



}
