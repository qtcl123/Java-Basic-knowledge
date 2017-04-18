package Demo6;
//main函数
public class Test6_2 
{
	public static void main(String[] args)  //主函数的格式固定！！！！
	{
		//主函数的格式固定   但是args可以更改 原来是arguments
		
	   //jvm在调用主函数时  传入的是new String[0]  这表示字符串里面有0个元素
		System.out.println(args.length);
		//System.out.println(args[0]);  //该语句表打印字符串数组中的编号为0的元素  会报错——数组越界
		

		String[] s = {"jisuasnji","matlab","julie"};
		MainTest.main(s);
	
		
		
	}
	
	public static void main(int x)   //和主函数重载   但是虚拟机依然先执行上面的语句   因为格式固定！！！
	
	{
		
	}
	
	

}
/*
 * 
 * 主函数是一个特殊的·函数   作为程序的入口  可以被jvm调用  
 * 主函数的定义：
 * public:代表该函数的访问权限是最大的
 * static:代表主函数随着类的加载   就已经存在了 
 * void:代表主函数没有具体的返回值
 * main:不是关键字 但是是一个特殊肚的单词 可以被jvm识别
 * (String[] args):函数的参数  参数类型是一个·数组  该数组中的元素是字符串  字符串类型的数据
 * 主函数是固定格式的：jvm识别

 * 
 * */
class  MainTest
{
	public static void main(String[] args)
	{
		for (int x=0;x<args.length;x++)
		{
			System.out.println(args[x]);
			
		}
	}
}



