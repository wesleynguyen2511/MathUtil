/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mathutil;
import static thuc.util.MathUtil.computeFactorial;
/**
 *
 * @author Judy
 */
public class MathUtil {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("5! = " + computeFactorial(5));
        //expected: ham oi tao hy vong may oi ve 120 khi dua 5 cho may
        System.out.println("5! = " + computeFactorial(5));
        //720
        System.out.println("5! = " + computeFactorial(6));
        //1
        System.out.println("5! = " + computeFactorial(0));
        //ngoai le
        System.out.println("5! = " + computeFactorial(-5));
        //phan code cua ham main ta dang viet kieu nay goi la test app
        //xem thu cai ham cF tinh giai thua chay co dung ko
        //de test phan mem ta lam viec sau
        //1. chuan bi data vi du 5, 6, 7, 0, 1, 2
        //2. tinh toan truoc bang tay xem 5!, 6!, 0! la2 may
        //vi du tinh truoc duoc 6! = 720, 720 goi la gt ki vong (EXPECTED VALUE)
        //3. goi lenh, goi app, goi ham chay thu voi date da chuan bi
        //coi xem ham tra ve so may ket qua la may
        //vi du khi chay ham cF no tra ve 120, thi gia tri tra ve khi ham chay goi la
        //ACTUAL VALUE
        //4.phai so sanh xem EXPECTED va ACTUAL co trung nhau hay khong
        //neu trung: tuc la ham xu li ra ket qua nhu minh du kien -> ham chay dung
        //neu ko trung: minh tinh sai hay ham tinh sai noi chung la sai
        //TEST: ban chat la chay thu APP/HAM so sanh ket qua ki vong co truoc voi ket qua ham
        //thuc su xu li tra ve
        
        //cach test nay don gian, nhung chua hay
        //vi minh nhin ket qua bang mat, tu so sanh giua gia tri tra ve cua ham va ki vong
        //them nua no ko can minh disable nut Clean & Build
        //code sai logic ma van ra file .jar, .war
        //ta can 1 cach khac de dam bao chat luong code ngay khi viet code
        //ta can dung them thu vien phu tro giup kiem soat chat luong code
        //do la ki thuat TDD kem UNIT TESTING
        
        //xai thu vien JUnit, NUnit, TestNG, xUnit, MSUnit, PHUnit, CPPUnit,...
        //nhung thu vien nay ko bat minh phai so sanh bang mat cac ACTUAL vs EXPECTED
        //no tu so sanh
    }
    
}
