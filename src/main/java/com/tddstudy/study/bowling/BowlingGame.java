package com.tddstudy.study.bowling;

import java.util.ArrayList;
import java.util.List;

public class BowlingGame {

    public static int MAX_FRAME = 10;

    List<String> frame;

    public BowlingGame(){
        frame = new ArrayList<String>();
    }

    public void FrameTrial(int Ftrial, int Strial){
        if(Ftrial == 10) {
            frame.add("X");
        }

        if(Ftrial + Strial == 10){
            frame.add(Ftrial + " | /");
        }

        if(Ftrial + Strial < 10){
            frame.add(Ftrial + " | " + Strial );
        }
    }

    public int score(){
        int score =0;
        for(int i=0; i<MAX_FRAME ;i++){
            //score += frame.get(i); 
        }
        return score;
    }



}
