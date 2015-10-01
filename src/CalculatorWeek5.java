import java.util.Scanner;
public class Calculator {

	public static void main(String[] args) {
		
		//Variables
		Scanner user_input = new Scanner(System.in);
		double fnum,snum,ans;
		int ch;
		
		//Options for user
		System.out.println("1.Addition");
		System.out.println("2.Subtraction");
		System.out.println("3.Multiplication");
		System.out.println("4.Divions");
		
		//If Conditional statement initializer + input
		System.out.print("Choose your operator:");
			ch= user_input.nextInt();
		System.out.println(" ");
		
		//Code for Addition
		if (ch==1){
			System.out.println("You choose to do Addition.");
			System.out.print("Enter first num: " \n);
			fnum = user_input.nextDouble();
			
			System.out.print("Enter second num: " \n)
			snum = user_input.nextDouble();
			
			ans = fnum + snum;
			System.out.println("Your number is : " + ans);
		}
		//Code for Subtraction
		else if (ch==2){
			System.out.println("You choose to do Subtraction.");
			System.out.print("Enter first num: " \n);
			fnum = user_input.nextDouble();
			
			System.out.print("Enter second num: " \n)
			snum = user_input.nextDouble();
			
			ans = fnum - snum;
			System.out.println("Your number is : " - ans);	
		}
		//Code for Multiplication
		else if (ch==3){
			System.out.println("You choose to do Multiplication.");
			System.out.print("Enter first num: " \n);
			fnum = user_input.nextDouble();
			
			System.out.print("Enter second num: " \n)
			snum = user_input.nextDouble();
			
			ans = fnum * snum;
			System.out.println("Your number is : " + ans);
		}
		//Code for Division
		else if (ch==4){
			System.out.println("You choose to do Division.");
			System.out.print("Enter first num: " \n);
			fnum = user_input.nextDouble();
			
			System.out.print("Enter second num: " \n)
			snum = user_input.nextDouble();
			
			ans = fnum / snum;
			System.out.println("Your number is : " + ans);
		}
		else
		{
			System.out.println("You must choose a number 1-4 in order for the calculator to work.");
		}
	}

}
