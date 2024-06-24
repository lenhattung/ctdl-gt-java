public class DecimalToBinaryConverter {
    public static String decimalToBinary(int decimal){
        ArrayStack<Integer> stack = new ArrayStack<Integer>();

        // Chuyen doi so thap phan sang nhi phan
        while(decimal>0){
            int remainder = decimal % 2; // Lay ra so du khi chia cho 2
            stack.push(remainder);
            // decimal = decimal/2;
            decimal /=2;
        }

        // Lay cac bit tu stack va ghep lai thanh chuoi so nhi phan
        StringBuilder binary = new StringBuilder();
        while (!stack.isEmpty()){
            binary.append(stack.pop());
        }
        return binary.toString();
    }
}
