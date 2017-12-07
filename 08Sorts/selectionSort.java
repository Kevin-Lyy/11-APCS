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
 
    public static void main(String[] args){
	int[] testcase ={9, 2, 4, 7, 1};
	selectionSort.selectionSort(testcase);
	String testpenis = "";
	for (int c = 0; c < testcase.length; c++){
	    testpenis += testcase[c] + " ";
	}
	System.out.println(testpenis);
    }
	    
}
	    
		    
		    
		    
	    
