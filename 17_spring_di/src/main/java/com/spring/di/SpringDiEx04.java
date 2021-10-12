package com.spring.di;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.inject.Inject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;



@Controller
public class SpringDiEx04 {
	
	@Autowired
	DiSampleClass1 diSampleClass1_1;
	
	@Inject
	DiSampleClass1 diSampleClass1_2;	

	@Resource(name="resourceTester")
	DiSampleClass1 diSampleClass1_3;	
		
	
	@Autowired
	DiSampleClass2 diSampleClass2_1;
	
	@Autowired
	DiSampleClass2 diSampleClass2_2;
	
	@Autowired
	DiSampleClass2 diSampleClass2_3;

	
	@Autowired
	DiSampleClass3 diSampleClass3;
	
	@RequestMapping(value = "/springDiEx04" , method = RequestMethod.GET)		
	public String springDiEx05(Model model) {
		
		System.out.println("\n springDiEx04 \n");
		
		// 기본 모델 주입 예시
		diSampleClass1_1.printInfo();
		diSampleClass1_2.printInfo();
		diSampleClass1_3.printInfo();
		System.out.println();
				
		
		// 생성자 및 setter 주입 예시
		diSampleClass2_1.print();
		diSampleClass2_2.print();
		diSampleClass2_3.print();
		System.out.println();
		
		
		// 컬렉션 프레임워크 주입 예시
		List<String> t3List = diSampleClass3.getTestList();
		for (String data : t3List) {
			System.out.println(data);
		}
		System.out.println();
		
		Map<String , String> t3Map = diSampleClass3.getTestMap();
		for(String key : t3Map.keySet()) {
			System.out.println(key + " : " +   t3Map.get(key));
		}
		System.out.println();
		
		Map<String , DiSampleClass1> t3MapObj = diSampleClass3.getTestMapObj();

		for (String key : t3MapObj.keySet()) {
			t3MapObj.get(key).printInfo();
		}
		
		return "home";
	}
	
	
}
