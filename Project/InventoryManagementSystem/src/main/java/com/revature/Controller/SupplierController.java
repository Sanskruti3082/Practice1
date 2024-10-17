package com.revature.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.revature.Service.SupplierService;
import com.revature.model.Supplier;

@RestController
@RequestMapping("/api/suppliers")
public class SupplierController {
	
	@Autowired
	private SupplierService service;

	@PostMapping
	public Supplier creatSupplier(@RequestBody Supplier supplier) {
		return service.createSupplier(supplier);
	}
	
	@GetMapping
	public List<Supplier> getAllSuppliers(){
		return service.getAllSuppliers();
	}
	
	@GetMapping("/{id}")
	public Supplier getSupplierById(Long id) {
		return service.getSupplierById(id);
	}
	
	@PutMapping("/{id}")
	public Supplier updateSupplier(@PathVariable Long id, @RequestBody Supplier supplier) {
		return service.updateSupplier(id, supplier);
	}
	
	@DeleteMapping
	public void deleteSupplier(Long id) {
		service.deleteSupplier(id);
	}
}
