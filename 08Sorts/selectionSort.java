import java.util.Arrays;
public class selectionSort{

    public static String name(){
	return "01.Ly.Kevin";
    }

    public static boolean isSorted(int[]ary){
	for(int i = 0; i < ary.length; i++){
	    if(ary[i] > ary[i+1]){
		    return false;
		}
	}
	return true;
    }

    private static void swap(int[]ary,int a, int b){
	int c = ary[a];
	ary[a] = ary[b];
	ary[b] = c;
    }
    
    public static void selectionSort(int[] data){
	int templeast = data[0];
	while (!isSorted(data)){
		for (int c = 0; c < data.length; c++){
		    for (int i = 0; i < data.length;i++){
			if (data[i] < templeast){
			    templeast = i;
			}
		    }
		    swap(data,c,templeast);
		}
	}
    }
}
	    
		    
		    
		    
	    
