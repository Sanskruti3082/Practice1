package com.revature.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.revature.model.Category;
import com.revature.model.Product;
import com.revature.repository.CategoryRepo;

@Service
public class CategoryService {

	@Autowired
	private CategoryRepo repo;
	
	//create category
	public Category createCategory(Category category) {
		return repo.save(category);
	}
	
	//get all category
	public List<Category> getAllCategories(){
		return repo.findAll();
	}
	
	//get category by id
	public Category getCategoryById(Long id) {
		return repo.findById(id).orElse(null);
	}
	
	//delete category
	public void deleteCategory(Long id) {
		repo.deleteById(id);
	}
	
	//update category
	public Category updateCategory(Long id, Category categoryDetails) {
		Category category = repo.findById(id)
                .orElseThrow(() -> new RuntimeException("Product not found with id: " + id));

		category.setName(categoryDetails.getName());
		return repo.save(category);
	}
	
}
