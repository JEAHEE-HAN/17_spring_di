package com.spring.di;

import org.springframework.stereotype.Component;

/*

# POJO (Plain Old Java Object) 

	- EJB(Enterprise JavaBeans) 등에서 사용되는 Java Bean이 아닌 Getter 와 Setter 로 구성된 가장 순수한 형태의 기본 클래스 
	- Spring에서 핵심적인 부분을 구성하는 가장 기본적인 요소로 사용
	- 스프링의 오브젝트 생성 및 사용하는 대표적인 방법이 xml에 명시하는 방법과 @Component로 등록시키는 2가지 방법이 있다.
	- Component를 통하여 xml파일에 명시하지 않고 Component-scan으로 객체의 주입이 가능하다.
	- Component("이름")를 통하여 빈 이름(id)를 지정할 수 있다.
	- Component("이름)을 생략할 경우 클래스의 앞글자를 소문자로 변경하여 이름이 지정된다.
	   Ex) Product > @Component("product")
	       Goods   > @Component("goods")

*/

@Component
public class Product {
	
	private String pdCd 	= "상품코드";
	private String pdNm 	= "상품이름";
	private String deptCd 	= "부서코드";
	private String deptNm 	= "부서이름";
	private String mgrNm 	= "담당자이름";
	
	public String getPdCd() {
		return pdCd;
	}
	public void setPdCd(String pdCd) {
		this.pdCd = pdCd;
	}
	public String getPdNm() {
		return pdNm;
	}
	public void setPdNm(String pdNm) {
		this.pdNm = pdNm;
	}
	public String getDeptCd() {
		return deptCd;
	}
	public void setDeptCd(String deptCd) {
		this.deptCd = deptCd;
	}
	public String getDeptNm() {
		return deptNm;
	}
	public void setDeptNm(String deptNm) {
		this.deptNm = deptNm;
	}
	public String getMgrNm() {
		return mgrNm;
	}
	public void setMgrNm(String mgrNm) {
		this.mgrNm = mgrNm;
	}
	

}
