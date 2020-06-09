import java.util.ArrayList;

public class TestDemo {
    public static void main(String[] args) {
        // byte 1个字节  8位 0 或者 1
        // 10
        //  2 | 10
        //  2 | 5  | 1
        //  2 | 2  | 1
        //  2 | 1  | 0
        //  2 | 0  | 1
        //  10 --> 00001011
        //         00000101
        //         00000010
        //         00000001

        byte m = 10 << +(10 >> 3);
        System.out.println(m);

        System.out.println(Math.pow(2.0,30.0));

        byte n = 10;
        System.out.println(n |= n >>> 1);
        ArrayList<String> list=new ArrayList<>();
        list.add("a");
        System.out.println(3|5);
        // >>
        // <<
        // >>>
        // | 或  3 | 5
        //  00000011
        //  00000101
        //  00000111

        // -2 | 5
        // -2  11111110
        // 5   00000101
        //     11111111
        //     11111110
        //     10000001
        System.out.println(-2 | 5);

        // & 与
        System.out.println(2<<3);
    }
}
