package Demo4;
//数组中的查找操作
public class Test4_9 
{
	
	//给定一个数    查找其在数组中的位置
	public static void main(String [] args)
	{
		int[] arr = {23,5,5,6,76,787,68,76,43,2,3412,432};
		int index = GetIndex(arr,111111);
		System.out.println("index="+index);
	
	}

	//定义功能  ：获取key第一次出现的元素的位置    如果返回值是-1    俺么代表key在数组中不存在；
	public static int GetIndex(int[] arr,int key)
	{
		for (int x=0;x<arr.length;x++)
		{
			if(arr[x] == key)
				return x;
			
		}
		
		return -1;//数组角标都是从0开始的   用-1标识   表示这个值不存在；
		
		
	
	}

}
