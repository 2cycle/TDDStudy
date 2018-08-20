package com.tddstudy.study.bowling;

import java.util.ArrayList;
import java.util.List;

public class ScoreBoard {

    List<Character> list;

    public String starter( String player){

        return "플레이어의 이름은(3 englishi letters) : " + player;


    }

    public String frameNumber(){

        String frame = "| NAME |";

        for(int i = 1; i <= 10 ; i++){


            frame += getStringFrameValue(i) + " |";
        }

        return frame;
    }


    /**
     * get Start index in String list in position
     * @param frameNum
     * @return
     */
    public String getStringFrameValue(int frameNum){

        String frameName = "";
        int minusV = 6 - frameNum ;
        int firstPos = minusV / 2 + minusV % 2;
        for(int i=0; i <= firstPos ; i++){
            frameName = " " + frameName;
        }

        return frameName + zeroFill(frameNum);


    }


    /**
     * fill zero each FrameNumber
     * @param eacheFrameNum
     * @return
     */
    public String zeroFill(int eacheFrameNum){

        String eachFrame = Integer.toString(eacheFrameNum);
        if(eacheFrameNum < 10){
            eachFrame = "0" + eachFrame;
        }

        return eachFrame;
    }

}
