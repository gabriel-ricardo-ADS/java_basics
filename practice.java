


import java.util.Scanner;

class Practice {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num;
		double cube;
		
		System.out.print("Type a number: ");
		num = input.nextInt();
		
		cube = num * num * num;
		System.out.print("The cube of " + num + " is: " + cube);
	}
}





