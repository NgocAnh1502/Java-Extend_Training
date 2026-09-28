## Câu hỏi
1. `int` và `Integer` khác nhau như thế nào?
2. `==` và `.equals()` khác nhau như thế nào?
3. Tại sao `Integer 100` có thể `== true` nhưng `Integer 1000` có thể `== false`?
4. String Pool là gì?
5. Khi nào nên sử dụng `StringBuilder`?

## Trả lời
1. - int là kiểu dữ liệu nguyên thủy sử dụng 4 bytes bộ nhớ, lưu trực tiếp giá trị vào bộ nhớ Stack, tốc độ xử lý nhanh hơn Integer.
int không thể mang giá trị null, không thể sử dụng trong Java Collections hoặc Generics.
   - Integer là lớp bao bọc đại diện cho kiểu dữ liệu nguyên thủy tương ứng, Lưu trên bộ nhớ Heap, tốn dung lượng hơn, nhưng có thể 
nhận giá trị null và đi kèm nhiều phương thức như parse, compareTo.


2. - Đối với kiểu dữ liệu nguyên thủy `==` so sánh giá trị. Nhưng với Object như String, Integer,...
nó so sánh địa chỉ vùng nhớ.
   - Hàm `.equals()` so sánh nội dung của object.


3. Java lưu cache các giá trị Integer nằm trong khoảng -128 đến 127 vì `100` nằm trong khoảng này nên nếu khai báo cả 2 biến a và b = 100
thì cả 2 biến a và b đều trỏ cùng vào 1 địa chỉ object có sẵn trong cache nên trả về true. Còn `1000` đã nằm ngoài khoảng cache nên java 
bắt buộc dùng từ khóa new để khơi tạo 2 object mới cho a và b nên cả 2 khác vùng nhớ và trả về false.


4. String Pool là 1 vùng nhớ đặc biệt nằm trên bộ nhớ Heap để lưu trữ các hằng chuỗi. -> Tiết kiệm bộ nhớ, tăng hiệu năng
      khi khai báo 1 String bằng 1 dấu ngoặc kép -> kiểm tra trong String Pool xem có chuỗi đó không
     -> Nếu có trả về địa chỉ của đối tượng cũ, nếu chưa thì tạo 1 đối tượng mới.


5. Ta nên sử dụng StringBuilder khi cần thao tác xử lý chuỗi vì nó giải quyết vấn đề khi xử lý chuỗi với String sẽ tạo ra các object hoàn toán mới
nên nó tối ưu bộ nhớ và tài nguyên hệ thống khi cần thực hiện thao tác nối chuỗi liên tục (trong vòng lặp for/while, đọc text từ file lớn, hoặc build 
câu query SQL động từ nhiều điều kiện). Hệ thống không sinh ra object rác.

## Code Reading / Interview Questions

Không chạy code trước. Hãy dự đoán output và giải thích.

## Question 1

```java
Integer a = 100;
Integer b = 100;

System.out.println(a == b); //-> true
System.out.println(a.equals(b)); // ->true
```
- vì a và b nằm trong khoảng -128 đến 127 nên java không tạo 2 object mới và 2 biến a và b trỏ về cùng 1 vùng nhớ nến kq là true.
- `.equals()` so sánh giá trị của hai biến nên a và b = nhau trả về true.
---

## Question 2

```java
Integer a = 1000;
Integer b = 1000;

System.out.println(a == b);
System.out.println(a.equals(b));
```
- vì a và b không nằm trong khoảng -128 đến 127 nên java bắt buộc sử dụng từ khóa new để tạo 2 object mới, 2 biến a và b không trỏ về cùng 1 vùng nhớ nến kq là false.
- `.equals()` so sánh giá trị của hai biến nên a và b = nhau trả về true.
---

## Question 3

```java
String a = "Java";
String b = "Java";
String c = new String("Java");

System.out.println(a == b); //-> true
System.out.println(a == c); //-> false
System.out.println(a.equals(c)); //->true
```
- a và b cùng trỏ về cùng 1 địa chỉ vùng nhớ "Java" trong String Pool nên trả về true (khi khai báo String thì nó sẽ lưu trữ trong String Pool, khi khai báo 1 String mới sẽ kiểm tra
xem trong đó có String vừa khởi tạo không nếu có thì cả hai cùng trỏ về cùng địa chỉ nếu không thì ngược lại tạo 1 địa chỉ mới) nên a == b trả về true.
- Khi dùng từ khóa `new` để khai báo c thì c lúc này sẽ trỏ vào địa chỉ của object ở trên Heap còn a trỏ vào địa chỉ ở trong String Pool nên kq trả về false.
- `equals()` chỉ so sánh nội dung của a và c nên kq trả về true.
---

## Question 4

```java
Integer number = null;
int value = number;
```

### Question: Code này xảy ra chuyện gì? Tại sao?
- dòng int value = number java sử dụng cơ chế autounboxing để chuyển Integer về int: `int value = number.intValue();` nhưng Integer đang null mà int không nhận null nên xảy ra lỗi
NullPointerException.
---

## Question 5

```java
String s = "Java";

s.concat(" Spring");

System.out.println(s);
```

### Question: Output là gì? Tại sao?
- Output là "Java" vì String có tính Immutability nên các thao tác xử lý chuỗi không thể sửa đổi String mà tạo ra 1 String mới.
lệnh s.concat(" Spring"); tạo ra 1 String mới nhưng không được gán cho biến nào cả. Nó sẽ nằm đó tiêu tốn bộ nhớ cho đến khi bị Garbage Collector dọn dẹp. 
Trong khi đó, biến s vẫn trỏ về vùng nhớ của "Java" ban đầu.