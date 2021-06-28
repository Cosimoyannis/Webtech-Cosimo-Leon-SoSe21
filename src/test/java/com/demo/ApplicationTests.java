package com.demo;
import com.example.springboot.Product;
import com.example.springboot.ProductRepository;
import com.example.springboot.ProductServiceImpl;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.security.core.parameters.P;

import java.util.List;
import static org.mockito.Mockito.doReturn;

@SpringBootTest
class ApplicationTests {

	@Autowired
	private ProductServiceImpl service;

	@MockBean
	private ProductRepository repository;




	@Test
	@DisplayName("should display all products in your personally shopping list")
	void getFindAll() {

		String owner = "cosimo.t@live.de";

		Product product = new Product(1,"Banane",2,"cosimo.t@live.de",1);
		product.setOwner(owner);

		doReturn(List.of(product)).when(repository).findAll();
		var actual = service.findAll(owner);
		var expected = product;
		Assertions.assertSame(expected, actual);

	}

	@Test
	@DisplayName("should find products by owner's email")
	void testFindByOwnerEmail() {
		var p1 = new Product(1,"Banane",2,"cosimo.t@live.de",1);
		p1.setOwner("cosimo.t@live.de");
		var p2 = new Product(1,"Banane",2,"cosimo.t@live.de",1);
		p2.setOwner("example@example.de");
		doReturn(List.of(p1, p2)).when(repository).findAll();

		List<Product> products = service.findAll("cosimo.t@live.de");

		Assertions.assertSame(products.size(), 1, "The number of products returned was wrong");
		Assertions.assertSame(products.get(0).getName(), "Banane", "The wrong product was returned");
	}

}