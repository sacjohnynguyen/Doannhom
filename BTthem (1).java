package sinhmang;
import java.util.*;

public class BTthem {
    int []a;

    void sinhMang(int n){
        Random rd = new Random();
        a = new int[n];
        for(int i=0;i<n;i++){
            // Lưu ý: rd.nextInt(1, 10) yêu cầu Java 17 trở lên
            a[i] = rd.nextInt(9) + 1; 
        }
    }

    void in(String t){
        System.out.println("\n" + t);
        for(int i=0;i<a.length;i++){
            System.out.print(a[i] + " ");
        }
        System.out.println(); // Xuống dòng sau khi in xong
    }

    // Cách 1: Sử dụng thư viện có sẵn (Nhanh và tối ưu)
    void sapXepNhanh() {
        Arrays.sort(a);
    }

    // Cách 2: Tự viết thuật toán Bubble Sort (Để học tập)
    void sapXepNoiBot() {
        int n = a.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (a[j] > a[j + 1]) {
                    // Hoán vị
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }
    }
     
    public static void main(String[] args) {
        BTthem mang = new BTthem();
        mang.sinhMang(10);
        mang.in("Mảng ban đầu:");

        // Gọi hàm sắp xếp
        mang.sapXepNoiBot();
        mang.in("Mảng sau khi sắp xếp (Bubble Sort):");
    }
}