package com.spring.di;

import org.springframework.stereotype.Component;

@Component
public class ProductManagerEx3 {

	Product product;
	
	// 생성자를 통하여 외부에서 생성된 객체를 주입한다. 결합력(의존성)이 약하다.
	ProductManagerEx3(Product product) {
		this.product = product;
	}
	
	void printInfo() {
		System.out.println("pdCd : "   + product.getPdCd());
		System.out.println("pdNm : "   + product.getPdNm());
		System.out.println("deptCd : " + product.getDeptCd());
		System.out.println("deptNm : " + product.getDeptNm());
		System.out.println("mgrNm : "  + product.getMgrNm());
		System.out.println();
	}
	
}
