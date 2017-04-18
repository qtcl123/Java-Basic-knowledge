package Demo3;
//for语句练习

/*1 获取1~10的和并打印
 * 
 * */
public class Test3_6 
{
	public static void main(String[] args)
	{
		//1 定义一个变量  用于存储不断变化的和
		int sum = 0;
		//2 定义变量 记录不断变化的被加数
		int x = 0;
		//3 定义循环  重复加法过程
		while (x<=10000)
		{
			sum = sum + x;
			x++;
		}
		
		System.out.println("sum="+sum);   //打印所有的和
		//循环注意：一定要明确哪些语句需要参与循环    哪些不需要
		
		
		
		
		
		//用for来实现
		int Sum = 0;
		for (int y = 0;y<=10;y++)
		{
			Sum += y;
			
			
		}
		System.out.println("for Sum="+Sum);
		
		

	}

}










