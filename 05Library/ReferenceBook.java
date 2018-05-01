public class ReferenceBook extends LibraryBook{
    private String collection;

    //constructor
    public ReferenceBook(String author, String title, String ISBN,String callNumber, String collection){
    	super (author, title, ISBN, callNumber);
		this.collection = collection;
    }
    //getters and setters
    public String getCollection(){
    	return collection;
    }

    public void setCollection(String collection){
    	this.collection = collection;
    }

    //non-returns
    public void checkout(String something, String somethingelse){
    	System.out.println("cannot check out reference book");
    }
    public void returned(){
    	System.out.println("reference book could not have been checked out--return impossible");
    }
    public String circulationStatus(){
    	return "non-circulating refernce book";
    }

    //string
    public String toStringlib(){
    	return getTitle()+", "+getAuthor()+", "+getISBN()+", "+circulationStatus()+", "+getCallNumber()+", "+getCollection();
    }
    

}
