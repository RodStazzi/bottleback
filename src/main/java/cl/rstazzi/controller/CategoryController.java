package cl.rstazzi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import cl.rstazzi.model.Category;
import cl.rstazzi.service.CategoryService;


@RestController
@RequestMapping("/api/v1/category")
public class CategoryController {

	@Autowired
	private CategoryService categoryService;
	
	@GetMapping
	@ResponseStatus(HttpStatus.OK)
	List<Category> findAll(){
		return categoryService.findAll();
	}
	
}
