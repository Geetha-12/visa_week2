package com.visa.prj.client;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.visa.prj.entity.Product;
import com.visa.prj.service.OrderService;

public class OrderClient {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
		// ApplicationContext ctx = new ClassPathXmlBeanApplicationContext("beans.xml");
		ctx.scan("com.visa");
		ctx.refresh();
		
		String[] names = ctx.getBeanDefinitionNames();
		for (String name : names) {
			System.out.println(name);
		}
		
		OrderService service = ctx.getBean("orderService",OrderService.class);
		Product p = new Product(0, "Camlin Marker", "stationery",120,5000);
		service.addProduct(p);
		}

}
