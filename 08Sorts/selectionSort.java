import java.util.Arrays;
public class selectionSort{

    public static String name(){
	return "01.Ly.Kevin";
    }


    private static void swap(int[]ary,int a, int b){
	int c = ary[a];
	ary[a] = ary[b];
	ary[b] = c;
    }
    
    public static void selectionSort(int[] data){
	int templeast = data[0];
	for (int c = 0; c < data.length ; c++){
	    for (int i = 0; i < data.length;i++){
		if (data[i] < data[templeast]){
		    templeast = i;
		}
	    }
	    swap(data,c,templeast);
	}
    }
    public static void main(String[] args){
	int[] testcase ={4 , 2 , 1 , 6};
	selectionSort.selectionSort(testcase);
	String testpenis = "";
	for (int c = 0; c < testcase.length; c++){
	    testpenis += testcase[c] + " ";
	}
	System.out.println(testpenis);
    }
	    
}
	    
		    
		    
		    
	    
