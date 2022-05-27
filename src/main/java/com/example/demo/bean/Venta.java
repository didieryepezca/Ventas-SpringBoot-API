package com.example.demo.bean;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Venta {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)	
	public Long venta_UUID;
	public String nombre_cliente;
	public String nro_documento;
	public String forma_pago;
	public List<Producto> productos;
	
	public String getNombre_cliente() {
		return nombre_cliente;
	}
	public void setNombre_cliente(String nombre_cliente) {
		this.nombre_cliente = nombre_cliente;
	}
	public String getNro_documento() {
		return nro_documento;
	}
	public void setNro_documento(String nro_documento) {
		this.nro_documento = nro_documento;
	}
	public String getForma_pago() {
		return forma_pago;
	}
	public void setForma_pago(String forma_pago) {
		this.forma_pago = forma_pago;
	}
	public List<Producto> getProductos() {
		return productos;
	}
	public void setProductos(List<Producto> productos) {
		this.productos = productos;
	}
	public Long getVenta_UUID() {
		return venta_UUID;
	}
	public void setVenta_UUID(Long venta_UUID) {
		this.venta_UUID = venta_UUID;
	}
	
	
	
	
	
}