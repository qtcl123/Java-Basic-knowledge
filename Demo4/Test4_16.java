package Demo4;
//查表法十进制——>二进制
public class Test4_16 
{
	public static void main(String[] args)
	{
		ToBin(-6);
		toBin(-6);
		
		//十进制——>二进制
     
		
	}
	public static void ToBin(int num)
	{
		trans(num,1,1);
		
	}
	
	

	
	public static void toBin(int num)
	{
		//定义一个二进制表
		char[] chs = {0,1};
		//定义一个临时存储容器
		char[] arr = new char[32];
		//定义一个操作数组的指针
		int pos = arr.length;
		while(num!=1)
		{
			int temp = num & 1;
			arr[--pos] = chs[temp];
			num = num>>>1;
		}
		
		for (int x=0;x<arr.length;x++)
		{
			System.out.println(arr[x]);
			
		}
	}
	
	
	//优化过程：转化过程！！满足所有的进制
	public static void trans(int num,int base,int offset)
	{
		char[] chs = {'0','1','2',
				'3','4','5','6',
				'7','8','9','A','B',
				'C','D','E','F'};
		char[] arr = new char[32];
		int pos = arr.length;
		while(num!=0)
		{
			int temp = num & base;
			arr[--pos] = chs[temp];
			num = num>>>offset;
			
		}
		for(int x=pos;x<arr.length;x++)
		{
			System.out.println(arr[x]);
			
		}
		
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
