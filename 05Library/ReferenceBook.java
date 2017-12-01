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

    //non-returns
    public void checkout(){
	return "cannot check out reference book";
    }
    public void returned(){
	return "reference book could not have been checked out--return impossible";
    }
    public String circulationStatus(){
	return "non-circulating refernce book";
    }

    //string
    public String toStringlib(){
	return title + author + ISBN + circulationStatus() + callNumber+ collection;
    }
    

}
