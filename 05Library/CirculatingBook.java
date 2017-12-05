public class CirculatingBook extends LibraryBook{
    private String currentHolder;
    private String dueDate;

    //constructor
    public CirculatingBook(String author, String title, String ISBN, String callNumber){
	super(author, title, ISBN, callNumber);
	currentHolder = "null";
	dueDate = "null";
    }
    
    //getters and setters
    public String getCurrentHolder(){
	return currentHolder;
    }
    public String getDueDate(){
	return dueDate;
    }

    public void setCurrentHolder(String currentHolder){
	this.currentHolder = currentHolder;
    }

    public void setDueDate(String dueDate){
	this.dueDate = dueDate;
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
	return getCurrentHolder()+ ", " + getDueDate();
    }


    public String toString(){
	return getTitle()+", "+getAuthor()+", "+getISBN()+", "+circulationStatus()+", "+getCallNumber();
    }

    
}
