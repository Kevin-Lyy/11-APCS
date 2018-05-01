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

    private static boolean isSorted(int[] data){
    	for (int l = 0; l < data.length-1;l++){
    		if (data[l] > data[l+1]){
    			return false;
    		}
    	}
    	return true;
    }
    

    public static void bubbleSort(int[] data){
    	if (!isSorted(data)){
    		for (int c = 0; c < data.length - 1; c++){
    			for (int i = 0; i < data.length-1-c; i++){
    				if (data[i+1] < data[i]){
    					swap(data,i+1,i);
    				}
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
    	if (!isSorted(data)){
    		for (int c = 0; c < data.length-1 ; c++){
    			int min =c;
    			for (int i = c+1; i < data.length; i++){
    				if(data[i] < data[min]){
    					min = i;
    				}
    			}
    			if(min !=c){
    				swap(data, c, min);
    			}
    		}
    	}
    }
    
}
