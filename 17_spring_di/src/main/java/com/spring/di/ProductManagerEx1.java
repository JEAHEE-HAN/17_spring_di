package com.spring.di;

import org.springframework.stereotype.Component;

@Component
public class ProductManagerEx1 {

	// 객체가 생성됨과 동시에 클래스 내부에서 다른 객체를 생성한다. > 결합력(의존성)이 강하다.
	Product product = new Product();
	
	void printInfo() {
		System.out.println("pdCd : " + product.getPdCd());
		System.out.println("pdNm : " + product.getPdNm());
		System.out.println("deptCd : " + product.getDeptCd());
		System.out.println("deptNm : " + product.getDeptNm());
		System.out.println("mgrNm : " + product.getMgrNm());
		System.out.println();
	}
}
