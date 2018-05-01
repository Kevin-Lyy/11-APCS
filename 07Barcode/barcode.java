public class barcode implements Comparable<barcode>{
    String zip;
    String barcode;
    String[] Barcode;

    //constructor 
    public barcode(String zipp){
	zip = zipp;
		if (zipp.length() != 5){
			throw new IllegalArgumentException();
		}
		try{
			for (int c = 0; c < zip.length();c++){
					Integer.parseInt(zip.substring(c,c+1));
				}
			}
			catch(NumberFormatException e){
				throw new IllegalArgumentException();
			}
	}
   

    public String getZip(){
    	return zip;
    }
    
    public String getCode(){
    	return toCode(zip);
    }
    public boolean equals(barcode other){
    	return getZip().compareTo(other.getZip()) == 0;
    }
    
    //returns the barcode in string
    public String toString(){
    	return getCode()+" (" +getZip() +")";
    }

    //compares barcode
    public int compareTo(barcode other){
    	return getZip().compareTo(other.getZip());
    }
    
    private void zipToCode(int digit){
    	String[] Barcode={"||:::",":::||", "::|:|", "::||:", ":|::|", ":|:|:", ":||::", "|:::|", "|::|:", "|:|::"};
    }		
	

    //converts barcode to number
    public static String toCode(String zip){
    	if (zip.length() != 5){
    		throw new IllegalArgumentException();
    	}
	    try{
	    	for (int c=0; c < zip.length(); c++){
	    		Integer.parseInt(zip.substring(c,c+1));
	    	}
	    }
	    catch(NumberFormatException e){
	    	throw new IllegalArgumentException();
		}
	    
    	String[] Barcode = {"||:::",":::||", "::|:|", "::||:", ":|::|", ":|:|:", ":||::", "|:::|", "|::|:", "|:|::"};
    	int sum = 0;
    	String finalBarCode = "|";
    	
    	for(int c = 0;c < zip.length();c++){
    		finalBarCode += Barcode[Integer.parseInt(zip.substring(c,c+1))];
    		sum += Integer.parseInt(zip.substring(c, c+1));;
    	}
    	finalBarCode += Barcode[sum%10]+ "|";
    	return finalBarCode;
    }

    //converts the barcode to zip
    public static String toZip(String code){
    	String zip = "";
    	int sum = 0;
    	int sumBar = 0;
    	String[] Barcode = {"||:::",":::||", "::|:|", "::||:", ":|::|", ":|:|:", ":||::", "|:::|", "|::|:", "|:|::"};
   
    	if(code.length() != 32 ||!code.substring(0,1).equals("|") || !code.substring(code.length()-1,code.length()).equals("|")){
    		throw new IllegalArgumentException();
    	}
    	for(int c = 0; c < code.length(); c++){
    		if (!code.substring(c,c+1).equals("|") && !code.substring(c,c+1).equals(":")){
    			throw new IllegalArgumentException();
    		}
    	}
    	for(int c = 0; c < code.length();c+=5) {
    		for(int i = 0; i < 10; i++) {
    			if(code.substring(c,c+5).compareTo(Barcode[i])==0) {
    				sum += i;
    				zip += "" + i;
    			}
    		}
    	}
    	for(int c = 0; c< 10;c++) {
    		if(code.substring(25,30).equals(Barcode[c])) {
    			sumBar = c;
    		}
    	}
    	if(sum%5 != sumBar) {
    		throw new IllegalArgumentException();
    	}

    	return zip.substring(0, 5);
    }
}


  
