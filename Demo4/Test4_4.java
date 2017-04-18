package Demo4;
//获取最值
public class Test4_4 
{
	public static void main(String[] args)
	{
		//获取数组中的最大值
		//思路：
		//1 获取最值需要进行比较 ，每一次比较都会有一个较大的值，因为该值不确定
		//2 让数组中的每一个元素均和这个变量进行比较：如果大于变量中的值，就用该值记录较大值
		//3 当所有的元素均比较完成，那么该变量中处存储的就是数组中最大的值
		
		
		//步骤：
		//1 定义变量 :初始化数组中的任意一个元素·即可
		//2 通过循环对数组进行遍历
		//3 在变量过程中定义判断条件，如果遍历的元素比变量中的大，就赋值给该变量
		
		//需要定义一个功能来实现    以便提高代码的复用性
		//1 明确结果：数组中元素最大值
		//2 未知内容  一个数组
		
		
		int[] arr ={23,5,5,6,76,787,68,76,43,2,3412,432};
		System.out.println(getMax(arr));
		System.out.print(getMin(arr));
		

	}
	
//数组求取最值时，可以初始化数组中的元素，也可以初始化数组中任意一个角标！！！！！！！
//两种初始化方式！！！！！
	//int   获取最大值
	public static int getMax(int[] arr)
	{
		int max = arr[0];
		for (int x=1;x<arr.length;x++)
		{
			if (arr[x]>max)
			{
				max = arr[x];
				
			}
			
		}
		return max;
		
	}
	
	
	//int 获取最小值
	public static int getMin(int[] arr)
	{
		int min = 0;
		for (int x=1;x<arr.length;x++)
		{
			if(arr[x]<arr[min])
			{
				min = x;
				
			}
		}
		return arr[min];
		
		
	}
	
	
	
	


	

}
