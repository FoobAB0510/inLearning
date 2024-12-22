# Android App
- **Định dạng**: APK
- **Ngôn ngữ phát triển**: Java, Kotlin
  - Trong đó Kotlin chính thức làm ngôn ngữ phát triển xu hướng Android App
  - Sử dụng build tool Gradle
- Các Framework có thể sử dụng:
  - `React Native`: Phát triển bởi Facebook, xây dựng ứng dụng với JS bằng react
  - `Android Jetpack`: Tích hợp UI dễ dàng, phát triển ứng dụng mạnh mẽ và nhanh chóng, phát triển bởi Google
  - `Flutter`: Mã nguồn mở bởi Google, dùng để xây dựng giao diện người dùng đa nền tảng với ngôn ngữ Dart (idk what is this lol)
  - `SDK`: Android SDK là thư viện cung cấp API về mặt hệ thống và phần cứng, ví dụ như cung cấp API về Camera, dịch vụ vị trí, ...
## Thành phần chính
- <span style="color: #FA191B">**Manifest**</span> Là hệ thống định danh app, khai báo cấu hình app, khai báo các dịch vụ và quyền để hệ thống hoạt động
- <span style="color: #FA191B">**Activities**</span> Là 1 cửa sổ đại diện cho phần hiển thị ứng dụng, nơi xử lý và quản lý giao diện tương tác người dùng, tạo khung cửa sổ, ví dụ như nhấn vào người dùng hiện thông tin người dùng
- <span style="color: #BFD641">**Services**</span> Quy trình hoạt động nền không hiển thị người dùng quá nhiều hoặc không có giao diện người dùng, thường sử dụng như phát nhạc trong nền, tải xuống trong nền
- <span style="color: #5DE2E7">**Content Provider**</span> Cho phép các ứng dụng khác truy cập dữ liệu ứng dụng hiện tại, ví dụ như ứng dụng tin nhắn SMS gửi tin nhắn thông qua hệ thống ứng dụng liên lạc
- <span style="color: #5DE2E7">**Broadcast Receivers**</span> Hệ thống quản lý thông báo, phản ứng với các sự kiện hệ thống ví dụ như tin nhắn gửi đến, boot thành công, pin yếu 

## Thành phần khác
- **Intent**: Yêu cầu một hành động từ thành phần khác, ví dụ như mở truy cập trang web google từ ứng dụng nhắn tin bằng intent ACTION_VIEW
- **View**: Các thành phần tương tác như nút bấm, text input
- **Fragment**: Các thông tin hiển thị lớp đè như 1 thẻ khác hiện trên cùng 1 Activity