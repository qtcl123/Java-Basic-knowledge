package Demo3;
//判断两个数是否相等；
public class Test3_16 
{
	public static void main(String [] args)
	{
		boolean r = Compare(3,445);
		System.out.println(r);
	
	}

	public static boolean Compare(int x,int y)
	{
		/*
		if (x%y==0)
		{
			return true;
	
		}
		else 
		{
			return false;

		}
		*/
		
		
		
		/*
		//三元运算符
		return (x==y)?true:false;
		*/
		
		return x==y;  //因为其结果直接是boolean
		
		
		
		
		
	}
}

//思路：
//1 明确功能的结果   结果是boolean
//2 功能是否有未知内容参与运算   有：两个整数








