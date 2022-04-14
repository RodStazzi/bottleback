package cl.rstazzi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.rstazzi.model.Product;
import cl.rstazzi.repository.ProductRepository;

@Service
public class ProductServiceImp implements ProductoService {

	@Autowired
	ProductRepository productRepository;
	
	@Override
	public List<Product> findAll() {
		// TODO Auto-generated method stub
		return productRepository.findAll();
	}

	@Override
	public List<Product> findByNameContaining(String name) {
		// TODO Auto-generated method stub
		return productRepository.findByNameContaining(name);
	}

	@Override
	public List<Product> findByCategory(int category) {
		// TODO Auto-generated method stub
		return productRepository.findByCategory(category);
	}

//	@Override
//	public List<Product> findByName() {
//		// TODO Auto-generated method stub
//		return productRepository.findByName();
//	}

//	@Override
//	public	List<Product> search(String name) throws Exception {
//		try {
//			List <Product> products = productRepository.findByNameContaining(name);
//			return products;
//		} catch (Exception e) {
//			throw new Exception(e.getMessage());
//		}
//	}

}
