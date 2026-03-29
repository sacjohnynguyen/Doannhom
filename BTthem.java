// --- ĐÂY LÀ HÀM SẮP XẾP GIẢM DẦN (Copy đoạn này) ---
    void sapXepGiamDan() {
        if (a == null || a.length == 0) return;
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] < a[j]) { // Điều kiện giảm dần
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        System.out.println("\nDa sap xep mang giam dan.");
    }
