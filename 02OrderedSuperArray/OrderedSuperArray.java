public class OrderedSuperArray extends SuperArray{

    //constructor 
    public OrderedSuperArray(){
	super();
    }
    public OrderedSuperArray(int capacity){
	super(capacity);
    }
    public OrderedSuperArray(String[] ary){
	super();
	for ( int c = 0; c <ary.length;c++){
	    super.add(ary[c]);
	}
    }
    public String set(int index,String element){
	throw new UnsupportedOperationException();
    }


    public void add(int index,String value){
	add(value);
    }

    public boolean add(String value){
	super.add(findIndex(value), value);
	return true;
    }

    public int findIndex(String value){
	for (int c = 0; c < size(); c++){
	    if (get(c).compareTo(value) > 0){
		return c;
	    }
	}
	return size();
    }

    public int findIndexBinary(String value){
	int start = 0;
	int end = size();
	while (start < end){
	    if (get((start+end)/2).compareTo(value) > 0){
		end = (start+end)/2;
	    }
	    else{
		start =(start+end)/2+1;
	    }
	}
	return start;

    }

    public int indexOfBinary(String element){
	int start = 0;
	int end = size();
	while (start < end){
	    if(get((start+end)/2).compareTo(element) > 0){
		end = (start + end) /2;
	    }
	    else if(get((start+end)/2).compareTo(element) > 0){
		if(start ==0|| !(get((start + end)/2-1).equals(element))){
		    return (start + end) /2;
		}
	    
	    end = (start + end)/2;
	    start = (start + end)/2 -1;
	    }
	    else {
		start = (start+end)/2+1;
	    }
	}
	if(get(start) != element){
	    return -1;
	}
	return start;
	
    }

    public int lastIndexOfBinary(String element){
	int start = 0;
	int end = size();
	while (start < end){
	    if(get((start+end)/2).compareTo(element) > 0){
		end = (start + end) /2;
	    }
	    else if(get((start+end)/2).compareTo(element) > 0){
		if(start == size)_ -1|| !(get((start + end)/2+1).equals(element))){
		    return (start + end) /2;
		}
	    
	    end = (start + end)/2;
	    start = (start + end)/2 -1;
	    }
	    else {
		start = (start+end)/2+1;
	    }
	}
	if(get(start) != element){
	    return -1;
	}
	return start;
	
    }
	
    }




}

