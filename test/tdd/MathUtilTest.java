/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tdd;

import org.junit.Test;
import static org.junit.Assert.*;
import thuc.util.MathUtil;

/**
 *
 * @author Judy
 */
public class MathUtilTest {
    
    @Test
    public void testSuccessfulCase(){
        //ham nay test tinh huong thanh cong, tuc la dua dau vao tu te cho ham cF
        //assertEquals(5, 5);
        assertEquals(1, MathUtil.computeFactorial(0));
        assertEquals(1, MathUtil.computeFactorial(1));
        assertEquals(2, MathUtil.computeFactorial(2));
        assertEquals(6, MathUtil.computeFactorial(3));
        assertEquals(24, MathUtil.computeFactorial(4));
        assertEquals(120, MathUtil.computeFactorial(5));
    }
    
    @Test(expected = IllegalArgumentException.class) //moi @Test bien ham thanh mot ham main rieng biet va Shift F6 chay
    //cmt @Test phe ham nay thanh ham bth, ko dc chay trong lan Shift F6
    public void testFailCase(){
        //ham nay test tinh huong khong thanh cong, tuc la dua dau vao tu te cho ham cF
        //vi du cF(-5) sao ma tinh dc, cF(20) to qua
        //ngoai le la 1 thu khong the so sanh
        //Exception la 1 tinh huong ko du lieu dc, do do no ko co value
        //do do ko the so sanh dc, do do ko the xai assertEquals
        //do ham nay no so sanh theo value dua ra mau sac
        //vay ta phai xai chieu khac khi choi voi ngoai le
        //ta ki vong rang khi dua ra cF(-5) thi ham cF() se dua ra cai ngoai le thong bao rang tham so sai
        //cau nay viet the nao trong code de re dc mau xanh hay do
        MathUtil.computeFactorial(-5);
    }
}
//du code ban sai logic nhung ban van ra dc file .jar, .war khi clean & build
//nguy hiem, ko tot
//ta se choi tro disable nut bam clean & build neu code con dang mau do
//choi voi Junit thi lam dc tro nay
//choi truyen thong sout JOptionPanem ghi ra file log thi thua
//kieu nao cung ra dc .far, .war neu ko sai cu phap
//hay nho 2 con so: NB 8.2 1005, NB 10 tro len: 1204
