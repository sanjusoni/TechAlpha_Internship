/*
Task 3

Java Array Program for Array Rotation

Input : arr [] = { 1, 2, 3, 4, 5, 6, 7 } , d=2

Explanation: d=2 so 2 elements are rotate to the end of the
array. 
So 1 2 is rotate back.

So, Final Output : 3, 4, 5, 6, 7, 1, 2
*/

public class RotateArrayElementsLeftToEnd
{
	public static void main(String ar[])
	{
		int[] arr=new int[] {1, 2, 3, 4, 5, 6, 7};
		int d=2;
		
		for(int i=0;i<d;i++)
		{
			int first=arr[0],j;
			for(j=0;j<arr.length-1;j++)
			{
				arr[j]=arr[j+1];
			}
			arr[j]=first;
		}
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		
	}
}