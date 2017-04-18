package Demo5;
//封装
public class Test5_3 
{
	public static void main(String[] args)
	{ 
		/*
		Persion p = new Persion();
		p.setAge(-40);   //注意  当传值时 是对象中的age在变化     而在类中的age没变化
		p.speak();
		*/

	}

}


/*
class Persion
{
	//可以通过修饰符
	private int age;     //私有是封装的一种体现形式
	public  void speak()
	{	
	System.out.println("age="+age);
	}
	
	
	//之所以对外提供访问方式 ，就因为可以在访问方式中加入逻辑等语句
	//对访问的数据进行操作   提高代码的健壮性
	
	//私有属性的set和get方法
	public void setAge(int a)
	{
		if(a>0&a<130)
		{
			age = a;
			speak();
			
		}
		else
		{
			System.out.println("age is null");
			
		}
	
	}
	
	
	public int getAge()
	{
		return age;
	}
	
	}


//注意：成员变量有默认值，如果不给予初始化，也可以参与运算
//局部变量如果不给予初始化   是不能参与运算的




/*private :私有 权限修饰符 ：用于修饰类中的成员 (成员变量   成员函数）
 * 私有类只在本类中有效！！！！！ 如age只能在Persion类中间进行访问
 * */


//将age私有化后  类以外建立了对象也不可直接进行访问   
//但是人应该具有年龄  就需要在Persion类中提供对应的的age访问方式





































