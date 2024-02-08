import java.util.Scanner;
import java.util.Random;
public class BaiTapVeMang {
    // Khai bao mang so nguyen
    float a[];
    // So luong phan tu
    int n;

    public BaiTapVeMang(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào số lượng phần tử của mảng:");
        n = sc.nextInt();
        a = taoMangSoThuc(n);
        printA();
    }

    // Viết pt in ra mảng
    public void printA(){
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+" ");
        }
    }

    // Viết pt trả về mảng số thực n phần tử
    public float[] taoMangSoThuc(int n){
        Random r = new Random();
        float[] temp = new float[n];
        for (int i = 0; i < n; i++) {
            temp[i] = r.nextFloat();
        }
        return temp;
    }

    // Thêm một phần tử x vào cuối mảng
    public void addX(float x){
        // | 1 | 2 | 3 | 4 | 5 |
        // Tăng n lên:
        n=a.length+1;
        // Tạo mảng temp
        // |   |  |  |  |  |  |
        float[] temp = new float[n];
        // Copy dũ liệu
        // | 1 | 2 | 3 | 4 | 5 |  |
        for (int i = 0; i < a.length; i++) {
            temp[i] = a[i];
        }
        // Thêm x vào cuối mảng
        // | 1 | 2 | 3 | 4 | 5 | X |
        temp[n-1] = x;

        // Gán lại cho mảng ban đầu
        a = temp;
    }

    // Tính tổng 2 phần tử đầu tien
    public void printSum2FirstElements(){
        float sum = 0;
//        if(a.length>=1){
//            sum+=a[0];
//        }
//        if(a.length>=2){
//            sum+=a[1];
//        }
        for(int i=0; i<2 && i < a.length; i++){
            sum+=a[i];
        }

        System.out.println("Tong 2 phan tu dau tien: " + sum);
    }

    // In tong mang
    public void printSumA(){
        float sum = 0;
        for (int i = 0; i < a.length ; i++) {
            sum+=a[i]; // sum = sum + a[i];
        }
        System.out.println("Tong mang: " + sum);
    }

    // Tim gia tri nho nhat trong mang
    public void printMin(){
        float min = a[0];
        for (int i = 0; i < a.length; i++) {
            if (min>a[i]){
                min = a[i];
            }
        }
        System.out.println("Min = "+min);
    }

    // In ra gia tri ngau nhien
    public void printRandom(){
        Random r = new Random();
        int index = r.nextInt(a.length); // random 0 -> a.length-1;
        System.out.println("A["+index+"] = "+a[index]);
    }

    public static void main(String[] args) {
        BaiTapVeMang b = new BaiTapVeMang();
        b.addX(1.5f);
        System.out.println();
        b.printA();
        System.out.println();
        b.printSum2FirstElements();
        b.printSumA();
        b.printMin();
        b.printRandom();

        // Array Initializer
        float[] array = {3.5f, 5.5f, 4.52f, 5.6f};
    }
}
