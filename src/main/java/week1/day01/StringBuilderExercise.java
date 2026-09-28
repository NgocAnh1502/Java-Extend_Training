package week1.day01;

public class StringBuilderExercise {
    public static void main(String[] args) {
        //Exercise 11 — StringBuilder
        String result = "";
        /*for (int i = 1; i <= 1000; i++) {
            result += i;
        }*/
        // String có tính Immutability nên các thao tác xử lý chuỗi sẽ không thể sửa đổi String
        // mà sẽ tạo ra 1000 String rác trong bộ nhớ Heap làm lãng phí RAM và làm chậm chương trình do phải copy lại toàn bộ chuỗi cũ sang chuỗi mới ở mỗi bước
        // Viết lại:
        StringBuilder resultBuilder = new StringBuilder();
        for (int i = 1; i <= 1000; i++) {
            resultBuilder.append(i);
        }
        result =  resultBuilder.toString();
        System.out.println(result);
        //StringBuilder có tính Mutable - có thể thay đổi. Nên khi dùng append dữ liệu mới sẽ
        //được ghi tiếp vào ô nhớ còn trống của mảng này ngay trên cùng 1 đối tượng hiện tại.
        // String có tính Immutability lưu trữ ở String Pool / Heap memory Thread-safe
        //StringBuilder  Mutable       lưu trữ ở Heap memory             not Thread-safe

        //Exercise 14 — Mini Challenge
        String username = "admin";
        if (username == null || username.isBlank()) {
            System.out.println("username đang null hoặc empty.");
            return;
        }
        else if (username.length() < 5) {
            System.out.println("username có ít hơn 5 ký tự.");
            return;
        }
        else if (!username.contains("admin")) {
            System.out.println("username không chứa admin.");
            return;
        }
        System.out.println(username.toUpperCase());

        StringBuilder sb = new StringBuilder();
        sb.append("USER_").append(username);
        System.out.println(sb);
    }
}
