package Demo6;
//对象初始化过程
//演示对象调用过程
//方法区优先于对象处在  ，类加载后    先在在方法区中存放静态变量  和成员方法


//注意非静态方法调用的过程
//在栈内存中间当调用 setName时   注意在栈内存中存在两个变量  this和name   this表示调用该函数的对象名
//因此当那哪个对象调用成员方法      那么this和对象m一样   均指向在堆内存中开辟的空间
public class Test6_7 
{
	public static void  main(String[] args)
	{
		matlab m = new matlab("张三",20);
		m.setName("Taven");
		
		
	}

}



class matlab
{
	private String name = "haha";
	private int age;
	private static String country = "cn";  //存在方法区	
	matlab(String name,int age)
	{
		this.name = name;
		this.age  =age;
		
	}
	
	{
		System.out.println(this.name+".."+this.age);
		
	}
	
	public static void showCountry()   //存在方法区	
	{
		System.out.println("country="+country);
		
	}
	
	
	public void setName(String name)  //存在方法区	
	{
		this.name = name;
		
	}
	

	public static void method()
	{
		System.out.println("method run");
	}
	
	
	
}
//静态成员属性和方法相互调用时省略的是 类名    因为均在方法区
//非静态成员属性和方法调用时省略的是 对象名 this






/*matlab m = new matlab("张三",20);现在开始描述这句话在内存中的运行情况
 * 1 因为new用到了matlab class 所以会先找到matlab class文件并且加载到内存中
 * 2 执行该类中的静态代码块  如果存在  则给matlab class类进行初始化
 * 3 在堆内存中开辟地址    分配内存地址
 * 4 在堆内存中建立对象的特属性   并进行默认初始化 
 * 5 对属性进行显示初始化  
 * 6 对对象进行构造代码块初始化  
 * 7 将内存地址赋栈内存中的p变量
 * 
 * */



