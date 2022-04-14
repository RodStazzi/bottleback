package cl.rstazzi.service;

import java.util.List;

import org.springframework.stereotype.Service;

import cl.rstazzi.model.Category;

@Service
public interface CategoryService {

	List<Category> findAll();

}
