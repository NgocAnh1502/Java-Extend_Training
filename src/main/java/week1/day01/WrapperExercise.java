package week1.day01;

public class WrapperExercise {
    public static void main(String[] args) {
        //Exercise 3 — Primitive vs Wrapper
        int a = 10; // là kiểu dữ liệu nguyên thủy. Lưu trực tiếp giá trị vào bộ nhớ Stack, dung lượng nhẹ và tốc độ xử lý nhanh
        Integer b = 10; // là lớp bao bọc đại diện cho kiểu dữ liệu nguyên thủy tương ứng
                        // Lưu trên bộ nhớ Heap, tốn dung lượng hơn và đi kèm nhiều phương thức như parse, compareTo.
        long c = 100L; // Primitive không thể nhận null, nó bắt buộc phải chứa 1 giá trị thực mặc định là 0 với biến global (biến local sẽ báo lỗi)
        Long d = 100L; // Wrapper có nhận null vì nó mang bản chất là Object nó sẽ không tham chiếu đến vùng nhớ nào của Heap.
                        // nên dùng Wrapper khi dữ liệu có thể null và khi cần dùng đến Collections Framework hoặc Generics

        //Exercise 4 — Autoboxing / Unboxing
        int e = 10;
        Integer f = e; // Autoboxing -> Integer f = Integer.valueOf(e)
        Integer g = 20; // Autoboxing -> Integer g = Integer.valueOf(20)
        int h = g; //Unboxing -> int h = g.intValue()

        //Exercise 7 — Autounboxing và `null`
        Integer number = null;
        int result = number;
        // Code không chạy được vì ở dòng thứ 2 xảy ra NullPointerException
        // Xảy ra lỗi vì biến number đang mang giá trị null. còn biến result là kiểu nguyên thủy bắt
        // buộc phải chứa 1 giá trị cụ thể, không thể chứa null.
        // autounboxing là nguyên nhân trưc tiếp dẫn đến lỗi. Khi gán 1 đối tượng Integer và0
        // 1 biến int complier sẽ tự chèn thêm lệnh mở hộp ngầm: int result = number.intValue();
        // number đang là null lệnh null.intValue() -> NullPointerException
        // Sửa code thành: int result1 = java.util.Optional.ofNullable(number).orElse(0);
    }
}
