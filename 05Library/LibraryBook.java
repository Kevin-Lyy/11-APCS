public abstract Class LibraryBook extends Book implements Comparable<LibraryBook>{
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
    abstract String circulationStatus(){
	return circulationStatus;
    }

    //compare
    public string bookcompareTo(){
    }

    //string
    public String toStringlib(){
	return super(toString)+ circulationstatus+ callNumber;
    }

}
