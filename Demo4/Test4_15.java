package Demo4;
//查表法十进制》十六进制
public class Test4_15 
{
	//十六进制中的元素：0 1 2 3 4 5 6 7 8 9 A B C D E 
//十六进制中的元素对应的角标0 1 2 3 4 5 6 7 8 9  A B C D E
	
	//查表法  ：将所有的元素进行存储   建立对应关系   
	//每一次&15后的值作为索引去建立好表 ，就可以找出对应的元素  
	//这样比 -10+'a'简单的多
	//可以通过数组的形式来定义
	public static void main(String[] args)
	{
		toHex(60);
		
		
	}
	
	
	public static void toHex(int num)
	{
		char[] ch = {'0','1','2',
				'3','4','5','6',
				'7','8','9','A',
				'B','C','D','E'};
		

		for (int x=0;x<8;x++)
		{
			int temp = num & 15;
			System.out.println(ch[temp]);
			num = num>>>4;
			
		}
		
	}
	
	

}
