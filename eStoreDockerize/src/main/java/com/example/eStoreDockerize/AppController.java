package com.example.eStoreDockerize;

import java.util.Arrays;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/app")
public class AppController {

	@GetMapping("/welcome")
	public String welcome() {
		return "<h3>Welcome To SpringBoot Docker</h3>";
	}
	
	@GetMapping("/products")
    public ResponseEntity<ProductResponse> getProducts() {
        // Your business logic to fetch the list of products
        // Simulate some data
        List<Product> products = Arrays.asList(
                new Product( "Product A", 800),
                new Product("Product B", 900)
        );
        // Create a ProductResponse with the list of products, a message, and a status
        ProductResponse productResponse = new ProductResponse(products, "Products retrieved successfully.");
        // Return ResponseEntity with the ProductResponse and OK status
        return new ResponseEntity<>(productResponse, HttpStatus.OK);
    }
}
