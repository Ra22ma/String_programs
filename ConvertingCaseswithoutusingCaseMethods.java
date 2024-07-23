import java.util.Scanner;
class ConvertingCaseswithoutusingCaseMethods
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		String ans="";
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			if(ch>='a'&&ch<='z')
			{
				ans=ans+(char)(ch-32);
			}
			else
			{
				ans=ans+ch;
			}
		}
		System.out.print(ans);
	}
}
