package day_1;

public class recursion {
	public static int name(int num)
	{
		if(num==0)
		{
			return 0;
		}
return num+name(num-1);
}
	public static void main(String[] args) {
		System.out.println(name(10));
	}
	}
