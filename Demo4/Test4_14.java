package Demo4;
//十进制——》十六进制
public class Test4_14 
{
	public static void main(String[] args)
	{
		toHex(60);
		
	}
	
	
	public static void toHex(int num)
	{
		StringBuffer sb = new StringBuffer();
		 for (int x=0;x<8;x++)
		 {
			 int temp = num & 15;
			 if (temp>9)
			 {
				 System.out.print((char)(temp-10+'A'));
			 }
			 else
				 {
					System.out.print(temp);
					sb.append(temp);
					
					
				 }
				
			 num = num>>>4;
			 
			 }
		System.out.println(sb.reverse());
		 }
	

}
