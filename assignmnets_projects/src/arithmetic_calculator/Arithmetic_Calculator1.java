package arithmetic_calculator;

import java.util.*;
import java.util.Scanner;

public class Arithmetic_Calculator1 {

	public static int a = 0, b = 0;

	public static void main(String[] args) {

		System.out.println(" 				ARITHCAL           ");
//		boolean x = true;

		while (true) {
			Scanner op = new Scanner(System.in);
			System.out.println("1.  ADD\n2.  SUB\n3.  DIV\n4.  MODDIV\n5.  MUL\n6. Exit");
			System.out.println("Enter the requried calculation option:");
			int choice = op.nextInt();
//			System.out.println(choice);
			switch (choice) {
			case 1:
				add();
				break;
			case 2:
				sub();
				break;
			case 3:
				div();
				break;
			case 4:
				moddiv();
				break;
			case 5:
				mul();
				break;
			case 6:
				System.exit(1);
			default:
				System.out.println("Enter valid Option");
			}
//			reader.close();
//			reader.nextLine();
//			x = flowcheck(x);

		}
	}

//	private static boolean flowcheck(boolean x) {
//		System.out.println("Enter c -> continue\n    e->exit");
//		Scanner flow= new Scanner(System.in);
//		Character check =flow.next().charAt(0);
//		if(check == 'e') {
//			x=false;
//			}
//		flow.close();
//		return x;
//	}

	public static void assign() {

		Scanner sub = new Scanner(System.in);
		System.out.print("Enter 1st number :");
		a = sub.nextInt();
		System.out.print("Enter 2nd number :");
		b = sub.nextInt();
		sub.close();

	}

	private static void mul() {
		System.out.println(" 		MULTIPLICATION      ");
		assign();
		System.out.println("  " + a + "*" + b + "=" + (a * b));

	}

	private static void moddiv() {
		System.out.println(" 		MODULO DIVISION      ");
		assign();
		System.out.println("  " + a + "%" + b + "=" + (a % b));

	}

	private static void div() {
		System.out.println(" 		DIVISION      ");
		assign();
		System.out.println("  " + a + "/" + b + "=" + (a / b));

	}

	private static void sub() {
		System.out.println(" 		SUBTRACTION      ");
		assign();
		System.out.println("  " + a + "-" + b + "=" + (a - b));

	}

	private static void add() {
		System.out.println(" 		ADDITION      ");
		assign();
		System.out.println("  " + a + "+" + b + "=" + (a + b));
//		Scanner add = new Scanner(System.in);
//		assign();
//		int sum=a+b;
//		while(true) {
//			System.out.println("Do you want to add another element\n1.Yes 2.No");
//			int ch=add.nextInt();
//			if(ch==1) {
//				System.out.println("Enter the number for addition");
//				int c=add.nextInt();
//				sum+=c;
//				}
//			else {
//			break;
//		}
//			}
//		System.out.println(sum);
		
//		int sum = 0;
//		System.out.println("Enter a number (char to exti): ");
//		Scanner add = new Scanner(System.in);
//		while (add.hasNextInt()) {
//			int num = add.nextInt();
//			sum += num;
//			System.out.println("Enter a number (char to exti): ");
//		}
//		System.out.println(" 		     ADDITION             ");
//		System.out.println("sum of given numbers = " + sum);
//
//		add.close();
	}

}
