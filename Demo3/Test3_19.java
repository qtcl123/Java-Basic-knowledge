package Demo3;
//打印九九乘法表
public class Test3_19 
{
	public static void main(String[] args)
	{
		jiujiu();
		
	}
	//分析需求
	//1 输出为一个九九乘法表
	//2 没有未知数输入
	public static void jiujiu()
	{
		for (int x=1;x<=9;x++)
		{
			for (int y=1;y<=x;y++)
			{
				System.out.print(x+"*"+y+"="+x*y+"\t");
				
				
			}
			System.out.println();
			
		}
	}
	

}
