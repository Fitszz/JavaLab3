import java.util.Scanner;

interface Student
{
	public void Mark();
}

class Grade implements Student 
{
	private double sum;
	
	public void Mark()
	{
		sum = 0;
		for (int i = 1; i<= 5; i++)
		{
			Scanner scan = new Scanner(System.in);
			System.out.print("Please enter mark: ");
			double mark = scan.nextDouble();
			sum += mark;
		}
		System.out.println("Average mark is " + (sum / 5));
	}
}

class Main
{
	public static void main(String[]args)
	{
		Grade gd = new Grade();
		gd.Mark();
	}
}