package com.example.demo.controllers;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.bean.*;
import com.example.demo.service.VentaService;

@RestController
@Controller
@RequestMapping("/ventas")
public class VentasController {
	
	
	@RequestMapping(value="/persona", method = RequestMethod.GET)
	public Persona obtenerPersona(HttpServletRequest request) {		
		Persona p = new Persona();			
		p.setNombre("Didier");
		p.setApellidos("Yepez Cabanillas");
		p.setDocumento("71889573");
		
		return p;		
	}
	
	/*
	 * private final VentaService _ventaService;
	 * 
	 * public VentasController(VentaService ventaService) { this._ventaService =
	 * ventaService; }
	 * 
	 * @PostMapping(value="/create") public ResponseEntity addVenta(@RequestBody
	 * Venta venta) { return new ResponseEntity(_ventaService.addVenta(venta),
	 * HttpStatus.CREATED); }
	 * 
	 * @DeleteMapping("/delete/{id}") public ResponseEntity
	 * eliminarVenta(@PathVariable("id") Long id) { boolean rsp =
	 * _ventaService.deleteVenta(id); if(rsp == true) { return new
	 * ResponseEntity(HttpStatus.OK); }else { return new
	 * ResponseEntity(HttpStatus.NOT_FOUND); } }
	 * 
	 * @PutMapping("/edit/{id}") public ResponseEntity
	 * editarVenta(@PathVariable("id") Long id, Venta venta) { return new
	 * ResponseEntity(_ventaService.editVenta(id, venta), HttpStatus.CREATED); }
	 * 
	 * @GetMapping("/getbynrodoc/{nrodoc}") public ResponseEntity
	 * getVentasbyClienteDoc(@PathVariable("nrodoc") String nroDoc) { return new
	 * ResponseEntity(_ventaService.getVentasByClienteDoc(nroDoc), HttpStatus.OK); }
	 */
}