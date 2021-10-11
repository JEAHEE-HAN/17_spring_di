package com.spring.di;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class SpringDiEx01 {

	@RequestMapping(value="springDiEx01" , method=RequestMethod.GET)
	public String springDiEx01() {
		
		System.out.println("\n springDiEx01 \n");
		
		// 일체형 객체 생성 예시
		ProductManagerEx1 pm1 = new ProductManagerEx1();
		pm1.printInfo();
		
		// setter 메서드를 이용한 객체 주입 예시
		Product product = new Product();
		ProductManagerEx2 pm2 = new ProductManagerEx2();
		pm2.setProduct(product);
		pm2.printInfo();
		
		// 생성자를 이용한 객체 주입 예시
		product = new Product();
		ProductManagerEx3 pm3 = new ProductManagerEx3(product);
		pm3.printInfo();
		
		return "home";
	}
}
