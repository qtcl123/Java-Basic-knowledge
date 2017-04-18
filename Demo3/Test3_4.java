package Demo3;
//for和while的区别
public class Test3_4 
{
	public static void main(String[] args)
	{
		//用for来实现
		for(int x = 0;x<3;x++)
		{
			System.out.println("x="+x);
			
		}
//System.out.println("x====="+x);该句语句是错的    
//因为x时局部变量   只在for中有效   当for循环结束后   x在内存中消失
//注：如果变量只是为了控制循环的次数  为了节约内存    建议使用for循环
		
	
		
		
		

		//用while来实现
		int y = 0;
		while (y<3)
		{
			System.out.println("y="+y);
			y++;
			
		}
		System.out.println("y====="+y);  //该语句正确 
		//当在while中循环结束后    变量依然存在于内存中
		
		
		/*
		 *变量存在自己的作用域    for 和while可以进行互换
		 *
		 *
		 *总结：使用 循环的情景：
		 *当要对语句执行很多次时   使用循环结构
		 *
		 *
		 * 
		 * */
		
		
		
	}
}




