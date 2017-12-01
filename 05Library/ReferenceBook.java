Public Class ReferenceBook extends LibraryBook{
    private String collection;

    //constructor
    public ReferenceBook(String name, String bookTitle, String isbn,String callNumber, String collectionc){
	super (name, bookTitle, isbn, callNumberc);
	collection = collectionc;
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

    public String getcollection(){
	return collection;
    }

    //void
    

}
