package ydy;

public class chitao {
	public static void main(String[] args) {
		//循环
		/*int left =1;
		for(int i=9;i>0;i--){
			 left = left*2+1;
		}
		int num = left;
		System.out.println(num);*/
		
		//递归
		int num = fun(0);
	}

	private static int fun(int n) {
		if(n==9){
			return 1;
		}
		return fun(n-1)*2+1;
	}
}
