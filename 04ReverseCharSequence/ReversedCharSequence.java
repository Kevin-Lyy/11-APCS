public class ReversedCharSequence implements CharSequence{
    
    private String data;

    public static void (String[]args){
	String s = "asdfg";
	ReversedCharSequence word = new ReversedCharSequence(s);

    }
    
    public ReversedCharSequence(String test){
    }
    
    public String toString(){
	return data;
    }

    public int length(){
	return data.length();
    }
    
    public char charAt(int index){
	return data.charAt[index];
    }

    public CharSequence subSequence(int start, int end){
	return data.subString(start,end);
    }
}
