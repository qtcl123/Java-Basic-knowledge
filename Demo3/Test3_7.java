package Demo3;
///2 1~100之间 7的倍数  并打印
//开发的累加思想
/**
 *原理：通过变量记录循环操作后的结果
 数字加    字符串的延长
  
 * 
 */
public class Test3_7 
//步骤：
/*1，定义循环语句  选择for 语句
 * 2 在循环中定义判断   只要是7的倍数即可  使用if语句   条件：是7的倍数 x%7==0;
 * 3 因为7的倍数不确定   只要符合条件   就通过一个变量  来记录这个变化的次数
 * 
 * */
{
	public static void main(String [] args)
	{
		int count = 0;
		
		for (int x = 1;x<100;x++)
		{
			if(x%7==0)
			{
				//System.out.println("x="+x);
				count++;
			    System.out.println("第"+count+"个数字是"+x);  //在这加上{}是一个整体  否则默认下面一行代码语句执行语句
			}
				}
	System.out.println("count="+count);
	
	}
	

}



//计数器思想：
/* 通过一个变量记录数据的状态变化
 * 也许通过循环完成 
 * 
 * */
























































