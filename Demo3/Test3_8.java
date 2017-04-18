package Demo3;
//for嵌套  语句中还有语句
//循环嵌套
public class Test3_8 
{
	public static void main(String [] args)
	{
		for (int x = 0;x<3;x++)
		{
			for(int y = 0;y<4;y++) 
			{
				System.out.print("*");
				
			}
			
		System.out.println();//该语句只有一个功能就是换行
		
	}
		

	//嵌套循环的原理：形象说法：大圈套小圈
	for(int m=0;m<5;m++)   //m<5是因为外循环控制行数  一共5行
	{
		for (int n=0;n<m;n++)
		{
			System.out.print("*");
		
		}
	System.out.println();//控制换行
	}

}
}
/*
 * 对于打印长方形：外循环控制行数  即长方形有几行
 * 内循环控制的是每一行的列数  即一行中元素的数目
 * 
 * */

