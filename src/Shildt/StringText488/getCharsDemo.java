package Shildt.StringText488;

import java.nio.charset.StandardCharsets;

public class getCharsDemo {
    public static void main(String[] args) {
        String s = "Это демонстрация метода getChars().";
        int start = 4;
        int end = 8;
        char buf[] = new char[end - start];
        s.getChars(start, end, buf, 0);
        System.out.println(buf);

        String s2 = "My testid text";
        char[] buf2 = new char[7];
        s2.getChars(3, 9, buf2, 1);
        System.out.println(buf2);


//        Метод getBytes   p 477
        byte[] bytesArray = s2.getBytes();
        for (byte b : bytesArray) {
            System.out.print((char) b);
        }
        System.out.println();


        char[] k = s2.toCharArray();  // Преобразование в массив символов = getChars ()
        for(char c : k){
            System.out.print(c);
        }


    }
}
