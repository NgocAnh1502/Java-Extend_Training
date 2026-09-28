package week1.day01;

public class PrimitiveExercise {
    public static void main(String[] args) {
        // Exercise 1 — Primitive Types
        byte myByte = 1; //-128 -> 127;
        short myShort = 2; // 2 bytes
        int myInt = 4; // 4 bytes, giá trị tối đa là 2^31 - 1 (hon 2.1 ty), do 1 bit làm dấu còn 31 bit còn lại biểu diễn giá trị thực.
        long myLong = 3000000000L; // 8 bytes, java complier mặc định là int nên cần L.
        float myFloat = 2.5f; //myDouble 4 bytes, độ chính xác 7 số sau dấu phẩy, java complier mặc định là double.
        double myDouble = 8.375; // 8 bytes, độ chính xác 15 số sau dấu phẩy.
        char myChar = 'a'; //2 bytes, để lưu 1 ký tự trong bảng mã Unicode được đặt trong dấu ''.
        boolean myBoolean = true; // có 2 giá trị là true và false.

        System.out.println("byte: " + myByte + ".   short: " + myShort + ".   int: " + myInt + ".   long: " + myLong + ".   float: " + myFloat
                + ".   double: " + myDouble + ".   char: " + myChar + ".   boolean: " + myBoolean);

        //Exercise 2 — Primitive Conversion
        int a = 10;
        long b = 20L;
        double c = 30.5;

        long aToLong = a; // Khi chuyển từ kiểu dữ liệu có phạm vi nhỏ sang kiểu dữ liệu có phạm vi lớn hơn thì Java tự động thực hiện.
        double aToDouble = a;
        int bToInt = (int) b; // Và ngược lại mình cần tự ép kiểu (Casting).
        int cToInt = (int) c; // convert `double` → `int` thì phần thập phân có bị mất, hệ thống sẽ bỏ đi phần thập phân.
        System.out.println("int a = " + a + ".   long b = " + b + ".   double c = " + c +
                ".   long a = " + aToLong + ".   double a = " + aToDouble + ".   int b = " + bToInt + ".   int c = " + cToInt);


    }
}
