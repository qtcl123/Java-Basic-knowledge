package Demo4;
//折半查找:可以提高效率
//需要是已经排序的数组！！！！


public class Test4_10 
{
	public static void main(String[] args)
	{
		int[] arr = {2,3,4,5,6,7,8,9,10,11,19,66,8787};
		int y = halfSearch(arr,4);
		System.out.println(y);
		
		
		}
	//折半查找的第一种方式；！！！！！
	
	public static int halfSearch(int[] arr,int key)
	{
		int min,max,mid;
		min = 0;
		max = arr.length;
		mid = (max + min)/2;
		
		while(arr[mid]!=key)
		{
			if(key>arr[mid])
			{
				min = mid + 1;
				
			}
			
			else if(key<arr[mid])
			{
				max = mid - 1;
				
			}
			
			if (min>max)
			{
				return -1;
			}
			mid = (max+mid)/2;   
			
		}
		return mid;
		
	}
	
		
	}
	
	

	
	
	
	

