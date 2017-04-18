package Demo4;
//折半查找的第二种方式
public class Test4_11 
{
	public static void main(String[] args)
	{
		int[] arr = {2,3,4,5,6,7,8,9,10,19,66,8787};
		int f = HalfSearch(arr,5);
		System.out.println(f);
	
	}
	

	
	public static int HalfSearch(int[] arr,int key)
	{
		int min = 0,max = arr.length,mid;
		mid = (max+min)/2;
		
		while (min<=max)
		{
			
			mid = (max+mid)>>1;   //相当于取平均
		
		if(key>arr[mid])
		{
			min = mid+1;
		}
		else if (key<arr[mid])
			{
				max = mid-1;
			}
		else 
		{
			return mid;
			
		}
		
		}
		return -1;
		
		 	 
		

}
}
