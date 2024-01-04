package com.ohgiraffers.test.controller;

import com.ohgiraffers.hw2.model.comparator.AscCategory;
import com.ohgiraffers.hw2.model.comparator.DescCategory;
import com.ohgiraffers.test.model.dto.BookDTO;

import java.util.ArrayList;

public class BookManager {

    ArrayList<BookDTO> bookList = new ArrayList<>();

    public BookManager() {
        new ArrayList<BookDTO>();

    }

    public void addBook(BookDTO book){
        bookList.add(book);
    }

    public void deleteBook(int index){
        if(index == -1){
            System.out.println("삭제할 도서가 존재 하지 않습니다. ");
        }else {
            bookList.remove(index);
        }

    }

    public int searchBook(String bTitle){

        int result = -1;

        for(int i = 0; i < bookList.size(); i++){
            if(bookList.get(i).getTitle().equals(bTitle)){
                result = i;
            }
        }
        return result;
    }

    public void printBook(int index){
        if(index == -1){
            System.out.println("조회할 도서가 없습니다");
        }else{
            System.out.println(bookList.get(index).toString());
        }
    }

    public void displayAll(){
        for(int i = 0; i < bookList.size(); i++){
            System.out.println(bookList.get(i).toString());
        }
    }

    public ArrayList<BookDTO> sortedBookList(int select){
        if(select == 1){
            bookList.sort(new AscCategory());
        }else if (select == 2){
            bookList.sort(new DescCategory());
        }
        return bookList;
    }

    public void printBookList(ArrayList<BookDTO> br){
        for(BookDTO book : br){
            System.out.println(book);
            if(book == null){
                break;
            }
        }
    }
}
