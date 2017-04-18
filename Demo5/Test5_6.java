package Demo5;
//this 关键字
public class Test5_6 
{
	public static  void main(String[] args)
	{
		
		matlab m = new matlab("lisi");//这个"lisi"赋值给成员变量
		m.speak();   //在类中的函数先找局部变量    局部变量不存在再找成员变量
		
		matlab m1 = new matlab("zhangsan",3400);
		
		
		
		
		
	
	}

}

//this函数   用于构造函数之间的相互调用！！！！！！！！！！！！
//构造函数之间调用   只能使用构造函数






//为了区分局部变量和成员变量   使用this
/*this:是用于区分局部变量和成员变量同名的情况
 * 
 * 
 * this:为什么可以解决这个问题    
 * this到底代表什么？
 * 
 * this:代表本类的对象！！！！！！！！！
 * 假如有很多对象   this代表它所在函数 所属对象的引用
 * 简单说：哪个对象在调用this所在的函数  ，this就代表 哪个
 * 
 * 
 */


class  matlab
{
	private String name;
	private int age;
	
	matlab (String name)
	{
		
		//在这存在局部变量和成员变量的表达数是一样的   
		//这样最后打印的结果是name=null    age=0
		//将局部变量的值赋给成员变量
		//因为在定义对象时 name是字符串变量     默认值是null  将其赋给成员变量    
		//  
		 this.name = name;
	
	}
	
	matlab(String name,int age)    //初始化语句     当在初始化语句中存在初始化时  需要先执行初始化	
	{
		//该语句我们看见上面的函数已经定义   因此我们可以直接调用！！！
		//一般函数可以直接写函数名即可，类似于matlab（String name） 
		//但是构造函数之间的调用  需要使用如下格式：
		//下面两个语句等价！！！
		this(name);    //必须放在第一行
		//this.name = name;  
		
		this.age = age;
		
	}
	
	
	public void speak() //先找局部变量 即在定义对象时初始化值   如果不存在   则找在类中的定义  
	{
		System.out.println("name="+this.name+"age="+this.age);  //这样写更加合理
		show();//在这使用this.show()也行
	
	}
	
	
	public void show()
	{
		System.out.println(this.name);
		
	}
	
	/*需求：给人定义一个用于比较年龄是否相同的功能    也就是是否是同龄人  
	*/
	//this的应用：当定义类中的功能时  该函数内部要用到调用该函数的对象时  这时 用this来表示这个对象 
	
}
