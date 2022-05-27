package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.bean.Venta;

public interface IVentaRepository extends JpaRepository<Venta,Long> {		
	
	List<Venta> findVentasByClienteNroDoc(String nro_documento);

}