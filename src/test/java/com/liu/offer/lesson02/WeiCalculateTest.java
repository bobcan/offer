package com.liu.offer.lesson02;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;

/**
 * Created by 刘林林 on 2016/2/27.
 */
public class WeiCalculateTest {

    @Test
    public void testNumberOf1_one() throws Exception {
//        assertEquals(1,WeiCalculate.NumberOf1_thr(8));
        assertEquals(4,WeiCalculate.NumberOf1_thr(15));
    }
}