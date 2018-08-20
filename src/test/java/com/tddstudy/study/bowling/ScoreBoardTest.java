package com.tddstudy.study.bowling;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ScoreBoardTest {


    ScoreBoard scoreBoard;

    @Before
    public void before(){
        scoreBoard = new ScoreBoard();

    }



    @Test
    public void 시작문구(){
        assertEquals("플레이어의 이름은(3 englishi letters) : LSH",scoreBoard.starter("LSH"));
    }

    @Test
    public void 프레임_이름_구하기(){
        assertEquals("  04 ",scoreBoard.getStringFrameValue(4));
    }

    @Test
    public void 각_프레임_0채우기(){
        assertEquals("10",scoreBoard.zeroFill(10));
    }

    @Test
    public void 각프레임순서출력(){
        scoreBoard.frameNumber();
    }


}