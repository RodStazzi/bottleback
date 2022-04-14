package cl.rstazzi.service;

import java.util.List;

import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;

import cl.rstazzi.model.Product;

@Service
public interface ProductoService {

	public List<Product> findAll();
	List<Product> findByNameContaining(String name);
	List<Product> findByCategory(int category);
//	public List<Product> findByName();
}
