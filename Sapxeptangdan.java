
import java.util.*;

public class Sapxeptangdan {
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
        for(int x : a){
            System.out.print(x + " ");
        }
        System.out.println();
    }

    // Sắp xếp tăng dần
    void sapXepTang(){
        Arrays.sort(a);
    }

    // Sắp xếp giảm dần
    void sapXepGiam(){
        for(int i = 0; i < a.length - 1; i++){
            for(int j = i + 1; j < a.length; j++){
                if(a[i] < a[j]){
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
    }

    // Tìm max
    int timMax(){
        int max = a[0];
        for(int x : a){
            if(x > max) max = x;
        }
        return max;
    }

    // Tìm min
    int timMin(){
        int min = a[0];
        for(int x : a){
            if(x < min) min = x;
        }
        return min;
    }

    public static void main(String[] args) {
        BTthem mang = new BTthem();

        mang.sinhMang(10);

        mang.in("Mang ban dau:");

        mang.sapXepTang();
        mang.in("Mang sau khi sap xep tang dan:");

        mang.sapXepGiam();
        mang.in("Mang sau khi sap xep giam dan:");

        System.out.println("\nGia tri lon nhat: " + mang.timMax());
        System.out.println("Gia tri nho nhat: " + mang.timMin());
    }
}