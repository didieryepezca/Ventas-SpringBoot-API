package com.example.demo.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.bean.Venta;
import com.example.demo.repository.IVentaRepository;

@Service
public class VentaService implements IVentaService{

	private final IVentaRepository _ventaRepository;

    @Autowired
    public VentaService(IVentaRepository ventaRepository){
       this._ventaRepository = ventaRepository;
    }
	
	@Override
	public Venta addVenta(Venta venta) {
		return _ventaRepository.save(venta);
	}

	@Override
	public boolean deleteVenta(Long id) {
		try {			
			_ventaRepository.deleteById(id);
			return true;
		}catch(Exception e) {			
			return false;
		}
	}

	@Override
	public Venta editVenta(Long id, Venta ventaEdit) {		
		Venta ventaObtained = _ventaRepository.getById(id);		
		ventaObtained.setNombre_cliente(ventaEdit.getNombre_cliente());
		ventaObtained.setForma_pago(ventaEdit.getForma_pago());			
		return _ventaRepository.save(ventaObtained);
	}

	@Override
	public List<Venta> getVentasByClienteDoc(String nroDoc) {
		return _ventaRepository.findVentasByClienteNroDoc(nroDoc);
	}	
}