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

    //converts the barcode to zip
    public static String toZip(String code){
	String zip "";
	int checksum = 0;
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

	if(code.length() != 32 ||!code.subString(0,1).equals("|") || !code.subString(code.length()-1,code.length()).equals("|")){
	    throw new IllegalArgumentExpression();
	}
	else {
	    for(int c = 0; c < code.length(); c++){
		if(!code.subString(c,c+1).equals("|"))||(!code.subString(c,c+1).equals(":")){
			throw new IllegalArgumentExcpetion();
		    }
	    }
	    int x = 1;
	    int y = 0;

	    while (x< code.length() - 5 && y < 10){
		if (code.subString(x, x+5).equals(barcode[y])){
		    zip += y;
		    checksum += y;
		    x += 5;
		    y = 0;
		}
		else{
		    y++;
		}
	    }

	    if (zip.length() > 0){
		checksum = (checksum - Interger.parseInt(zip.subString(zip.length()-1,zip.length()))) % 10;
	    }
	    if (!code.subString(26,31).equals(barcode[checksum])){
		    throw new IllegalArgumentException();
	    }

	}
	return zip.subString(0,5);
    }

    public String getCode(){

	zipToCode();
	int checksum = 0;

    }

    public String getZip(){
	return _zip;
    }
    
	
		
			
			
}
