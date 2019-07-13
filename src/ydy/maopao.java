package ydy;

/**
 * 冒泡排序算法
 * @author dengyan.yao
 *
 */
public class maopao {
public static void main(String[] args) {
	int[] a={1,3,5,4,2};
	for(int i=0;i<a.length-1;i++){
		for(int j=0;j<a.length-1-i;j++){
			if(a[j]>a[j+1]){
				int tmp = a[j];
				a[j] = a[j+1];
				a[j+1] = tmp;
			}
		}
	}
	for(int i=0;i<a.length;i++){
		System.out.print(a[i]+",");
	}
}
}
