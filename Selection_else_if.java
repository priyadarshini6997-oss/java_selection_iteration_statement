package com.index;

import java.util.Scanner;

public class Selection_else_if {

	public static void main(String[] args) {
		System.out.println("Enter the age");
		Scanner obj=new Scanner(System.in);
		int marks=obj.nextInt();
		if(marks>=90) {
			System.out.println("Grade A");
		}
		else if(marks>=80) {
			System.out.println("Grade B");
		}
		else if(marks>=70) {
			System.out.println("Grade c");
		}
		else if(marks>=60) {
			System.out.println("Grade d");
		}
		else if(marks>=50) {
			System.out.println("Grade e");
		}
		else {
			System.out.println("Fail");
		}

	}

}
