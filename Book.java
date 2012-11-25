public class Book{
	private String title;
	private Book previous;
	
	public Book(String title){
		this.title = title;
		this.previous = null;
	}

	public void setPrevious(Book oldBook){
		this.previous = oldBook;
		System.out.println(title + " has been added to the stack.");
	}

	public String getName(){
		return title;
	}

	public Book getPrevious(){
		return previous;
	}
}