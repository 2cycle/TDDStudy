package com.tddstudy.study.bowling;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class BowlingGameTest {

    public static int MAX_FRAME = 10;
    BowlingGame bg;

    @Before
    public void Bowling(){
        bg = new BowlingGame();
    }

    @Test
    public void 프레임_갯수_테스트(){
        assertEquals(0,bg.frame.size());
    }

    @Test
    public void 스트라이크출략(){

    }

    @Test
    public void 스페어출력(){

    }

    @Test
    public void 미스출력(){

    }
    //테스트 코드가 세번째 요구사항까지 반영되지 않음

    @Test
    public void 각_프레임_점수_테스트(){
        bg.FrameTrial(4,4);
        //assertEquals(8,(int)bg.frame.get(0));

    }

    @Test
    public void 프레임_총합_점수(){
        for(int i=0; i<MAX_FRAME; i++){
            bg.FrameTrial(4,4);
        }

        assertEquals(80,bg.score());

    }
}