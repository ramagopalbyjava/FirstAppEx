package com.ram.test;

import com.ram.zapcom.test.AddTest;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Demo {

    @Test
   public void testAddMethod(){
        AddTest at=new AddTest();
        int expectedResult=at.addMethod(2,4);
        int actualResult=6;
        assertEquals(actualResult,expectedResult);
    }

    @Test
    public void testSubMethod(){
        AddTest ats=new AddTest();
        int expectedResults=  ats.subMethod(8,2);
        int actualResults=6;
        assertEquals(actualResults,expectedResults);
    }

    @Test
    public void testMulMethod(){
        AddTest atss=new AddTest();
        int expectedResulte= atss.mulMethod(6,8);
        int actualResulte=48;
        assertEquals(actualResulte,expectedResulte);
    }

}
