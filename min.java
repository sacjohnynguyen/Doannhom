package sinhmang;
import java.util.*;

public class min{
    int[] a;

    // Sinh mảng ngẫu nhiên
    void sinhMang(int n){
        Random rd = new Random();
        a = new int[n];
        for(int i = 0; i < n; i++){
            a[i] = rd.nextInt(1, 10);
        }
    }

    // In mảng
    void in(String t){
        System.out.println("\n" + t);
        for(int i = 0; i < a.length; i++){
            System.out.print(a[i] + " ");
        }
    }

    // Tìm giá trị nhỏ nhất
    int timMin(){
        int min = a[0];
        for(int i = 1; i < a.length; i++){
            if(a[i] < min){
                min = a[i];
            }
        }
        return min;
    }

    public static void main(String[] args) {
        BTthem mang = new BTthem();

        mang.sinhMang(10);      // tạo mảng 10 phần tử
        mang.in("Hien thi mang");

        int min = mang.timMin();
        System.out.println("\nGia tri nho nhat: " + min);
    }
}