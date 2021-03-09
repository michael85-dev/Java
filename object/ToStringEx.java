package object;

class Book {
	int bookNumber;
	String bookTitle;
	
	Book(int bookNumber, String bookTitle) {
		this.bookNumber = bookNumber;
		this.bookTitle = bookTitle;
	}
	
	@Override
	public String toString() {
		return bookTitle + "," + bookTitle;
	}
}

public class ToStringEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book book1 = new Book(200, "����");
		
		System.out.println(book1);
		System.out.println(book1.toString());

	}

}
