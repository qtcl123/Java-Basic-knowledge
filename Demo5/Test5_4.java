package Demo5;
//构造函数作用：可以用于给对象进行初始化
//void ：是函数的一种返回值类型   代表没有具体结果返回的情况  
//构造函数不用定义返回值类型
//构造函数的小细节：当一个类中没有定义构造函数时 那么系统会默认给该类加上一个空参数的构造函数
//形式为：persion（）——》方便进行初始化

//当在类中自定义构造函数时   ，系统默认的构造函数就没了！！！！！！！！！


public class Test5_4 
{
	public static void main(String[] args)
	{
		persion p = new persion();//对象创建就会调用构造函数
		persion p1 = new persion("lixi");
		persion p2 = new persion("lixio",4);
		//构造函数和一般函数在写法上有所不同
		//运行上也有不同
		//构造函数是对象一建立就运行  给对象初始化   
		//一般方法是对象调用才执行  是给对象添加对象具备的功能
		//一个对象建立   构造函数之运行一次 
		//一般的方法可以调用多次
		p2.setName("fdfrd");
		
		
		
		
		
	
		
	
	}
	

}

class persion
  {
	
	private String name;
	private int age;
	//构造函数:在该例子中一共有三个构造函数——函数的
	persion()
	{
		System.out.println("A:name="+name+"age="+age);

	}
	
	persion(String n)
	{
		name = n;
		System.out.println("B:name="+name+"age="+age);
		
		
	}
	
	persion(String n,int a)
	{
		name = n;
		age = a;
		System.out.println("C:name="+name+"age="+age);
		
	}
	
	public void setName(String n)
	{
		name = n;
		System.out.println(name);
		
		
	}
	}

//什么时候定义构造函数：
//当分析事物时 该事物在具备一些特性或者行为   那么将这些内容定义在构造函数中 

