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
import java.util.List;
import static org.mockito.Mockito.doReturn;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ApplicationTests {

	@Autowired
	private ProductServiceImpl productServiceImpl;

	@MockBean
	private ProductRepository productRepository;




	@Test
	@DisplayName("should display all products in your personal shopping list")
	void getFindAll() {

		String owner = "cosimo.t@live.de";

		Product product = new Product(1,"Banane",2,"cosimo.t@live.de",1);
		product.setOwner(owner);

		doReturn(List.of(product)).when(productRepository).findAll();
		var actual = productServiceImpl.findAll(owner);
		var expected = product;
		Assertions.assertSame(expected, actual);

	}

}