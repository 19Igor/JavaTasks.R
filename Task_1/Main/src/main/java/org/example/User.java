package org.example;

import java.util.ArrayList;
import java.util.List;

public class User {
    private List<Media> userBooks = new ArrayList<>();

    private String Name;

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    // при использовании данной функции нужно делать проверку, что книга оказалась в библиотеке
    public void getBook(String bookName, Library library){
        userBooks.add(library.giveBook(bookName));
    }

    public void returnBook(Media book, Library library){
        userBooks.remove(book);
        library.addBook(book);
    }

    public void showUserBooks(){
        for (Media media : userBooks)
            System.out.println(media);
    }

    public List<Media> getUserBooks() {
        return userBooks;
    }

    public void setUserBooks(List<Media> userBooks) {
        this.userBooks = userBooks;
    }
}
