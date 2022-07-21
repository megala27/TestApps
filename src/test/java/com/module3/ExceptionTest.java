package com.module3;

public class ExceptionTest {

	public static void main(String[] args) {
		ExceptionTest obj = new ExceptionTest();
		obj.exceptionTest();
	}

	public void exceptionTest() {
		try {
			//int i = 100 / 0;
			//int num[] = {1,3,5,6};
			//System.out.println(num[5]);
			
		} catch (ArithmeticException e) {
			System.out.println("Arithmatic exception");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("arrayIOB exception");
		} catch (Exception e) {
			System.out.println("Exception");
		}

	}

}
