import java.util.*;

public class SuperArray{
    private String[] data;
    private int size;

    //constructor
    public SuperArray(){
    	data = new String[10];
    	size = 0;
    }
    
    public SuperArray(int startingCapacity){
    	size = startingCapacity;
    	data = new String[size];
    }
    
    //clear
    public void clear(){
    	data = new String[size];
    	size = 0;
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
       	size++;
    	data[size--] = element;

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
    	for(int c = 0; c < size; c++){
    		if (c < index){
    			newData[c] = data[c];
    		}
    		else if(c == index){
    			newData[c] = element;
    		}
    		else if(c > index){
    			newData[c++] = data[c];
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
    	for(int c = 0; c < size-1; c++){
    		if (c < index){
    			newData[c] = data[c];
    		}
    		else if(c > index){
    			newData[c] = data[c+1];
    		}
    	}
    	data = newData; 
    	size--;
    	return returns;
    }
    
    //12
    public boolean remove(String element){
    	for(int c = 0; c < size-1; c++) {
    		if(data[c].equals(element)) {
    			for(int i = 0;i<size-1; i++) {
    				if(i < c) {
    					data[i] = data[i];
    				}
    				if(i >= c) {
    					data[i] = data[i+1];
    				}
    			}
    			size--;
    			return true;
    		}
    	}
    	return false;
    }
    
    
}
