
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
 void timMax() {
        if (a == null || a.length == 0) {
            System.out.println("Mảng rỗng!");
            return;
        }
        
        int max = a[0]; // Giả sử phần tử đầu tiên là lớn nhất
        for (int i = 1; i < a.length; i++) {
            if (a[i] > max) {
                max = a[i]; // Cập nhật lại max nếu tìm thấy số lớn hơn
            }
        }
        System.out.println("Giá trị lớn nhất trong mảng là: " + max);
    }
    public static void main(String[] args) {
        ThaySanh mang = new ThaySanh();
        mang.sinhMang(10);
        mang.in("Hien thi noi dung");
       mang.timMax(); 
    }
}
