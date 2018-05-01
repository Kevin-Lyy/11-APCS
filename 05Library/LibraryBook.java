public abstract class LibraryBook extends Book implements Comparable<LibraryBook>{
    private String callNumber;

    //constructor
    public LibraryBook(String author, String title, String ISBN, String callNumber){
	super(author, title, ISBN);
	this.callNumber = callNumber;
    }
	    

    //getters and setters

    public String getCallNumber(){
    	return callNumber;
    }
    
    public void setCallNumber(String callNumber){
    	this.callNumber = callNumber;
    }

    //abstract
    public abstract void checkout(String patron, String due);
    
    public abstract void returned();
    
    public abstract String circulationStatus();


    //compare
    public int compareTo(LibraryBook other){
    	return getCallNumber().compareTo(other.getCallNumber());
    }

    //string
    public String toStringlib(){
    	return getTitle()+", "+getAuthor()+", "+getISBN()+", "+circulationStatus()+", " +getCallNumber();
    }

}
