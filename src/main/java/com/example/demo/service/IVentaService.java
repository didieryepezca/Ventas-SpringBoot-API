package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import com.example.demo.bean.Venta;

public interface IVentaService {	
	
	Venta addVenta(Venta venta);
	
	boolean deleteVenta(Long id);
	
	Venta editVenta(Long id, Venta ventaEdit);
	
	List<Venta> getVentasByClienteDoc(String nroDoc);
	
}
