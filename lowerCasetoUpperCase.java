import java.util.Scanner;
class lowerCasetoUpperCase 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String:");
		String s=sc.nextLine();
		 String newstring=s.toUpperCase();
		System.out.print(newstring);
		
	}
}
