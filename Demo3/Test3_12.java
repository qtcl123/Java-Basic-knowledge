package Demo3;
//continue:只能作用于循环结构
//特点：结束本次循环   继续下次循环
public class Test3_12 
{
	public static void main(String[] args)
	{
		for (int x=0;x<3;x++)
		{
			System.out.println("x="+x);
			continue;
			/*
			continue;//当有continue存在时    其下面的语句不会执行
			System.out.println("x="+x);
			*/
		}
			
		for(int y=1;y<=10;y++)
		{
			if(y%2==0)
				continue;
			System.out.println("y="+y);
			
			
			
		}
		
		
	}

}


//注意break和continue的作用范围
//break和continue下面可以有任何语句 因为都执行不到





