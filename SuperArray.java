import java.util.Iterator;

public class SuperArray implements Iterable<String>{
    private String[] data;
    private int size;

    //constructor
    public SuperArray(){
	data = new String[10];
	size = 0;
    }
    
    public SuperArray(int startingCapacity){
	size = startingCapacity;
	int data[] = new int[size];
    }
    
    //clear
    public void clear(){
	size = 0;
	data = new String[size];
    }
    
    //size
    public int size(){
	return size;	
    }

    //checkempty
    public boolean isEmpty(){
	return size == 0;
    }
    
    //add
    public boolean add(String element){
	if (data.length == size()){
	    resize();
	}
	String[] newdata = new String[data.length];
	for (int c = 0; c <=size(); c++){
	    newdata[c] = data[c];
	}

	newdata[size()]=element;
	data = newdata;
	size++;
	return true;
    }
	
    //toString
    public String toString(){
	String str = "";
	for(int c = 0;c < size; c++){
	    str += data[c] + ", ";
	}
	return "["+ str.substring(0,str.length()-1) + "]";
    }

    //get
    public String get(int index){
	if(index < 0 || index > size()){
	    throw new IndexOutOfBoundsException();
	}
	else{
	    return data[index];
	}
    }
    
    //set
    public String set(int index,String element){
	if(index < 0 || index > size()){
	    throw new UnsupportedOperationException();
	}
	else{
	    String old = data[index];
	    data[index] = element;
	    return old;	
	}
    }


    //phase 2 
    //resize
    private void resize(){
	String[] newData = new String[size() + 1];
	for(int c = 0; c < size; c++){
	    newData[c] = data[c];
	}
	data = newData;
    }

    
    //phase 3
    //contains
    public boolean contains(String element){
	for (int c = 0; c < size; c++){
	    if (data[c].equals(element)){
		return true;
		}
	}
	return false;
    }

    //index of 
    public int indexOf(String element){
	for (int c = 0; c < data.length; c++){
	    if (data[c].equals(element)){
		return c;
	    }
	}
	return -1;
    }

    public int lastindexOf(String element){
	for (int c = size; c > 0; c--){
	    if (data[c].equals(element)){
		return c;
	    }
	}
	return -1;
    }

    //10
    public void add(int index, String element){
	if(index < 0 || index > size()){
	    throw new IndexOutOfBoundsException();
	}
	String[] newData = new String[size + 1];
	size++;
	for(int c = 0; c < size + 1; c++){
	    if (c < index){
		newData[c] = data[c];
	    }
	    else if(c == index){
		newData[c] = element;
	    }
	    else if(c > index){
		int d = c + 1;
		newData[d] = data[c];
	    }
	}
	data = newData;
    }

    //11
    public String remove(int index){
	if(index < 0 || index > size()){
	    throw new IndexOutOfBoundsException();
	}
	String returns = data[index];
	String[] newData = new String[size];
	for(int c = 0; c < size - 1; c++){
	    if (c < index){
		newData[c] = data[c];
	    }
	    else if(c > index){
		newData[c] = data[c+1];
	    }
	}
	data = newData; 
	return returns;
    }
    
    //12
    public boolean remove(String element){
	int c = indexOf(element);
	if (remove(c) != "null"){
	    return true;
	}
	return false;
    }
    //fix  the function next or make it abstract 
    public Iterator<String> iterator(){
	return new SuperArrayIterator(data, 0, size() -1);
    }
    
}
