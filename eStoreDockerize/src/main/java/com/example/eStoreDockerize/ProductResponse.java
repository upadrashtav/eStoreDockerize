package com.example.eStoreDockerize;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@AllArgsConstructor
@RequiredArgsConstructor
public class ProductResponse {
	private List<Product> products;
	private String message;

}
