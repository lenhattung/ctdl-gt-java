public class Test {
    public static void main(String[] args) {
        // Ví dụ 2
        Dictionary<String, String> d1 = new Dictionary<String, String>("hello", "xin chào");
        System.out.println(d1.toString());

        Dictionary<String, String>[] tuDienAnhViet = new Dictionary[10];
        tuDienAnhViet[0] = new Dictionary<String, String>("hello", "xin chào");
        tuDienAnhViet[1] = new Dictionary<String, String>("hi", "xin chào");
        tuDienAnhViet[2] = new Dictionary<String, String>("code", "mã nguồn");
        tuDienAnhViet[3] = new Dictionary<String, String>("dictionary", "từ điển");

        for (int i = 0; i < 4; i++) {
            System.out.println(tuDienAnhViet[i].toString());
        }

        // Ví dụ 2
        Dictionary<Integer, Character>[] bangMaAscii = new Dictionary[256];
        bangMaAscii[0]=new Dictionary<>(32, ' ');
        bangMaAscii[1]=new Dictionary<>(33, '!');


        // Ví dụ 3
        Dictionary<Character, Integer>[] bangMaAscii2 = new Dictionary[256];
        bangMaAscii2[0]=new Dictionary<>(' ', 32);
        bangMaAscii2[1]=new Dictionary<>('!', 33);

        // Dictionary<Student, Transcript>[] bangMaAscii2 = new Dictionary[256];
    }
}
