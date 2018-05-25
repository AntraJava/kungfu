package com.antra.kungfu;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

//@RunWith(SpringRunner.class)
//@SpringBootTest
public class KungfuApplicationTests {

	class Product {
		String model;
		String seril;

		public Product(String model, String seril) {
			this.model = model;
			this.seril = seril;
		}
	}
	@Test
	public void contextLoads() {
		List<Product> l1 = Arrays.asList(new Product("candy", "1234"), new Product("car", "4321"), new Product("model", ""));
		List<Product> l2 = Arrays.asList(new Product("candy", "1234"), new Product("car", "4321"), new Product("model", ""));

		for(int i = 0; i < l1.size(); i++) {
			Assert.assertEquals(l1.get(i).model, l2.get(i).model);
		}
	}

}
