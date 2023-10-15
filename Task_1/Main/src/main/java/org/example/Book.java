package org.example;

public class Book extends Media{

    private int pageCount;

    private int getPageCount(){
        return pageCount;
    }

    private void setPageCount(int number){
        this.pageCount = number;
    }
}
