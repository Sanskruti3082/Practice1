package com.revature.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.revature.model.Product;

import com.revature.repository.ProductRepo;

@Service
public class ProductService {

	@Autowired
	private ProductRepo repo;
	
	//createproduct
	public Product createProduct(Product product) {
		return repo.save(product);
	}
	
	//to get all products
	public List<Product> getAllProducts(){
		return repo.findAll();
	}
	
	//get product by id
	public Product getProductById(Long id) {
		return repo.findById(id).orElse(null);
	}
	
	//delete product
	public void deleteProductById(Long id) {
		repo.deleteById(id);
	}
	
	public Product updateProduct(Long id,Product productDetails) {
		Product product = repo.findById(id)
                .orElseThrow(() -> new RuntimeException("Product not found with id: " + id));

			
			product.setName(productDetails.getName());
			product.setPrice(productDetails.getPrice());
			product.setQuantity(productDetails.getQuantity());
		
			return repo.save(product);
		
	}
	
	// Method to check low stock
    public List<Product> getLowStockProducts(int threshold) {
        return repo.findAll().stream()
            .filter(product -> product.getQuantity() < threshold)
            .toList();
    }

}
