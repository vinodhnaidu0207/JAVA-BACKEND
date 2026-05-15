package com.flm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.flm.entity.Product;
import com.flm.repository.ProductRepository;

@Service
public class ProductService {
	
	@Autowired
	private ProductRepository productRepository;

	@Transactional
	public Product saveProduct(Product product) {
		return productRepository.save(product);
	}
	
	@Transactional
	public Product updateProduct(Product product) {
		return productRepository.save(product);
	}
	
	@Transactional
	public void deleteProduct(Long id) {
		productRepository.deleteById(id);
	}
	
	public List<Product> getAllProducts(){
		return productRepository.findAll();
	}
	
	public Product getProduct(Long id){
		return productRepository.findById(id).get();
	}
}
