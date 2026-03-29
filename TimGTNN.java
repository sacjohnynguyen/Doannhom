
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
    void timMin() {
        if (a == null || a.length == 0) {
            System.out.println("Mang rong!");
            return;
        }
        
        int min = a[0];
        for (int i = 1; i < a.length; i++) {
            if (a[i] < min) {
                min = a[i];
            }
        }
        System.out.println("gia tri nho nhat la: " + min);
    }
    public static void main(String[] args) {
        ThaySanh mang = new ThaySanh();
        mang.sinhMang(10);
        mang.in("Hien thi noi dung");
        mang.timMin();
    }
}
