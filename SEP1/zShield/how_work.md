# Tính năng chính
- Làm rối mã
- Chống vi phạm bản quyền bằng hệ thống khóa 
- Chống dịch gỡ lỗi

# How work ?
## Basic
- **Phân tích mã nguồn (Analysis)**:
  - Xác định các phần quan trọng cần bảo vệ
  - Thu thập thông tin về cách ứng dụng xây dựng

- **Lập hồ sơ (Profiling)**:
  - Xác định runtime để bảo vệ các phần quan trọng
  - Tích hợp công cụ theo dõi các phần của class/code được gọi thường xuyên

- **Xây dựng phiên bản được bảo vệ (Protection)**:
  - Áp dụng các biện pháp bảo vệ như làm rối mã, mã hóa dữ liệu, và chèn mã kiểm tra tính toàn vẹn
  - Tạo ra một bản sao ứng dụng đã bảo vệ với nhiều lớp phòng thủ
  - Phát hiện root/jail
  - Mã hóa văn bản và chỉ giải mã tại runtime
  - Sử dụng nhiều hệ thống API để "Shield" hệ thống ứng dụng như Android NDK, Xcode, ....
## Advanced
📝 **Khả năng làm rối mã**
- Làm rối cấu trúc mã bằng việc thay đổi và phân tích, khiến cho việc dịch ngược mã làm khó hiểu cách hoạt động
- `Kỹ thuật`
   - Ẩn tên hàm, tên biến, cấu trúc class
   - Làm phẳng luồng gây khó phân tích
- `Hỗ trợ`: FULL

🛡 **Bảo vệ tính toàn vẹn**
- Thông qua Cef key để kiểm tra tính toàn vẹn của ứng dụng nếu ứng dụng bị sửa đổi
- `Kỹ thuật`
  - Phân chia dữ liệu hoạt động kiểm tra checksum tại runtime, checksum không thành công => dừng hoạt động ứng dụng, ngăn chặn, ...
  - Giám sát vùng và dữ liệu chỉ đọc

📜 **Chống gỡ lỗi**
- Phát hiện và phản ứng với các công cụ debug hoặc kỹ thuật hook tại runtime
- `Kỹ thuật`:
  - Chèn các đoạn mã kiểm tra để phát hiện dấu hiệu debug
  - Thực hiện hành động hủy hoặc tắt, crash ứng dụng
- `Hỗ trợ`: FULL

🐛 **Chống root/jail**
- Phát hiện Android bị root hoặc IOS bị jail
- `Kỹ thuật`:
  - Được quản trị mô phỏng hệ thống, vá các phương pháp, nâng cấp SDK ứng dụng
  - Phát hiện và chống root/jailbreak các phương pháp kiểm tra sâu hệ thống
  - Tự động đóng ứng dụng hoặc hành vi callback
- `Hỗ trợ`: IOS, Android, IpadOS

📝 **Rối loạn chuỗi**
- Mã hóa chuỗi ký tự mã nguồn
- `Kỹ thuật`:
  - Ngăn rò rỉ thông tin chuỗi, API
  - Cần tích hợp ZkeyBox để bảo vệ thông tin nhạy cảm như khóa mã
- `Hỗ trợ`: FULL

🔑 **xác minh khóa ký APK**
- Nhúng khóa của chữ ký API vào mã nguồn và kiểm tra tính toàn vẹn
- `Hỗ trợ`: APK Signature Scheme: v2, v3, v4

🔢 **Đa dạng mã hóa nhị phân**
- Tạo ra bản build mã hóa nhị phân nhưng vẫn giữ được các chức năng, giảm khả năng khai thác bản build khi tấn công
- `Kỹ thuật`:
  - Sử dụng seed ngẫu nhiên để thay đổi các yếu tố như mã hóa, kiểm tra checksum


⚡ **Mã hóa metadata Objective-C và Swift**
- Mã hóa metadata của ứng dụng viết và phát triển bởi môi trường Apple
- `Hỗ trợ`: Apple

💻 **Kiểm tra chéo các thư viện dùng chung**
- Bảo vệ các thư viện chia sẻ bằng cách kiểm tra tính toàn vẹn của chúng tại runtime
- `Hỗ trợ`: Android và Windows



# Protection Level
- **Source-Level Protection**
  - Chỉnh sửa trực tiếp tại source
  - Hỗ trợ C/C++
- **Swift/Objective-C Protection**
  - Bảo vệ ở cấp độ LLVM bitcode
  - Hỗ trợ Swift và Objective-C
## Mở rộng
- **Function Groups**: Nhóm các hàm theo mức độ bảo vệ, đảm bảo tốc độ or something else ..... 💧
- **Protection callback**: Tùy chỉnh hành động khi phát hiện mối đe dọa
- **SCP Macro**: Mã hóa điều kiện tương thích với các môi trường build khác nhau
 