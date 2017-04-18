package Demo3;

public class Test3_11 
{
	@SuppressWarnings("unused")
	public static void main(String[] args)
	{
		w:for(int x=0;x<3;x++)  //给循环起名字
		{
			q:for(int y=0;y<4;y++)  //给循环起名字
			{
				System.out.println("x="+x);
				break q;  //跳出的是当前循环
				//break w; //跳出的是整个循环
				//不给循环起名字      默认的是break放在哪   哪儿结束
				
				
			}
		}
	}

}
