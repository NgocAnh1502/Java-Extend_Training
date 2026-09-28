package week1.day01;

public class DebugExercise {
    // Exercise 13 — Debug
    public static void main(String[] args) {
        Integer age = null;

        if (age != null && age == 18) {
            System.out.println("Adult");
        }
        //chương trình sẽ ném ra ngoại lệ NullPointerException tại if (age == 18)
        //age là 1 đối tượng thuộc lớp Wrapper Integer, 18 là kiểu dữ liệu nguyên thủy int.
        //khi sử dụng toán tử == java sẽ tự chuyển (Auto-unboxing) Integer thành int
        //thực tế: if(age.intValue() == 18) nhưng age đang null nên xảy ra lỗi NullPointerException
        //cần có bước kiểm tra null trước.
        /*  Dùng equals
            Integer age = null;
            if(Integer.valueOf(18).equals(age)) {
                System.out.println("Adult");
            }
        */
    }
}
