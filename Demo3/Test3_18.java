package Demo3;
//函数练习
//1 打印一个矩形
public class Test3_18 
{
	public static void main(String[] args)
	{
		printJ(44,55);

	}
	
	//1 确定结果  没有  因为直接打印   所以返回值的类型是void
	//2 有未知内容吗？有  两个  因为矩形的行和列不确定；
	public static void printJ(int x,int y)
	{
		for (int t=0;t<x;t++)
		{
			for (int r=0;r<y;r++)
			{
				
				System.out.print("*");
				
			}
			System.out.println();
			
		}
	}

}
