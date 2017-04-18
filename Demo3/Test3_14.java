package Demo3 ;
//函数
public class Test3_14 
{
	public static void main(String[] args)
	{
		//小场景
		int x=3;
		System.out.println(x*4+5);
		
		int y = getResult(4);
		System.out.println(y);
		
		
		
		
		//发现以上的运算，因为获取不同数据的运算结果代码出现重复
		//为提高代码的复用性：对代进行抽取
		//将这个部分定义成·一个人独立的功能   方便与日后使用
		//Java中对功能的定义是通过函数来体现
	
	}

	//注意主函数是静的    因此需要调用被静态修饰的函数
	//需要放在类中
	//函数只有被调用时   才会执行
	public static int getResult(int num)   //public static属于修饰符
	{
		return num*3+5;
		
		
	}
	
	/*下面的案例会报错：因为返回值是int  但是最后没有返回值！！
	 * 修改方法：
	 * 1 将int修改为void
	 * 2 在函数后面添加return;
	 * 以上两种方法采用一种即可
	//案例
	public static int getadd(int num)
	{
		
		System.out.println(num*4+7);
		
		
		
	}
	*/
	//当函数运算后 没有具体的返回值  这时返回值类型采用一个特殊的关键字来标识
	//该关键字是void：表示函数没有具体的返回值
	//当函数返回值类型是void时 函数中的return语句可以省略不写
	
}


























































































































































