package Demo4;
//数组练习
public class Test4_13 
{
	
	public static void main(String [] args)
	{
		Tobin(6);
		System.out.println();
		ToBin(33);
		
	}
	
	
	//十进制——>二进制
	//方式一：
	public static void Tobin(int num)
	{
		while (num>0)
		{
			System.out.print(num%2);
			num = num/2;
			
		}
	}
	
	
	//方式二
	public static void ToBin(int num)
	{
		StringBuffer sb = new StringBuffer();  //定义一个存储数据的容器
		while (num>0)
		{
			sb.append(num%2);
			num = num/2;
			
		}
		
		System.out.print(sb.reverse());  //反转的功能——需要的结果
		
		
		
		
	}
	
	
	
	
	
	
	

}
