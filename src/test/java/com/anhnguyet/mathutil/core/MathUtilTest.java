/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.anhnguyet.mathutil.core;

import static com.anhnguyet.mathutil.core.MathUtil.getFactorial;
//import static danh rieng cho nhung ham static
//goi ham ma bo qua ten class
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.function.Executable;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

/**
 *
 * @author ISV07
 */
public class MathUtilTest {
    //DDT, tach data ra khoi cau lenh kiem thu, tham so hoa data nay vao trong cau lenh kiem thu
    //chuan bi bo data
    public static Object[][] initData() {
        return new Integer[][] {
            {1, 1},
            {2, 2},
            {5, 120},
            {6, 720}
        };
    }
        
    @ParameterizedTest
    @MethodSource(value="initData") //ten ham cung cap data, ngam dinh thu tu cua cac ptu cua mang, map vao tham so ham
    public void testGetFactorialGivenRightArgReturnsWell(int input, long expected) {
        assertEquals(expected, getFactorial(input));
    }
    
    @Test
    public void testGetFactorialGivenWrongArgThrowException() {
        //dung bieu thuc lambda
        //ham nhan tham so thu 2 la 1 cai object/ co code implement 
        //cai functional interface ten la execute()
//        Executable exObject = new Executable() {
//            @Override
//            public void execute() throws Throwable {
//                getFactorial(-5);
//            }
//        };

        // Executable exObject = () -> getFactorial(-5);
        
        
        
        assertThrows(IllegalArgumentException.class, () -> getFactorial(-5));
    }
}
