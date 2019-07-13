package ydy;
/**
 * 快速排序算法
 * @author dengyan.yao
 *
 */
public class qsort {
public static void main(String[] args) {
	int[] arr = {1,4,2,5,3};
	for(int i=0;arr.length-i-1>0;i++){
		for(int j=0;j<arr.length-1-i;j++){
			if(arr[j]>arr[j+1]){
				int max = arr[j];
				arr[j] = arr[j+1];
				arr[j+1] = max;
			}
		}
	}
	for(int i=0;i<arr.length;i++){
		System.out.print(arr[i]+" ");
	}
}
}
