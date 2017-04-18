package Demo5;
//构造代码块
public class Test5_5 
{
	public static void main(String[] args)
	{
		persion1 p3 = new persion1();
		persion1 p4 =  new persion1();
		
		
	}

}

class persion1
{
	//构造代码块 中定义的是不同对象的初始化内容！！！！！！！！！！！
	//作用 ：给对象进行初始化  
	//对象一建立就运行  而且优先于 构造函数执行
	//和构造函数的区别：构造代码块是给所有的对象统一初始化 
	//而构造函数是给对应的对象初始化 
	
	{
		
		System.out.println("Persion code run");
		
	}
}
