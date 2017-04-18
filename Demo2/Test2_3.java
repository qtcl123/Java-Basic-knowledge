package Demo2;

public class Test2_3 
{
	//类型转换
	//注意前使用强制类型转化的格式

	
		public static void main(String [] args)
		{
			byte b=3;  //进行运算时 需要把两个数据提升为同一数据类型才能进行运算
			b=(byte)(b+3);  //强制类型转化！！！！
			//均提升为int ，然后运算     最后赋给byte   所以会出错
			char a=166;
			
			System.out.println((char)100); //打印出字符串100对应的ASCII
			
			
			
		}

	}



