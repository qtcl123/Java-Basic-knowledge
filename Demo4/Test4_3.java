package Demo4;
//数组操作
public class Test4_3 
{
	//注意：有数组的情况下一般采用for循环！！！！！！！！！！！！！
	//数组的操作
	//获取数组中的元素，通常会用到遍历
	public static void main(String[] args)
	{
		//int[] arr = new int[3];
		
		
		
		int sum = 0;
		int[] arr = {2,5,18,4,84,8,4,84};
		printArr(arr);
		System.out.println();
		for(int x = 0;x<arr.length;x++)//调用数组对应的属性方法length
		{
			System.out.println(arr[x]);
			sum += arr[x];
		
		}
		System.out.println(sum);
	
	}
	
	
	//定义一个功能：用于打印数组中的 元素     元素之间用逗号隔开
	public static void printArr(int[] arr)  //数组类型的参数！！！
	{
		for (int x=0;x<arr.length;x++)
		{
			if (x!=arr.length)
			{
			System.out.print(arr[x]+",");
			}
			else
			{
				System.out.print(arr[x]);
				
			}
			
			
		}
	}
	
	
	
	

}
