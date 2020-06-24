package com.DesiginingAMenu;

import java.util.Scanner;

public class MenuRunner {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter number1: ");
		System.out.println("enter number2: ");
		System.out.println("enter number3: ");
		
		int number1 = scanner.nextInt();
		int number2 = scanner.nextInt();
		int number3 = scanner.nextInt();
		
		System.out.println("The Number You Have Entered is - " +number1);
		System.out.println("The Number You Have Entered is - " +number2);
		System.out.println("The Number You Have Entered is - " +number3);
		
		System.out.println("choices available are");
		System.out.println("1-add");
		System.out.println("2-subtract");
		System.out.println("3-divide");
		System.out.println("4-multiply");
		
		System.out.println("Enter Choice  ");
		int choice=scanner.nextInt();
		System.out.println("the choice you have entered is "+choice);
		if(choice==1) {
			System.out.println("the result is"+(number1+number2+number3));
			
		}
		else if(choice==2) {
			System.out.println("the result is"+(number1-number2-number3));
		}
		else if(choice==3) {
			System.out.println("the result is"+(number1/number2/number3));
		}
		else  {
			System.out.println("the result is"+(number1*number2*number3));
		}
		
		

	}

}
