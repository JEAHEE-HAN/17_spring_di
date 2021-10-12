package com.spring.di;

// 생성자 및 setter 주입 테스트 예시

public class DiSampleClass2 {
	
	private DiSampleClass1 diSampleClass1;
	
	public DiSampleClass2(DiSampleClass1 diSampleClass1) {
		this.diSampleClass1 = diSampleClass1;
	}
	public  void setData(DiSampleClass1 diSampleClass1) {
		this.diSampleClass1 = diSampleClass1;
	}
	public void print() {
		diSampleClass1.printInfo();
	}
}
