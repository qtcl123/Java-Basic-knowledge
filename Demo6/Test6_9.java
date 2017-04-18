package Demo6;
//单例设计模式的方法二
public class Test6_9 
{
	public static void main(String[] args)
	{
		
	}

}

/*单例设计模式的描述之一
 *这个先初始化对象
 *称为 饿汉式
 *python类进入内存     就已经创建好了对象  
 *
class python
{
	 private static python pp = new python();
	 private python()
	 {
		 
	 }
	 
	 public static python getInstance()
	 {
		 return pp;
	 }
}
*/


//记住原则：定义单例   建议使用饿汉式
//单例设计模式的描述之二
//对象方法被调用时   才初始化   也叫做对象的延时加载       称为：懒汉式
//Python进入内存时   对象并没有存在 只有调用getInstance方法时  才建立对象
//cpu有时候只能执行一个程序  在各个程序之间切换   需要多核
class python
{
	private static python pp = null;
	private python()
	{
		
	}
	//关键字 synchronized 每次只容许一个对象   即使cpu进行切换    但是新的对象没法创建     效率低
	
	public static python getInstance()   //使用关键字synchronized 同步
	{
		if (pp==null)   //会判断一下   和计算机硬件有关
		{
			synchronized(python.class)
			{
				if (pp==null)
				{
					pp = new python();
					
				}
			}
		
		}
		return pp;
		
	}
}
