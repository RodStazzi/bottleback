package cl.rstazzi.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "product")
@Getter
@Setter
public class Product {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	private String name;
	private String url_image;
	private Float price;
	private int discount;
	private int category;
	
//	@ManyToMany
//	@JoinTable(name = "PRODUCT_CATEGORY_LIST",
//				joinColumns = @JoinColumn(name = "FK_PRODUCT", nullable = false),
//				inverseJoinColumns = @JoinColumn(name = "FK_CATEGORY", nullable = false)
//				)
//	private Set<Category> categoryList;
}
