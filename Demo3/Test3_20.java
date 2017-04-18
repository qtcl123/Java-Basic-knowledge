package Demo3;
//函数的重载
//注意在同一个类中
//只考虑参数列表！！！！！！！！！
//注意参数具有顺序！！！！！！
//例如int a ,char b,int c与int a , int b,char c不一样
public class Test3_20 
{
	public static void nain(String[] args)
	{

		int t = add(4,4);
		System.out.println(t);
	
	}
	//定义一个加法运算  获取两个数的和
	public static int add(int a,int b)
	{
		return a+b;
	
	}
	
	//定义一个加法运算  获取三个数的和
	public static int add(int a,int b,int c)
	{
		return a+b+c;
		
	}

}
