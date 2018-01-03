public class ReversedCharSequence{
    
    private String data;

    public static void main(String[]args){
	String s = "asdfg";
	ReversedCharSequence word = new ReversedCharSequence(s);

    }
    
    public ReversedCharSequence(String test){
	data = "";
	for (int c = data.length() -1;c >= 0; c--){
	    data += test.substring(c,c+1);
	}
    }
    
    public String toString(){
	return data;
    }

    public int length(){
	return data.length();
    }
    
    public char charAt(int index){
	return data.charAt(index);
    }

    public CharSequence subSequence(int start, int end){
	return data.substring(start,end);
    }
}
