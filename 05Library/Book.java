Public class Book{
    private String author;
    private String title;
    private String ISBN;

    //null constructor 
    public Book(){
	
    }
    //actual constructor
    public Book(String name,String booktitle,String isbn){
	author = name;
	title = booktitle;
	ISBN = isbn;
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
    

    //tostring
    public String toString(){
	return title + author + ISBN;
    }
    

}
