import java.util.Scanner;
class ReverseofString1
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		String[]a=s.split(" ");
		for(int i=0;i<a.length;i++)
		{
			String rev=" ";
			for(int j=0;j<a[i].length();j++)
			{
				rev=a[i].charAt(j)+rev;
			}
			System.out.print(rev+" ");
		}
		System.out.println();
	}
}
