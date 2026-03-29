
import java.util.*;

public class sapxepmang {
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
        System.out.println();
    }

    // Sắp xếp mảng tăng dần
    void sapXepTang(){
        for(int i = 0; i < a.length - 1; i++){
            for(int j = i + 1; j < a.length; j++){
                if(a[i] > a[j]){
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        BTthem mang = new BTthem();

        mang.sinhMang(10);              // tạo mảng 10 phần tử
        mang.in("Mang ban dau");

        mang.sapXepTang();              // sắp xếp
        mang.in("Mang sau khi sap xep tang");
    }
}-