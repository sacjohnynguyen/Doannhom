
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
    void inChanDong() {
        int i = 0;
        int dem = 1;
        while (i < a.length) {
            System.out.print("Chan dong " + dem + ": ");
            System.out.print(a[i] + " ");
            while (i < a.length - 1 && a[i] >= a[i + 1]) {
                i++;
                System.out.print(a[i] + " ");
            }
            System.out.println();
            i++;
            dem++;
        }
    }
    public static void main(String[] args) {
        ThaySanh mang = new ThaySanh();
        mang.sinhMang(10);
        mang.in("Hien thi noi dung");
        mang.inChanDong();
    }
}
