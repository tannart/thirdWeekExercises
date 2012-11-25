public class Supermarket{
	
	public static void main(String[] args){

		Stack theStack = new Stack();

		Book book1 = new Book("LOTR");
		Book book2 = new Book("The Old Devils");
		Book book3 = new Book("Point Counter Point");
		Book book4 = new Book("Brideshead Revisited");
		Book book5 = new Book("The Variety of Life");
		Book book6 = new Book("Our Man in Havana");

		theStack.push(book1);
		theStack.push(book2);
		theStack.push(book3);
		theStack.push(book4);
		theStack.push(book5);
		theStack.push(book6);

		theStack.peek();

		theStack.pop();
		theStack.pop();
		theStack.pop();

		theStack.peek();

	}
}