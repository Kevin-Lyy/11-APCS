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
    		for (int c = 0; c <ary.length;c++){
    			add(ary[c]);
    		}
    	}

    	public void add(int index,String value){
    		add(value);
    	}

    	public boolean add(String value){
    		super.add(findIndex(value), value);
    		return true;
    	}
    	
    	public String set(int index,String element){
    		throw new UnsupportedOperationException();
    	}

    	private int findIndex(String value){
    		for (int c = 0; c < size(); c++){
    			if (get(c).compareTo(value) <= 0){
    				return c;
    			}
    		}
    		return -1;
    	}
    	
    	private int findIndexBinary(String value){
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
    	
    	public int indexOfBinary(String element) {
    		int start = 0;
    		int end = size();
    		int mid = start+end/2;
    		
    		while (start < end) {
    			if(get(mid).compareTo(element) > 0) {
    				end = mid;
    				mid = start + end/2;
    			}
    			else {
    				start = mid + 1;
    				mid = start + end/2;
    			}
    		}
    		return start;
    	}
    	
    	public int lastIndexOfBinary(String element) {
    		int start = 0;
    		int end = size();
    		int mid = start+end/2;
    		
    		while (start < end) {
    			if(get(mid).compareTo(element) < 0) {
    				start = mid;
    				mid = start + end/2;
    			}
    			else {
    				end = mid - 1;
    				mid = start + end/2;
    			}
    		}
    		return end;
    	}
}

