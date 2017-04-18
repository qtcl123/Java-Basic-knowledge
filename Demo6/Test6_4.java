package Demo6;
//静态的应用
//案例一
public class Test6_4 
{
	public static void  main(String[] args)
	{
		int[] arr = {3,4,6,77,78,8};
		int max = GetMax(arr);
		System.out.println("max="+max);
		
	}
	
		
	
	
	
	
	public static int GetMax(int[] arr)   //构造一个函数   便于以后的调用
	
	{
		int max = 0;
		for (int x=0;x<arr.length;x++)
	{
		if(arr[x]>arr[max])
		{
			max = x;
			
		}
		
		
	}
		return arr[max];
	}
	
	
	}


