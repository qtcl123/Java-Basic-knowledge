package Demo6;
//静态类的应用
//功能的封装  ——》转化成类
//javadoc说明书
/*
 *将文件发送给其他人时 其他人只要将文件设置到classpath路径下  就可以使用该工具类
 *但是 很遗憾  该类中到底定义了多少个方法   对方并不清楚   因为该类中并没有使用说明书
 *开始·制作程序的说明书   Java的说明书通过文档注释来完成
 *注意Javadoc的制作  以及在各个位置的标识
 *
 *
 * */
public class Test6_5 
{
	public static void main(String[] args)
	{
	int[] arr = {3,4,45,6,6,7,78,8,89};
	int max = ArrayTool.getMax(arr);
	int min = ArrayTool.getMin(arr);
	
	
	System.out.println(max);
	System.out.println(min);
	}
	
	
	
	//将方法均静态后   可以方便使用  但是该类还是可以被其他的程序建立对象的
	//为了根更为严谨 强制让该类不能建立对象    可以通过构造函数私有化完成
	 
	
	
	/*
	 * 以前想要调用类的成员方法  需创建对象  如果在本例中 针对不同的对象  需要创建不同的ArrayTool对象
	 * 这样很麻烦   因此需要将成员方法静态化   直接被类调用   作用在对象上
	
	int max  = tool.getMax(arr);
	System.out.println("max="+max);  //为什么会存在这样的问题
	*/
	
	
	
	
	

	
//虽然可以使用ArrayTool的对象使用这些工具方法  对于数据进行操作
//发现了问题  
	/*1 对象是用于封装数据的 可是ArrayTool对象并没有封装特有数据·
	 * 2 操作数据的·每一个方法都没有用到ArrayTool对象中的特有数据
	 * 
	 * 
	 * 
	 * 这时需要考虑：让程序更加严谨  是不需要对象的
	 * 可以将ArrayTool中的方法定义成static的  直接通过了类进行访问即可
	 *  
	 * 
	 * 
	 */

}

//使用场景：在每一个程序类中都有共性的功能    可以将这些功能进行抽取   独立封装  以便于复用
//一个类中默认会有一个空参数的构造函数
//这个默认的构造函数的权限和所属类一致
//如果类被public修饰 那么默认的构造函数也带public修饰符
//如果类没有被public修饰 那么默认的构造函数 也没有public修饰
//默认的构造函数的权限是随着类的·变化而变化



/**这是一个可以对数组进行操作的 工具类    该类中提供了获取最值   排序等功能
 * 
 * @auther Taven
 * @version V1.1
 * 
 * 生成应用API文档
 * api:应用程序接口
 * 
 
 * */

//注意在使用javadoc.exe时  =需要进行封装类是public的才可以  因为只有这样权限才够大
//查看时   通过index索引进行查看！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！
//在文档中 private不会被显示   因为属于私有类

 class ArrayTool
{
	//通过构造函数  将其私有化   不能进行创建对象
	/*
	 * 空参数构造函数
	 * 
	 * */
	private ArrayTool()
	{}

	//获取数组最大值
	/**
	 * @param arr 接收一个int类型的数组
	 * @return 会返回一个数组中的最大值
	 * 需要解释函数的意义
	 * 参数的意义
	 * 以及最后结果的描述
	 * 
	 * */
	public static int getMax(int[] arr)
	{
		int max  =0;
		for(int x=0;x<arr.length;x++)
		{
			if (arr[x]>arr[max])
			{
				max = x;
				
			}
		}
		return max;
		
		
	}
	
	
	//获取数组最小值
	public static int getMin(int[] arr)
	{
		int min  =0;
		for(int x=0;x<arr.length;x++)
		{
			if (arr[x]<arr[min])
			{
				min = x;
				
			}
		}
		return min;
	
	}
	
	//进行排序
	public static void selectSort(int[] arr)
	{
		for (int x=0;x<arr.length-1;x++)
		{
			for (int y=x+1;y<arr.length;y++)
			{
				if (arr[x]>arr[y])
				{
					swap(arr,x,y);
					
					
				}
			}
		}
	}
	
	
	//bubbleSort
	public static void   bubbleSort(int[] arr)
	{
		for(int x=0;x<arr.length-1;x++)
		{
			for (int y=0;y<arr.length-x-1;y++)
			{
				if(arr[y]>arr[y+1])
				{
					swap(arr,y,y+1);
					
				}
				
			}
		}
	}
	
	
	//交换位置
	public static void swap(int[] arr,int a,int b)
	{
		int temp = arr[a];
		arr[a] = arr[b];
		arr[b] = temp;
		
		
	}
	
	
	
}


