public class Stack{
	private Book current;
	private Book previous;
	
	public Stack(){
		this.previous = null;
		this.current = null;
	}

	public void push(Book newBook){

		if(this.current == null){

			this.current = newBook;

		} else {

			newBook.setPrevious(current);

			current = newBook;
		}
	}

	public void pop(){

		Book nameHolder = current;
		current = current.getPrevious();
		System.out.println(nameHolder.getName() + " has been removed from the stack.");
		nameHolder = null;
	}

	public void peek(){
		System.out.println(current.getName() + " is at the top of the stack.");
	}
}