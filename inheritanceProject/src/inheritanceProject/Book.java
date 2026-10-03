package inheritanceProject;

public class Book {

 int Bookid;
 String Bookname;
 String author;
 
  Book(int Id , String name , String author) {
	  
	  this.Bookid = Id;
	  this.Bookname = name;
	  this.author = author;
  }

  
  @Override 
  public String toString() {
   return "Book [BookId=" + Bookid +
          ", BookName=" + Bookname +
          ", Author=" + author + "]";
  }
}


