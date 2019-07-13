package ydy;

public class digui {
public static void main(String[] args) {
	int a=10;
	int result=fun(8);
	System.out.println(result);
}

public static int fun(int i) {
	if(i==1){
		return 10;
	}else{
		return fun(i-1)+2;
	}
	
}
}
