public abstract class LibraryBook extends Book implements Comparable<LibraryBook>{
    private String callNumber;

    //constructor
    public LibraryBook(String name, String bookTitle, String isbn, String callNumberc){
	super(name, bookTitle, isbn);
	callNumber = callNumberc;
    }
	    

    //getters and setters
    public String getAuthor(){
	return author;
    }

    public String getTitle(){
	return title;
    }
    
    public String getISBN(){
	return ISBN;
    }

    public String getcallNumber(){
	return callNumber;
    }

    //abstract
    abstract void checkout(String patron, String due);
    abstract void returned();
    abstract String circulationStatus();


    //compare
    public String bookcompareTo(){
	return "penis";
    }

    //string
    public String toStringlib(){
	return title + author + ISBN + circulationStatus() + callNumber;
    }

}
