import java.util.Arrays;
public class Sort{

    public static String name(){
	return "11.Ly.Kevin";
    }
    

    private static void swap(int[]ary,int a, int b){
	int c = ary[a];
	ary[a] = ary[b];
	ary[b] = c;
    }

    public static void bubbleSort(int[] data){
	for (int c = 0; c < data.length - 1; c++){
	    for (int i = 0; i < data.length-1-i; i++){
		if (data[i+1] < data[i]){
		    int temp = data[i+1];
		    data[i+1] = data[i];
		    data[i] = temp;
		}
	    }
	}
    }

    
    public static void insertionsort(int[] data){
	for (int i = 1; i < data.length; i++){
	    int j = i;
	    while(j > 0 && data[j] < data[j-1]){
		swap(data, j,j-1);
		j--;
	    }
	}
    }
    public static void selectionSort(int[] data){
	for (int c = 0; c < data.length ; c++){
	    int next = data[c];
	    int index = c;
	    for (int i = c; i < data.length;i++){
		if (data[i] < next){
		    index = i;
		}
	    }
		swap(data,c,index);
	}
    }
 

    
	
}
