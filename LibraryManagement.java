package week2.day1;

public class LibraryManagement {

	public static void main(String[] args) {
		Library bookName=new Library();
		Library bookPublish=new Library();
		System.out.println("Book added successfully"+" "+bookName.addBook("Black hole"));
		bookPublish.issueBook();

	}

}
