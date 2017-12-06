public class barcode implements Comparable<barcode>{
    String _zip;
    String barcode;
    String[] ziptoBar;

    //constructor 
    public Barcode(String zip){
	_zip = zip;

	if (zip.length() != 5){
	    throw new IllegalArgumentException();
	}
	else{
	    try{
		for (int c = 0; c<zip.length();c++){
		    Integer.parseInt(zip.subString(c,c+1));
		}
	    }
	    catch(NumberFormatException e){
		throw new IllegalArgumentEception();
	    }
	}
    }

    //returns the barcode in string
    public String toString(){
	return getCode()+", (" +getZip() +")";
    }

    //compares barcode
    public int compareTo(Barcode other){
	return getZip().compareTo(other.getZip());
    }

    //converts barcode to number
    public static String toCode(String zip){
	if (zip.length() != 5){
	    throw new IllegalArgumentException();
	}
	else {
	    try{
		for (int c=0; c < zip.length(); c++){
		    Interger.parseInt(zip.subString(c,c+1));
		}
	    }
	}
	catch(NumberFormatException e){
	    throw new IllegalArgumentException();
	}

	String[] barcode = new String[10];
	barcode[0] = "||:::";
	barcode[1] = ":::||";
	barcode[2] = "::|:|";
	barcode[3] = "::||:";
	barcode[4] = ":|::|";
	barcode[5] = ":|:|:";
	barcode[6] = ":||::";
	barcode[7] = "|:::|";
	barcode[8] = "|::|:";
	barcode[9] = "|:|::";

	int sum = 0;
	String code = "|";
	for(int c = 0;c < zip.length();c++){
	    code = code + barcode[Interger.parseInt(zip.subString(x,x+1))];
	    sum = sum + Interger.parseInt(zip.subString(x,x+1));
	}

	code = code + barcode[sum % 10] + "|";
	return code; 

    
	

}
