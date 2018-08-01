package com.tddstudy.study.bowling;

import java.util.Scanner;

/**
 * 출력 담당 클래스
 */
public class Printing {

    String player;
    //Scanner sc;


    public Printing(){
        player = "LSH";
    }

    public String welcome(){
        String start = "플레이어 이름은(3 english letters)?: ";
        start = start + player;

        System.out.println(start);

        return start;

    }



    public void titleFrames(){
        String titleFrmae = "| NAME |";
        for(int i=0; i< 10 ; i++){
            title = title +
        }
    }

    public void playerFrames(){
        String nameFrame = "|  " + player + " |";
    }
}
