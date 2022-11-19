package ProgramPractice.Alphabet;

import java.nio.charset.StandardCharsets;

public class BinaryConversion {
    public static void main(String[] args) {
        String nm ="a";
        byte[] num = nm.getBytes(StandardCharsets.UTF_8);
        System.out.println(num.toString());
    }
}
