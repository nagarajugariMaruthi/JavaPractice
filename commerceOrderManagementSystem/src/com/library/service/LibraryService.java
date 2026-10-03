package com.library.service;

import java.util.*;

import com.library.model.Book;
import com.library.model.Member;

public class LibraryService {

    // 1. ArrayList - Store books
    private List<Book> books = new ArrayList<>();

    // 2. HashSet - Store unique members
    private Set<Member> members = new HashSet<>();

    // 3. HashMap - Book ID -> Book
    private Map<Integer, Book> bookMap = new HashMap<>();

    // 4. HashMap - Member ID -> Member
    private Map<Integer, Member> memberMap = new HashMap<>();

    // 5. HashMap - Book ID -> Member who issued it
    private Map<Integer, Member> issuedBooks = new HashMap<>();

    // 6. Stack - Recently viewed books
    private Stack<Book> recentlyViewedBooks = new Stack<>();

    // 7. Queue - Waiting members
    private Queue<Member> waitingQueue = new LinkedList<>();


    // 1. Add Book
    public void addBook(Book book) {

        books.add(book);
        bookMap.put(book.getBookId(), book);

        System.out.println("Book added successfully.");
    }


    // 2. Remove Book
    public void removeBook(int bookId) {

        Book book = bookMap.get(bookId);

        if (book == null) {
            System.out.println("Book not found.");
            return;
        }

        books.remove(book);
        bookMap.remove(bookId);

        System.out.println("Book removed successfully.");
    }


    // 3. Search Book
    public void searchBook(String title) {

        boolean found = false;

        for (Book book : books) {

            if (book.getTitle().equalsIgnoreCase(title)) {

                System.out.println(book);

                // Add to recently viewed stack
                recentlyViewedBooks.push(book);

                found = true;
            }
        }

        if (!found) {
            System.out.println("Book not found.");
        }
    }


    // 4. Display All Books
    public void displayAllBooks() {

        if (books.isEmpty()) {
            System.out.println("No books available.");
            return;
        }

        for (Book book : books) {
            System.out.println(book);
        }
    }


    // 5. Add Member
    public void addMember(Member member) {

        if (members.add(member)) {

            memberMap.put(member.getMemberId(), member);

            System.out.println("Member added successfully.");

        } else {

            System.out.println("Member already exists.");
        }
    }


    // 6. Issue Book
    public void issueBook(int bookId, int memberId) {

        Book book = bookMap.get(bookId);
        Member member = memberMap.get(memberId);

        if (book == null) {
            System.out.println("Book not found.");
            return;
        }

        if (member == null) {
            System.out.println("Member not found.");
            return;
        }

        if (book.isIssued()) {

            waitingQueue.offer(member);

            System.out.println(
                    "Book already issued. Member added to waiting queue.");

            return;
        }

        book.setIssued(true);

        issuedBooks.put(bookId, member);

        System.out.println("Book issued successfully.");
    }


    // 7. Return Book
    public void returnBook(int bookId) {

        Book book = bookMap.get(bookId);

        if (book == null) {
            System.out.println("Book not found.");
            return;
        }

        if (!book.isIssued()) {

            System.out.println("Book is not currently issued.");
            return;
        }

        book.setIssued(false);

        issuedBooks.remove(bookId);

        System.out.println("Book returned successfully.");

        // Check waiting queue
        if (!waitingQueue.isEmpty()) {

            Member nextMember = waitingQueue.poll();

            book.setIssued(true);

            issuedBooks.put(bookId, nextMember);

            System.out.println(
                    "Book automatically issued to waiting member: "
                    + nextMember.getName());
        }
    }


    // 8. Show Issued Books
    public void showIssuedBooks() {

        if (issuedBooks.isEmpty()) {

            System.out.println("No books are currently issued.");

            return;
        }

        for (Map.Entry<Integer, Member> entry : issuedBooks.entrySet()) {

            int bookId = entry.getKey();

            Member member = entry.getValue();

            Book book = bookMap.get(bookId);

            System.out.println(
                    "Book: " + book.getTitle()
                    + " | Issued To: " + member.getName());
        }
    }


    // 9. Search Member
    public void searchMember(int memberId) {

        Member member = memberMap.get(memberId);

        if (member != null) {

            System.out.println(member);

        } else {

            System.out.println("Member not found.");
        }
    }


    // 10. Sort Books
    public void sortBooks() {

        Collections.sort(
                books,
                Comparator.comparing(Book::getTitle)
        );

        System.out.println("Books sorted by title.");

        displayAllBooks();
    }


    // 11. Recently Viewed Books
    public void showRecentlyViewedBooks() {

        if (recentlyViewedBooks.isEmpty()) {

            System.out.println("No recently viewed books.");

            return;
        }

        System.out.println("Recently Viewed Books:");

        Iterator<Book> iterator =
                recentlyViewedBooks.iterator();

        while (iterator.hasNext()) {

            System.out.println(iterator.next());
        }
    }


    // 12. Waiting Queue
    public void showWaitingQueue() {

        if (waitingQueue.isEmpty()) {

            System.out.println("Waiting queue is empty.");

            return;
        }

        System.out.println("Waiting Members:");

        for (Member member : waitingQueue) {

            System.out.println(member);
        }
    }
}