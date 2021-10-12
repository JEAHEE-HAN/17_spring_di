package com.spring.di.IoCEx;

import org.springframework.beans.factory.annotation.Autowired;

class ToBeDao{}

class ToBeService{
	
	@Autowired
	ToBeDao toBeDao;
	
}

class ToBeController{
	
	@Autowired
	ToBeService toBeService;
}


public class ToBe {
	
	// IoC 컨테이너에 의해서 TObeDao, ToBeService, ToBeController 객체가 생성 및 관리되며 
	// ToBeDao > ToBeService > ToBeController의 순서로 객체가 조립된다.
	@Autowired
	ToBeController tobeController;

}
