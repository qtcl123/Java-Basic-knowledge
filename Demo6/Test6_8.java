package Demo6;
/*设计模式：解决某一类问题最行之有效的方法
 * java中存在23种设计模式
 * 单例设计模式： 解决一个类在内存中只存在一个对象
 * 想要保证对象唯一 ：
 * 1 为了避免其他程序过多建立该类对象   先禁止其他的程序建立该对象
 * 2 还为了让其他的程序访问该对象   只好在本类中    自定义一个对象  
 * 3 为了方便其他程序自定义对象的访问   可以对外提供一些访问方式
 * 这三个步骤  代码体现：
 * 1 将构造函数私有化
 * 2 在类中创建一个本类对象
 * 3 提供到一个方法可以获取到该对象
 
 * */
public class Test6_8 
{
	public static void main(String[] args)
	{
		//能建立其他类的对象     是因为有构造函数对其初始化    如果将构造函数private  那么其就不能创建类
		mathCad.getInstance();   //返回的数字类型是
		
		//创建两个对象后  其实在堆内存中只有一个对象   具有三个引用mm1    mm2    m
		mathCad mm1 = mathCad.getInstance();
		mathCad mm2 = mathCad.getInstance();
		mm1.setNum(100);
		System.out.println(mm2.getNum());
		
		
		
		
		//现在可以创建对象了   将私有化类的·private去掉
		//mathCad m1 = new mathCad();
		//mathCad m2 = new mathCad();
		//m1.setNum(100);
		//System.out.println(m2.getNum());

	}
}


//对事物该怎么描述     继续怎么描述即可   当需要将该事物对象保证在内存中唯一时  就可以加上以上的三步


class mathCad  
{
	//私有化构造函数
	private mathCad()
	{
		
	}
	//构造本地类的本地对象
	//m属于成员变量   一般将其私有化   通过get方法进行访问
	private static mathCad m = new mathCad();
	
	//访问方法
	//访问数据类型是mathCad类  
	//为了便于进行访问   需要将其静态化
	//同时   静态方法只能访问静态类  因此需要将m静态化
	public static mathCad getInstance()
	{
		return m;
	}
	
	
	//用于举例   最后加上
	private int num;
	public void setNum(int num)
	{
		this.num = num;
		
	}
	
	public int getNum()
	{
		return num;
		
	}

	
}


//注意：方法被调用只有两种方式：通过对象和类    类只能调用静态方法
//因为在外部不能创建对象   因此需要需要使用·私有类




