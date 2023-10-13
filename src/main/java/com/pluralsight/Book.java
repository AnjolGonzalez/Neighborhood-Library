package com.pluralsight;

public class Book {
    private int id;
    private String isbn;
    private String title;
    private boolean isCheckOut;
    private String checkedOutTo;

    public Book(int id, String isbn, String title, boolean isCheckOut, String checkedOutTo) {
        this.id = id;
        this.isbn = isbn;
        this.title = title;
        this.isCheckOut = isCheckOut;
        this.checkedOutTo = checkedOutTo;
    }

    public int getId(){
        return id;
    }
    public String getIsbn() {
        return isbn;
    }
    public String getTitle(){
        return title;
    }
    public boolean getIsCheckout() {
        return isCheckOut;
    }
    public String getCheckedOutTo() {
        return checkedOutTo;
    }

    public void checkOut (String bookName) {
        this.checkedOutTo = bookName;
        this.isCheckOut = true;
    }



}
