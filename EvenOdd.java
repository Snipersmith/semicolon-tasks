import java.util.Scanner;
public class EvenOdd{
 public static void main(String [] args){
	Scanner Scanner = new Scanner (System.in);
	 System.out.print("Enter any number");
	int number = Scanner.nextInt();
	if(number % 2 ==0){
	 System.out.println("Even number");
      }
	else if(number % 2 ==1){
	 System.out.println("Odd number");
	}

	else{
	 System.out.println("Invalid");
	}
}
}