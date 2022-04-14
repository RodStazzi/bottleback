package cl.rstazzi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import cl.rstazzi.model.Product;
import cl.rstazzi.service.ProductoService;

@RestController
@RequestMapping("/api/v1/product")
public class ProductController {

	@Autowired
	private ProductoService productService;

	@CrossOrigin(origins = "*")
	@GetMapping
	@ResponseStatus(HttpStatus.OK)
	public List<Product> findAll(){
		return productService.findAll();
	}

	@CrossOrigin(origins = "*")
	@GetMapping("/category/{category}")
	@ResponseStatus(HttpStatus.FOUND)
	public List<Product> findByCategory(int category){
		return productService.findByCategory(category);
	}

	@CrossOrigin(origins = "*")
	@GetMapping("/search/{name}")
	public ResponseEntity<?> search(@RequestParam String name){
		try {
			return ResponseEntity.status(HttpStatus.OK).body(productService.findByNameContaining(name));
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body(("{\"error\": \"" + e.getMessage() + "\"}"));
		}
	}
	

}
