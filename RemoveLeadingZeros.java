/*
Java String Program to Remove leading
zeros
Input : 00000123789
Output : 123789
*/
public class RemoveLeadingZeros
{
	public static void main(String ar[])
	{
	 String str="00000123789"; 
	 String ansString="";
	 for(int i=0;i<str.length();i++)
	 {
		 if(str.charAt(i)=='0')
			 continue;
		 else
		 {
			 ansString=str.substring(i);
			 break;
		 }
	 }
	 System.out.print(ansString);
	}


}