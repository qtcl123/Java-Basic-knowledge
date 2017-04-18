package Demo6;
//静态代码块
public class Test6_6 
{
	
	public static void main(String[] args)
	{
		new StaticCode(); //看是否传递参数  而使用哪一个构造函数
		
	}

}



/*静态代码块
 * 格式：
 * static 
 * {
 * 	静态代码块中的执行语句
 * }
 * 
 * 特点：随着类的加载而执行    只执行一次  
 * 作用：用于给类进行初始化！！！！！！！！！！！！！！！！
 * 
 */
class StaticCode
{
	
	
	static   //静态代码块    给类初始化
	{
		System.out.println("a");
		
	}
	
	{   //构造代码块   用于给对象初始化   只要创建对象便会执行
		
		System.out.println("d");
		
	}
	
	 StaticCode (int x)  //给对应的对象初始化
	{
		System.out.println("c");
		
	}
	 StaticCode()
		{
			System.out.println("b");
			
		}
	
}





























































