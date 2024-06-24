public class Test {
    public static void main(String[] args) {
        int decimal = 25;
        String binary = DecimalToBinaryConverter.decimalToBinary(decimal);
        System.out.println(binary);

        System.out.println(DecimalToBinaryConverter.decimalToBinary(105));
    }
}
