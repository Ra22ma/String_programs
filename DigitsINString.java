import java.util.Scanner;
class DigitsINString 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string:");
		String s=sc.nextLine();
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			if(ch>='0'&&ch<='9')
			{
				System.out.println(ch);
			}
		}
		
	}
}
