package Demo6;
//什么时候使用静态
public class Test6_3 
{
	public static void main(String[] args)
	{
		persion1 p = new persion1();
	    p.show();
		
	}

}



/*
 * 
 * 
 * 
 *开发中的设计：
 *什么时候使用静态：
 *1 要从两方面着手
 *因为静态修饰的内容有成员变量和函数
 *1 什么时候定义静态的变量  （类变量）
 * 当对象中的出现共享数据时 ，该数据被静态修饰 ：注意是共享数据   而不是共享属性
 * 对象中的特有数据要定义成非静态存在于堆内存中 
 * 
 *
 *
   2 什么时候 定义静态函数呢？
       当功能内部没有访问到非静态数据时（对象的特有	数据）
      那么该功能可以定义成静态的
     */


class persion1
{
	String name;
	public void show()   //该功能没有访问对象的特有数据   因此可以将其变成静态的
	
	{
		System.out.println("haha");
		
	}
}
