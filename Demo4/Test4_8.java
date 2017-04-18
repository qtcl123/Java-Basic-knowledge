package Demo4;
//通过刚才的冒泡排序和选择排序   我们可以发现在排序中均存在一个过程   
//即数组中的元素的位置进行交换
//因此我们将排序·这个过程进行封装！！！
public class Test4_8 
{
	public static void main(String[] args)
	{
		
	}
	
	
	//进行封装的思想
	public static void Swap(int[] arr,int a,int b)
	{
		int temp = arr[a];
		arr[a] = arr[b];
		arr[b] = temp;
		
	}
	

}
