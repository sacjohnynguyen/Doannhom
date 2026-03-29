
package thaysanh;
import java.util.*;
public class ThaySanh {
    int []a;
    void sinhMang(int n){
        Random rd = new Random();
        a = new int[n];
        for(int i=0;i<n;i++){
            a[i] = rd.nextInt(1,10);
        }
    }
    void in(String t){
        System.out.println("\n"+ t);
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
    }
 void sapXepGiamDan() {
        if (a == null) return;
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] < a[j]) { // Dấu < để đổi sang giảm dần
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        ThaySanh mang = new ThaySanh();
        mang.sinhMang(10);
        mang.in("Hien thi noi dung");
       mang.sapXepGiamDan();
        mang.in("Mảng sau khi sắp xếp GIẢM DẦN:");
    }
}
