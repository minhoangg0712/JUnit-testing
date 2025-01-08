Nguyễn Minh Hoàng - BIT220063 - 22SE1

Bài tập 1 của môn "Kiểm thử phần mềm" sử dụng JUnit5 của một máy tính cầm tay cơ bản.

Đề bài: Kiểm thử đơn vị với Java.

### Các phép toán số học:
- Cộng
- Trừ
- Nhân
- Chia (với xử lý lỗi khi chia cho 0)
- Tính mũ
- Tính căn bậc hai (với xử lý lỗi cho đầu vào âm)

### Yêu cầu trước khi sử dụng:
- Java Development Kit (JDK) 8 hoặc mới hơn.
- Công cụ build Maven.
- JUnit 5 để kiểm thử.

### Kiểm thử đơn vị với JUnit 5:
- Các trường hợp kiểm thử đầy đủ cho tất cả các phép toán, bao gồm các tình huống biên và ngoại lệ.

## Cài đặt
- Clone repository:

    git clone https://github.com/minhoangg0712/JUnit-testing.git

    cd JUnit-testing

- Xây dựng dự án bằng Maven:

    mvn clean install

### Lớp Calculator

Lớp Calculator cung cấp các phương thức sau:

    BigDecimal add(BigDecimal a, BigDecimal b)

    BigDecimal subtract(BigDecimal a, BigDecimal b)

    BigDecimal multiply(BigDecimal a, BigDecimal b)

    BigDecimal divide(BigDecimal a, BigDecimal b)

    BigDecimal power(BigDecimal base, int exponent)

    BigDecimal sqrt(BigDecimal value)

### Lớp kiểm thử
Để chạy các bài kiểm thử JUnit, sử dụng lệnh sau:

    mvn test

Các bài kiểm thử bao gồm các tình huống:

- Các phép toán cơ bản
- Xử lý ngoại lệ (ví dụ, chia cho 0, căn bậc hai của số âm)
- Các tình huống biên và đầu vào đặc biệt

### Cấu trúc dự án
    ├── src
    │   ├── main
    │   │   └── java
    │   │       └── Calculator.java
    │   └── test
    │       └── java
    │           └── CalculatorTest.java
    ├── pom.xml
    └── README.md

### Kết quả
![Screenshot (163)](https://github.com/user-attachments/assets/739365cc-ea93-44bb-92fc-5a5d291c6f74)





