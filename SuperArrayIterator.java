public class SuperArrayIterator implements iterator<String>{
    private String[] data;
    private int size;

    //0
    public SuperArray(int startingCapacity){
	size = startingCapacity;
	int data[] = new int[size];
    }
    
    //1
    public void clear(){
	data = new String[size];
	size = 0;
    }
    
    //2 
    public int size(){
	return size;
    }
    
    //3
    public boolean add(String element){
	if (data[size] != null){
	    resize();
	    data[size] = element;
	}
	else {
	    data[size] = element;
	}
	return true;
    }
	
    //4
    public String toString(){
	String str = "";
	for(int c = 0;c < size; c++){
	    str += data[c] + ",";
	}
	return "["+ str.substring(0,str.length()-2) + "]";
    }

    //5
    public String get(int index){
	if(index < 0 || index > size()){
	    return "null";
	}
	else{
	return data[index];
	}
    }
    
    //6
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
    //7
    private void resize(){
	size = size * 2;
	String[] newData = new String[size + 1];
	for(int c = 0; c < size; c++){
	    newData[c] = data[c];
	}
	data = newData;
    }

    
    //phase 3
    //8
    public boolean contains(String element){
	for (int c = 0; c < size; c++){
	    if (data[c].equals(element)){
		return true;
		}
	}
	return false;
    }

    //9
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
	    System.out.println("error");
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
	    return "null";
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
    
}
