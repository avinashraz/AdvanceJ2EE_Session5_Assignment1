package com.assignment1.classes;



public class Square implements IntegerParameter {

	@Override
	public void number() {
		// TODO Auto-generated method stub
		System.out.println("Enter the Number to be squared");
		int i = scanner.nextInt();
		i =(int) Math.pow(i,2);
		System.out.println("The square of the number is: "+i);
	}

}
