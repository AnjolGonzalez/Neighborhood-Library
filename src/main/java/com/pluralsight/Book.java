package com.pluralsight;

public class Book {
    private int id;
    private String isbn;
    private String title;
    private boolean isCheckedOut;
    private String checkedOutTo;


    public Book(int id, String isbn, String title, String checkedOutTo, boolean isCheckedOut) {
        this.id = id;
        this.isbn = isbn;
        this.title = title;
        this.isCheckedOut = isCheckedOut;
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
    public boolean getIsCheckedout() {
        return isCheckedOut;
    }
    public String getCheckedOutTo() {
        return checkedOutTo;
    }
    public void setId(int id){
        this.id = id;
    }
    public void setIsbn(String isbn){
        this.isbn = isbn;
    }
    public void setTitle(String title){
        this.title = title;
    }
    public void setCheckedOut(boolean checkedOut){
        this.isCheckedOut = checkedOut;
    }
    public void setCheckedOutTo(String checkedOutTo){
        this.checkedOutTo = checkedOutTo;
    }

    public void checkOut (String bookName) {
        this.checkedOutTo = bookName;
        this.isCheckedOut = true;
    }
    public void checkIn(){
        this.checkedOutTo = "";
        this.isCheckedOut = false;
    }
    public String toStringAvailableBooks() {
        return  "Book ID: " + this.id + "; Book ISBN: " + this.isbn + "; Book Title: " + this.title;
    }

}
