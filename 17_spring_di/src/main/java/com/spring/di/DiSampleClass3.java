package com.spring.di;

import java.util.List;
import java.util.Map;

// 컬렉션프레임워크 주입 예시

public class DiSampleClass3 {
	
	private List<String> testList;
	private Map<String , String> testMap;
	private Map<String , DiSampleClass1> testMapObj;
	
	public List<String> getTestList() {
		return testList;
	}
	public void setTestList(List<String> testList) {
		this.testList = testList;
	}
	public Map<String, String> getTestMap() {
		return testMap;
	}
	public void setTestMap(Map<String, String> testMap) {
		this.testMap = testMap;
	}
	public Map<String, DiSampleClass1> getTestMapObj() {
		return testMapObj;
	}
	public void setTestMapObj(Map<String, DiSampleClass1> testMapObj) {
		this.testMapObj = testMapObj;
	}
	
}
