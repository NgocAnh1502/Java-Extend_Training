package week1.day01;

import java.util.Locale;

public class StringExercise {
    public static void main(String[] args) {
        //Exercise 8 — String và `.equals()`
        String a = "hello";
        String b = "hello";
        System.out.println("Ex8");
        System.out.println(a == b); // -> true
        System.out.println(a.equals(b)); // -> true
        //Biến a và biến b cùng trỏ vào 1 địa chỉ bộ nhớ duy nhất là chuỗi "hello" ở trong String Pool

        String c = new String("hello");
        String d = new String("hello");

        System.out.println(c == d); // -> false
        System.out.println(c.equals(d) + "\n"); // -> true
        //Từ khóa new tạo ra 2 đối tượng riêng biệt trên vùng nhớ Heap, nên biến a và biến b trỏ vào 2 địa chỉ bộ nhớ khác nhau.
        // == với String đang so sánh địa chỉ vùng nhớ
        // `.equals()` đang so sánh nội dung của chuỗi

        // Exercise 9 — String Pool
        String a2 = "hello";
        String b2 = "hello";
        String c2 = new String("hello");
        String d2 = new String("hello");

        System.out.println("Ex9");
        System.out.println(a2 == b2); //-> true
        System.out.println(a2 == c2); //-> false
        System.out.println(c2 == d2); //-> false

        System.out.println(a2.equals(c2)); //->true
        System.out.println(c2.equals(d2) + "\n"); //->true
        // String Pool là 1 vùng nhớ đặc biệt nằm trên bộ nhớ Heap để lưu trữ các hằng chuỗi. -> Tiết kiệm bộ nhớ, tăng hiệu năng
        // khi khai báo 1 String bằng 1 dấu ngoặc kép -> kiểm tra trong String Pool xem có chuỗi đó không
        //-> Nếu có trả về địa chỉ của đối tượng cũ, nếu chưa thì tạo 1 đối tượng mới.
        // a2 và b2 cùng trỏ vào 1 địa chỉ bộ nhớ duy nhất là chuỗi "hello" ở trong String Pool nên trả về true
        // c2 và d2 có từ khóa new -> tạo ra 2 đối tượng khác trên vùng nhớ Heap -> trỏ vào khác địa chỉ -> false

        //Exercise 10 — String Immutability
        String name = "Duy";
        name.concat(" Hoang");
        System.out.println("Ex10");
        System.out.println(name + "\n"); //-> Output: Duy
        //String có tính bất biến Immutability nên nội dung của nó không thể bị sửa đổi.
        //Mọi thao tác xử lý chuỗi như concat() sẽ sinh ra 1 đối tượng String mới chứ không ghi đè lên String hiện tại.
        //Vì lệnh name.concat(" Hoang"); không được gán cho biến nào nên đối tượng mới sinh ra bị bỏ qua biến name vẫn trả về `Duy`
        //Code: name = name.concat(" Hoang"); / name = name + "Hoang";

        //Immutability (tính bất biến) nghĩa là một khi đối tượng String được khởi tạo và lưu trữ trên vùng nhớ,
        // nội dung của đối tượng đó không bao giờ có thể bị thay đổi hay ghi đè.

        //Exercise 12 — String Processing
        String text = "Java Spring Boot";
        System.out.println("Ex12");
        System.out.println("Số ký tự: " + text.length());
        System.out.println("Số từ: " + text.split("\\s+").length);
        System.out.println(text.toUpperCase());
        System.out.println(text.toLowerCase());
        System.out.println(text.contains("Spring"));
        System.out.println(text.replace("Boot", "FrameWork"));
        System.out.println(new StringBuilder(text).reverse());
    }
}
