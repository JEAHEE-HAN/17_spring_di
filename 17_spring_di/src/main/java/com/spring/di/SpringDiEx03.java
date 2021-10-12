package com.spring.di;

import javax.inject.Inject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/*
 * #어노테이션을 이용한 객체 주입 예시
 * */

@Controller
public class SpringDiEx03 {

	@Autowired
	private Product product4;
	
	@Autowired
	private Product product5;
	
	@Inject
	private Product product6;
	
	@Autowired
	private ProductManagerEx2 pdMgr;
	
	@RequestMapping(value="springDiEx03" , method=RequestMethod.GET)
	public String springDiEx03() {
		
		System.out.println("\n springDiEx03 \n");
		pdMgr.setProduct(product4); 	// product2, product3
		pdMgr.printInfo();
		
		pdMgr.setProduct(product5); 	// product2, product3
		pdMgr.printInfo();
		
		pdMgr.setProduct(product6); 	// product2, product3
		pdMgr.printInfo();
		
		return "home";
	}
}
