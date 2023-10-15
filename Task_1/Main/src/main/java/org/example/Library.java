package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Library {
    private List<Media> library = new ArrayList<>();

    public void lookBookList(){
        for (Media media : this.library) {
            System.out.printf(media.getName() + " | "
                    + media.getAuthor() + " | "
                    + media.getGenre());
        }
    }

    public void addBook(Media book){
        library.add(book);
    }

    public void deleteBook(String bookName){
        this.library.removeIf(media -> Objects.equals(media.getName(), bookName));
    }

    public Media giveBook(String bookName){
        for (Media media : library){
            if (Objects.equals(media.getName(), bookName)){
                library.remove(media);
                return media;
            }
        }
        return null;
    }
}
