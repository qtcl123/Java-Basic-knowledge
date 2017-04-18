package Demo3;
//do while
public class Test3_2 {
	
	public static void main(String [] args)
	{
		int x = 9;
		int y = 1;
		
		do 
		{
			System.out.println("do:的循环结果x = "+x);
			x++;
				
		}
		while (x<3);
		/**
		 * while 先判断条件  只有在条件满足时才执行 循环体
		 * do while 先执行循环体   条件满足再执行循环体		 * 
		 * 
		 * 
		 * 
		 */
		
		while(y<3)  //注意在这个地方没有分号   
		{
			System.out.println("y = :"+y);
			y++;
			
		}
		
		
	}
	

}



