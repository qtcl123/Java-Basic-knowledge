package Demo2;

public class Test2_8 
{
	public static void main(String[] args)
	{
		int x = 5;
		switch (x)
		{
		case 4:
			System.out.println("a");
			break;
		case 6:
			System.out.println("b");
			break;
		case 7:
			System.out.println("c");
			break;
		case 5:
			System.out.println("d");
			
		default:  //只有答案都不对 才会执行default
			System.out.println("e");
			break;//这个break可以不写出
			
			//switch结束：遇到break或者大括号结束！！！！！！！！！！！！！！！！！！！！！！
			
		
		}
	}

}
