package com.spring.di.interfaceEx;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import com.sun.javafx.collections.MappingChange.Map;


/*
 * 
 * - 클래스가 구현한 인터페이스의 타입의 참조형으로 이를 구현한 클래스의 객체를 생성할 수 있다.
 * - 인터페이스를 자료형으로 작성할 경우 프로그램은 더욱 유연해진다.
 * - 스프링에서 이 개발방법을 지향하고 있다.
 * 
 *  [ 예시 ]
 *  
 *   List<Object> temp1 = new ArrayList<Object>();
 *   List<Object> temp2 = new Vector<Object>();
 *   
 *   Map<Object,Object> temp3 = new HashMap<Object, Object>();
 *   Map<Object,Object> temp4 = new TreeMap<Object, Object>();
 *   
 * */

interface Person{}


class Manager implements Person{}
class Boss implements Person{}
class Employee implements Person{}

public class Main {

	// 클래스 타입 참조형 객체 생성 방법
//	Manager manager = new Manager();
//	Boss boss = new Boss();
//	Employee employee = new Employee();
	
	// 인터페이스 타입 참조형 객체 생성 방법
	Person employee = new Employee();
	Person manager  = new Manager();
	Person boss     = new Boss();
	
	Person person = new Manager(); //new Employee(); // new Boss();
	
	ArrayList<Boss> temp1 = new ArrayList<Boss>();
	List<Boss> temp2 = new ArrayList<Boss>();
	
	HashMap<String , Manager> temp3 = new HashMap<String, Manager>();
	java.util.Map<String,Manager> temp4 = new HashMap<String,Manager>();
	
	


}
