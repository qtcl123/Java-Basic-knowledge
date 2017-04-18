package Demo4;
import java.util.*;
//在Java中使用包！！
public class Test4_7 
{
	public static void main(String[] args)
	{
		int[] arr = {23,5,5,6,76,787,68,76,43,2,3412,432};
		Arrays.sort(arr);
		PrintArr(arr);
		
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
//有时间可以考虑一些其他的排序算法































































