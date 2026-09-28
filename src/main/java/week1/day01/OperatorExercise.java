package week1.day01;

public class OperatorExercise {
    public static void main(String[] args) {
        //Exercise 5 — `==` với Primitive
        int a = 10;
        int b = 10;
        System.out.println(a == b); // -> kết quả true;
                                    // -> đối với kiểu dữ liệu nguyên thủy == so sánh giá trị
        //int a = 10, b = 20 -> a == b : false.
        //int a = 1000, b = 1000 -> a == b : true.

        //Exercise 6 — `==` vs `.equals()` với Integer
        Integer c = 100;
        Integer d = 100;
        System.out.println(c == d); // -> true
        System.out.println(c.equals(d)); // -> true

        Integer e = 1000;
        Integer f = 1000;
        System.out.println(f == e); // -> false
        System.out.println(f.equals(e)); // -> true
        //Java có cơ chế Integer Cache (bộ nhớ đệm) lưu sẵn các đối tượng có giá trị từ -128 đến 127.
        //Khi gán bằng 100, cả c và d đều trỏ chung vào một đối tượng 100 có sẵn trong cache -> Cùng địa chỉ bộ nhớ -> true.
        //Vì 1000: Nằm ngoài khoảng cache nên Java sẽ tạo ra hai đối tượng hoàn toàn mới nằm ở hai vùng nhớ khác nhau cho e và f -> Khác địa chỉ bộ nhớ -> false.
        //Khi cần so sánh giá trị giữa 2 biến int thì dùng == còn khi so sánh giữa 2 biến Integer thì dùng `.equals()`.
    }
}
