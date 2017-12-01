Public Class CirculatingBook extends LibraryBook{
    private String currentHolder;
    private String dueDate;

    //constructor
    public CirculatingBook(String name, String bookTitle, String isbn, String callNumberc, String Currentholder, String duedate){
	super(name, bookTitle, isbn, callNumberc);
	currentHolder = "null";
	dueDate = "null";
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
    public String getCurrentholder(){
	return currentHolder;
    }
    public String getdueDate(){
	return dueDate();
    }

    //void

    public void checkout(String namea, String date){
	currentHolder = namea;
	dueDate = date;
    }

    public void returned(){
	currentHolder = "null";
	dueDate = "null";
    }

    public String circulationStatus(){
	if(currentHolder == "null"){
	    return "book availble on shelves";
	}
	return currentHolder + dueDate;
    }

    public String toString(){
	return title + author + ISBN + circulationStatus() + callNumber +currentHolder + dueDate;
    }

    
}
