public class bubbleSort{

    public static String name(){
	return "01.Ly.Kevin";
    }


    private static void swap(int[]ary,int a, int b){
	int c = ary[a];
	ary[a] = ary[b];
	ary[b] = c;
    }

    public static void bubbleSort(int[] data){
	for (intc = 0; c < data.length; c++){
	    int next = data[c];
	    int index = c;
	    for (int i = c; i <data.length; i++){
		if (data[i] < next){
		    swap(data,index,i);
		}
	    }
	}
    }

}
