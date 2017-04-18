package Demo4;
//数据排序练习
public class Test4_12 
{
	//有一个有序的数组  想要将一个元素插入  到该数组中   
	//还要保证该数组是有序的；
	public static void  main(String[] args)
	{
		int[] arr = {2,3,4,5,6,7,8,9,10,11,19,66,8787};
		
		int index = GetIndex(arr,1);
		System.out.print("index="+index);
		
	
	}
	
	public static int  GetIndex(int[] arr,int key)
	{
		int min = 0,max = arr.length-1,mid;
		while(min<=max)
		{
			mid = (max+min)>>1;
		
		if (key>arr[mid])
			mid = mid+1;
		else if (key<arr[mid])
			max = mid - 1;
		else 
			return mid;
		
		}
		return min;
		
		
	}
	
	
	
	

}
