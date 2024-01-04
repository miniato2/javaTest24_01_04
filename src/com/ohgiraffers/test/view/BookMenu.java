package com.ohgiraffers.test.view;

import com.ohgiraffers.test.controller.BookManager;
import com.ohgiraffers.test.model.dto.BookDTO;

import java.util.Scanner;

public class BookMenu {

    private Scanner sc = new Scanner(System.in);

    private BookManager bm = new BookManager();

    public BookMenu(){}

    public void menu(){
        while(true){
            System.out.println(" 메인 메뉴 ");
            System.out.println(" 1. 도서 추가 ");
            System.out.println(" 2. 도서 삭제 ");
            System.out.println(" 3. 도서 조회 ");
            System.out.println(" 4. 도서 전체 조회");
            System.out.println(" 5. 도서 정렬 후 출력");
            System.out.println(" 9. 프로그램 종료");
            System.out.print(" 메뉴 선택 : ");
            int num = sc.nextInt();
            sc.nextLine();

            switch (num) {
                case 1 :
                    bm.addBook(inputBook());
                    break;
                case 2:
                    bm.deleteBook(bm.searchBook(inputBookTitle()));
                    break;
                case 3:
                    bm.printBook(bm.searchBook(inputBookTitle()));
                    break;
                case 4 :
                    bm.displayAll();
                    break;
                case 5 :
                    System.out.print("도서 정렬방식 선택 (1. 오름차순 / 2. 내림차순) :");
                    int select = sc.nextInt();
                    sc.nextLine();

                    if(select == 1 || select == 2){
                        bm.printBookList(bm.sortedBookList(select));
                    }else{
                        System.out.println("잘못된 입력입니다. ");
                    }
                    break;
                case 9 :
                    return;
                default:
                    System.out.println("잘못된 입력입니다.");
            }

        }
    }

    public BookDTO inputBook(){

        System.out.print("도서 번호 : ");
        int bNo = sc.nextInt();
        sc.nextLine();

        System.out.print("도서 제목 : ");
        String bTitle = sc.nextLine();

        System.out.print("도서 카테고리 (1.인문 / 2.과학 / 3.취미) :  ");

        int category = sc.nextInt();
        sc.nextLine();

        System.out.print("저자 : ");
        String author = sc.nextLine();

        return new BookDTO(category, bTitle, author);
    }

    public String inputBookTitle(){
        System.out.print("검색할 도서 제목 : ");
        String bTitle = sc.nextLine();
        return bTitle;

    }
}
