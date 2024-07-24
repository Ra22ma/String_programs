import java.util.Arrays;
class LexographicalORAlphabeticalOrder
{
	public static void main(String[] args) 
	{
		String[]a={"ARUN","TARUN","KIRAN","KARAN"};
		for(int cycle=1;cycle<a.length;cycle++)
		{
			for(int i=0;i<a.length-1;i++)
			{
				if(a[i].compareTo(a[i+1])>0)
				{
					String temp=a[i];
					a[i]=a[i+1];
					a[i+1]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(a));
	}
}
