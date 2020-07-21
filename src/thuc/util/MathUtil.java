/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thuc.util;

/**
 *
 * @author Judy
 */
//class nay chua cac ham tien ich ho tro cac phep tinh toan
//vi may la tien ich ham y dung chung cho moi noi
//do do chung may la static
public class MathUtil {
    //ham giai thua n1= 1,2,3...n bung no ket qua rat nhanh
    //nen tran int (2 ti 1) som, ta tra long co 15! thoi
    public static long computeFactorial(int n){
        //cu viet, sai dung tu tu tinh sau
        long result = 1;
        for (int i = 1; i <= n; i++) {
            result *=i;
        }
        return result;
    }
}
