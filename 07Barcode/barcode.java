public class barcode implements Comparable<barcode>{
    String _zip;
    String barcode;
    String[] zipToBar;

    //constructor 
    public barcode(String zip){
	_zip = zip;

	if (zip.length() != 5){
	    throw new IllegalArgumentException();
	}
	else{
	    try{
		for (int c = 0; c < zip.length();c++){
		    Integer.parseInt(zip.substring(c,c+1));
		}
	    }
	    catch(NumberFormatException e){
		throw new IllegalArgumentException();
	    }
	}
    }

    //returns the barcode in string
    public String toString(){
	return getCode()+", (" +getZip() +")";
    }

    //compares barcode
    public int compareTo(barcode other){
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
		    Integer.parseInt(zip.substring(c,c+1));
		}
	    }
	
	catch(NumberFormatException e){
	    throw new IllegalArgumentException();
	}
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
	    code = code + barcode[Integer.parseInt(zip.substring(c,c+1))];
	    sum = sum + Integer.parseInt(zip.substring(c,c+1));
	}

	code = code + barcode[sum % 10] + "|";
	return code;
    }

    //converts the barcode to zip
    public static String toZip(String code){
	String zip = "";
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

	if(code.length() != 32 ||!code.substring(0,1).equals("|") || !code.substring(code.length()-1,code.length()).equals("|")){
	    throw new IllegalArgumentException();
	}
	else {
	    for(int c = 0; c < code.length(); c++){
		if (!code.substring(c,c+1).equals("|") && !code.substring(c,c+1).equals(":")){
			throw new IllegalArgumentException();
		    }
	    }
	    int x = 1;
	    int y = 0;

	    while (x< code.length() - 5 && y < 10){
		if (code.substring(x, x+5).equals(barcode[y])){
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
		checksum = (checksum - Integer.parseInt(zip.substring(zip.length()-1,zip.length()))) % 10;
	    }
	    if (!code.substring(26,31).equals(barcode[checksum])){
		    throw new IllegalArgumentException();
	    }

	}
	return zip.substring(0,5);
    }

    public String getCode(){

	zipToCode();
	int checksum = 0;
	for (int c = 0; c < _zip.length(); c++){
	    barcode += zipToBar[Integer.parseInt(_zip.substring(c,c+1))];
	    checksum += Integer.parseInt(_zip.substring(c,c+1));
	}
	barcode += zipToBar[checksum % 10]+"|";
	return barcode;
    }

    public String getZip(){
	return _zip;
    }
    public boolean equals(barcode other){
	return getZip().compareTo(other.getZip()) == 0;
    }

    private void zipToCode(){
	zipToBar = new String[10];
 	zipToBar[0] = "||:::";
	zipToBar[1] = ":::||";
	zipToBar[2] = "::|:|";
	zipToBar[3] = "::||:";
	zipToBar[4] = ":|::|";
	zipToBar[5] = ":|:|:";
	zipToBar[6] = ":||::";
	zipToBar[7] = "|:::|";
	zipToBar[8] = "|::|:";
	zipToBar[9] = "|:|::";
    }		
			
}
