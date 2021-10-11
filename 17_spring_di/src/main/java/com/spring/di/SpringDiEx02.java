package com.spring.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/*

	# 의존성 주입(Dependency Injection)
	
	 	- '클래스간의 의존관계'를 IoC 컨테이너가 연결해주는 것
		- 컨테이너가 흐름의 주체가 되어 애플리케이션 코드에 의존관계를 주입해 주는 것이다.
		- 개발자들은 단지 설정파일 및 컴포넌트로 의존관계가 필요하다는 정보를 추가하면 된다.
	
		[동작과정]
		1) 구현 클래스의 정보를 xml(설정파일)에 기술 하거나 클래스에 어노테이션을 명시한다. 
		2) Framework(IoC Container)에서 설정파일을 읽거나 어노테이션을 읽어들인다. 
		3) 구현객체를 생성하며 서로 의존관계가 있는지 확인하여 객체를 연결한다.
	
	
			[의존관계 주입 어노테이션]
	 	@Autowired	: 스프링 어노테이션 , 타입에 맞추어서 연결	
	 	@Inject		: 자바 표준 어노테이션 , 타입에 맞추어서 연결 , Dependency추가 이후 사용 가능
	 	@Resource	: 자바 표준 어노테이션 , 이름에 맞추어서 연결
	
	
	
	# IoC(Inversion of Control) , IoC Container
	
		- 스프링 프레임워크는 객체에 대한 생성 및 생명주기를 관리할 수 있는 기능을 제공하고 있다.
		- IoC(제어권의 역전)이란, 객체의 생성, 생명주기의 관리까지 모든 객체에 대한 제어권(개발자 > 스프링 프레임워크)이 바뀌었다는 것을 의미한다.
		- 개발자들이 직접 POJO를 생성할 수 있지만 컨테이너에게 맡긴다.
		- IoC 컨테이너는 객체의 생성을 책임지고, 의존성을 관리한다.
		- 스프링 프레임워크에서 객체에 대한 생성 및 연결 및 생명주기를 관리할 수 있는 기능을 IoC 컨테이너를 이용하여 제공하고 있다.
		- POJO의 생성, 초기화, 서비스, 소멸에 대한 권한을 가지며 작업을 처리한다.

*/

@Controller
public class SpringDiEx02 {

	@RequestMapping(value="springDiEx02" , method=RequestMethod.GET)
	public String springDiEx02() {
		
		System.out.println("\n springDiEx02 \n");
		
		// classpath : src/main/resources
		ApplicationContext context = new GenericXmlApplicationContext("classpath:ProductApplicationContext.xml");
		
		// 방법1) .getBean("bean의 id값" , 클래스명.class) 메서드로 객체를 읽어온다.
		//ProductManagerEx2 pdMgr = context.getBean("pdMgr" , ProductManagerEx2.class);
		
		// 방법2) (형변환) .getBean("bean의 id값")
		//ProductManagerEx2 pdMgr = (ProductManagerEx2)context.getBean("pdMgr");
		
		// 방법3) 클래스가 유일한 경우만 id값을 생략할 수 있다.
		ProductManagerEx2 pdMgr = context.getBean(ProductManagerEx2.class);
		
	//	pdMgr.setProduct(context.getBean(Product.class)); -> Product는 유일한 클래스가 아니기 때문에 에러 발생
		
		pdMgr.setProduct(context.getBean("product1" , Product.class));
		pdMgr.printInfo();
		
		pdMgr.setProduct(context.getBean("product2" , Product.class));
		pdMgr.printInfo();
		
		pdMgr.setProduct(context.getBean("product3" , Product.class));
		pdMgr.printInfo();
		
		return "home";
		
	}
	
	
	
}
