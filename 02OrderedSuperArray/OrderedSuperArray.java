public class OrderedSuperArray extends SuperArray{

    //constructor 
    public OrderedSuperArray(){
	int data[] = new int[size];
    }
    public OrderedSuperArray(int capacity){
	super(capacity);
    }
    public OrderedSuperArray(String[] ary)}
	super( );
    }


    //proper add 
    public void add(int index,String value){
	add(value);
    }

    //find correct index to add 
    public boolean add(String value){
	int index = indexOf(value);
	super.add(index,value);
	return true;
    }
	
    //find index
    public int indexOf(String value){
	for (int c = 0; c < size; c++){
	    if (value.compareTo(data[c]) < 1){
		return c-1;
	    }
	}
    }

    public int indexOfBinary(String element){
	for (int c = size/2; c < size;c + c/2 ){
	    if (value.compareTo(data[c]) < 1){
		return c-1;
	    }
	}
    }
    
}

