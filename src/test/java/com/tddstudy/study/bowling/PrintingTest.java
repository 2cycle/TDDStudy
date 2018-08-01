package com.tddstudy.study.bowling;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PrintingTest {

    Printing pr;

    @Before
    public void before(){
        pr = new Printing();

    }


    @Test
    public void 시작문구(){
        assertEquals("플레이어 이름은(3 english letters)?: LSH",pr.welcome());
    }




}