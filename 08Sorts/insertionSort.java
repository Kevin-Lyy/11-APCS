import java.util.Arrays;
public class insertionSort{

    public static String name(){
	return "01.Ly.Kevin";
    }
    private static void swap(int[]ary,int a, int b){
	int c = ary[a];
	ary[a] = ary[b];
	ary[b] = c;
    }

    public static void insertionSort(int[] data){
	for (int c = 0; c < data.length - 1; c++){
	    if (data[c] > data[c+1]){
		swap(data,c,c+1);
		for (int i = c; i >0; i --){
		    if(data[i] < data[i-1]);
		       swap(data,i,i-1);
		}
	    }
	}
    }
}
