package com.index;

import java.util.Scanner;

public class Selection_if_else {

	public static void main(String[] args) {
		System.out.println("Enter the age");
		Scanner obj=new Scanner(System.in);
		int age=obj.nextInt();
		if(age>=18) {
			System.out.println("Elegible to vote");
		}else {
			System.out.println("Not eliguble to vote");
		}
		

	}

}
