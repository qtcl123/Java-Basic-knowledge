package Demo4;
//冒泡排序
public class Test4_6 
{
	public static void main(String [] args)
	{
		int[] arr = {23,5,5,6,76,787,68,76,43,2,3412,432};
		//排序前打印
		PrintArr(arr);
		System.out.println();
		
		//排序后打印
		BubbleSort(arr);
		PrintArr(arr);
	
		
	}
	
	
	//特点：第一圈：最值出现在端口
	//速度最快的排序算法是希尔排序
	//在数据量很多时    需要考虑效率！！！！！
	
	
	//注意：在堆内存中换位置时   效率较低   消耗的内存大；
	//可以采取在栈内存中   先进行排序    然后传递给堆内存      只需要进行一次换位置！！！！
	
	
	
	
	
	//冒泡排序法
	public static void  BubbleSort(int[] arr)
	{
		for(int x=0;x<arr.length-1;x++)  //外层循环控制遍历的次数！！
		{
			//在此-x是为了让每一次参与排序的元素减少
			//-1是为了房防止角标越界！！！！！！！！！！！！
			for(int y=0;y<arr.length-x-1;y++)  //控制遍历的元素的个数！！！
			{
				if(arr[y]>arr[y+1])
				{
					int temp = arr[y];
					arr[y] = arr[y+1];
					arr[y+1] = temp;
				
				}
			}
			
		}
	}
	
	
	//打印数组的函数

	//打印数组函数
	public static void PrintArr(int[] arr)
	{
		for (int x=0;x<arr.length;x++)
		{
			System.out.print(arr[x]+",");
			
		}
	}
	
	
	
}
