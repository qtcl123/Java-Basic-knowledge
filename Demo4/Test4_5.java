package Demo4;
//排序——选择排序
//选择排序的特点：
//内循环结束一次 ：最值出现在头角标位置上
public class Test4_5 
{
	public static void main(String[] args)
	{
		int[] arr = {23,5,5,6,76,787,68,76,43,2,3412,432};
		//打印数组需要遍历！！！
		//排序前打印
		PrintArr(arr);
		
		//排序后打印
		System.out.println();
		ArrSort(arr);//当排序后    因为数组在堆内存中   因此会对数据进行更改
		PrintArr(arr);   
		
		
	}
	
	//排序函数
	public static void ArrSort(int[] arr)
	{
		for(int x=0;x<arr.length-1;x++)  //外循环在控制次数
		{
			for(int y=x+1;y<arr.length;y++)
			{
				if(arr[x]>arr[y])
				{
					int temp = arr[x];
					arr[x] = arr[y];
					arr[y] = temp;
			
				}
				
			}
			
		}
	}
	
	//打印数组函数
	public static void PrintArr(int[] arr)
	{
		for (int x=0;x<arr.length;x++)
		{
			System.out.print(arr[x]+",");
			
		}
	}
	
	
	

}
