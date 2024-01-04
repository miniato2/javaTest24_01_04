package com.ohgiraffers.hw2.model.comparator;

import com.ohgiraffers.test.model.dto.BookDTO;

import java.util.Comparator;

public class AscCategory implements Comparator<BookDTO>{
    @Override
    public int compare(BookDTO o1, BookDTO o2) {

        if(o1.getCategory() >= o2.getCategory()){
            return 1;
        }else if(o1.getCategory() <= o2.getCategory()){
            return -1;
        }
        return 0;
    }
}
