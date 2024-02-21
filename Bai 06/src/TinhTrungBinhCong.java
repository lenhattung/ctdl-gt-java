public class TinhTrungBinhCong {

    public static <T> double tinhTBC(T[] mang){
        //T[] mangB = new T[100];
        double tong = 0;
        for (int i = 0; i < mang.length; i++) {
            double value = Double.valueOf(mang[i]+"");
            tong+=value;
        }
        return tong/ mang.length;
    }

//    public static <T extends Number> double tinhTBC(T[] mang){
//        //T[] mangB = new T[100];
//        double tong = 0;
//        for (int i = 0; i < mang.length; i++) {
//            double value = Double.valueOf(mang[i]+"");
//            tong+=value;
//        }
//        return tong/ mang.length;
//    }


    public static void main(String[] args) {
        Integer[] mangInt = {5, 10, 15};
        System.out.println("TBC-int: "+tinhTBC(mangInt));

        Float[] mangFloat = {1.5f, 4.5f};
        System.out.println("TBC-mangFloat: "+tinhTBC(mangFloat));

        Double[] mangDouble = {1.5, 4.5, 6.0};
        System.out.println("TBC-mangDouble: "+tinhTBC(mangDouble));

        String[] s = {"1.5", "4.5", "6.0"};
        System.out.println("TBC-s: "+tinhTBC(s));
    }

}
