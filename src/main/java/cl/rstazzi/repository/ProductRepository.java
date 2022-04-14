package cl.rstazzi.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import cl.rstazzi.model.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {

	
	List<Product> findByNameContaining(String name);
	
	@Query(value = "SELECT p FROM Product p WHERE p.name LIKE %:filtro% OR p.discount LIKE %:filtro%")
	List<Product> search(@Param("filtro")String filtro);
	
	
	List<Product> findByCategory(int category);
	
}
