import java.util.Scanner;
class  StringPalindrome
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		String rev="";
		for(int i=0;i<s.length();i++)
		{
			rev=s.charAt(i)+rev;
		}
		if(rev.equalsIgnoreCase(s))
		{
			System.out.println("String Palindrome");
		}
		else
		{
			System.out.println("Not a String Palindrome");
		}
	}
}
