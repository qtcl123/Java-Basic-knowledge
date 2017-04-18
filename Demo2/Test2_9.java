package Demo2;
//switch练习
public class Test2_9 
{
	public static void main (String[] args)
	{
		//需求二：根据用于指定月份 打印该月份的所属的季节
		int x = 4;
		switch (x)
		{
		case 3:
		case 4:    //增加代码的重用性
		case 5:
			System.out.println(x+"春季");
		case 6:
		case 7:    //增加代码的重用性
		case 8:
			System.out.println(x+"夏季");
		case 9:
		case 10: //增加代码的重用性
		case 11:
			System.out.println(x+"秋季");
		case 12:
		case 1:    //增加代码的重用性
		case 2:
			System.out.println(x+"冬季");
		
		
		}
		System.out.println("hello world");
	}

}




//if可以判断区间  switch判断区间很费力
//运算结果是布尔型时  switch不能处理
/*使用if switch的情况：
 * 判断具体的数字并且值不多的情况：使用switch
 *switch相对于if的效率更高一点
 *
 * 
 * 
 * 
 * 
 * 
 * 
 * */







