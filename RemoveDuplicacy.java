/*
java Task No. 1
Java Array Program to Remove Duplicates elements from
an Array
Example : -
Input : [1, 2, 2, 3, 3, 4, 5 ]
Output :[ 1, 2, 3, 4, 5 ]
*/
//this is proper remove duplicacy from sorted and unsorted array
import java.util.HashSet;
class RemoveDuplicacy
{
	public static void main(String ar[])
	{
		int[] a={1, 2, 2, 3, 3, 4, 5};
		HashSet<Integer> hs=new HashSet<>();
		for(int i=0;i<a.length;i++)
		{
			hs.add(a[i]);
		}
		for(int no:hs)
		{
			System.out.print(no+" ");
		}
	}
}

