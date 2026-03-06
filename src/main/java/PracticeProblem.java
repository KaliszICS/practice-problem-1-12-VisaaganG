import java.util.Scanner;
public class PracticeProblem {

	public static void main(String args[]) {
		q1();
		q2();
		q3();
		q4();
	}

	public static void q1() {
		//Write question 1 code here
		Scanner input = new Scanner(System.in);
		int num;
		System.out.print("Input an integer: ");
		num = input.nextInt();
		System.out.println(num + 3);
	}

	public static void q2() {
		//Write question 2 code here
		Scanner input = new Scanner(System.in);
		double num;
		String input1;
		System.out.print("Input a number: ");
		input1 = input.nextLine();
		input1 = input1 + "4";
		num = Double.parseDouble(input1) + 2;
		System.out.println(num);
	}

	public static void q3() {
		//Write question 3 code here
		Scanner input = new Scanner(System.in);
		double radius;
		int i;
		System.out.print("Input a radius: ");
		radius = input.nextDouble();
		i = (int)radius;
		System.out.println(i * i * 3.14);
	}

	public static void q4() {
		//Write question 4 code here
		Scanner input = new Scanner(System.in);
		double num;
		int num1;
		System.out.print("Input a number: ");
		num = input.nextDouble();
		num = num * 12;
		Math.floor(num);
		num = Math.floor(num);
		System.out.println(num);

	}

}
