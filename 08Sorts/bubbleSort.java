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
}
