package week2.day1;

public class Library {
	
	public String addBook(String bookTitle) {
		return bookTitle;

	}
	public void issueBook() {
		System.out.println("Book issued successfully");
		
	}

	public static void main(String[] args) {
		Library bookName=new Library();
		Library bookPublish=new Library();
		System.out.println("Book added successfully"+" "+bookName.addBook("Black hole"));
		bookPublish.issueBook();
		

	}

}
