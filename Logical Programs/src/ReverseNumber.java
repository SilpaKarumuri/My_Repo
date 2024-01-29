import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in); //Scanner is a class it will accept the value from the user at runtime
		
		   System.out.println("Enter a Number : ");
		
		int num = sc.nextInt(); //num = 1234 //nextInt() method accepts value from user and store in num variable
		
		int rev=0; //temp variable 
		
		
		 while(num!=0)
		{
			rev=rev*10 + num%10;  // 0*10 + 1234%10 = 0+4 = 4 ; 4*10+123%10 =43
			num = num/10; // 1234/10 = 123  ; 123/10 =12
		}
		
		System.out.println("reverse number is:" + rev);
		

	}

}
