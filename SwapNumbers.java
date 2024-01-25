import java.util.Scanner;

public class SwapNumbers {

	public static void main(String[] args) 
	{
	    System.out.println("Enter the numbers");
		Scanner sc = new Scanner(System.in);
		
		int x=sc.nextInt();
		int y=sc.nextInt();
		System.out.println("Before swapping ");
		System.out.println("first = "+x+", second = "+y);
		x=x^y;
		y=x^y;
		x=x^y;
		System.out.println("After swapping ");
		System.out.println("first = "+x+", second= "+y);
	}

}
