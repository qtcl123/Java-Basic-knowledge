package Demo4;
//二维数组
public class Test4_17 
{
	public static void main(String[] args)
	{
		int[] arr_1 = new int[3];//一维数组
	    int[][] arr = new int[3][4];//定义了名称为arr的为二维数组，二维数组中有三个一维数组
	    //每一个一维数组中有四个元素
	    System.out.println(arr);   //打印出hash值
	    System.out.println(arr[0]);//打印第一个数组
	    System.out.println(arr[0][1]);//打印元素
	    
	    
	    //数组均是引用数据类型  因此默认初始化值是null
	    int[][] arr1 = new int[3][];
	    System.out.println(arr1);//打印地址
	    System.out.println(arr1[0]);//打印第一个数组   注意：是数组默认为null
	    
	    //注意数组的一些默认情况！！！！！与组成过程
	    //对二维数组中的一维数据进行手动初始化 
	    arr1[0] = new int[3];
	    arr1[1] = new int[1];
	    arr1[2] = new int[2];
	    System.out.println(arr[2][2]);
	    
	    System.out.println(arr[0].length);//打印二维数组中第一个数组的长度
	    
	    
	    
	    //公司有三个销售组   建立二维数组来讲数据进行存储
	    
	    int[][] arr2 = {{3,4,45,5},{4,4,45,5},{5,5,56,6}};
	    System.out.println(arr2.length);
	    int sum = 0;
	    for(int x=0;x<arr2.length;x++)
	    {
	    	
	    	for(int y=0;y<arr2[x].length;y++)
	    	{
	    		sum = sum + arr2[x][y];
	    		
	    	}
	    	
	    }
	    System.out.println("sum="+sum);
	   
	    
	    
	    
	    
	}
	
	
	

}
