import java.util.Scanner;
class ReverseofString  
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String:");
		String s=sc.nextLine();
		String ans="";
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			ans=ch+ans;
		}
		System.out.print(ans);

	}
}
