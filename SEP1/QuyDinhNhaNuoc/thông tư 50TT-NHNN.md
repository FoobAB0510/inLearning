# Thông tư 50/2024
- **Tên**: TT-NHNN bảo mật cung cấp dịch vụ trực tuyến trong ngành Ngân hàng `50/2024/TT-NHNN`
- **Phát hành**: 31/10/2024
- **Nội dung**: Quy định về an toàn, bảo mật cho việc cung cấp dịch vụ trực tuyến trong ngành Ngân hàng
- **Có hiệu lực**: 01/01/2025
- **Viết tắt**:
  - `OB` = Online Banking
  - `đký` = Đăng ký
  - `p.mềm` = Phần mềm
  - `csdl` = Cơ sở dữ liệu

## Đối tượng
**`Áp dụng cho`**
  + Hoạt động ngân hàng, hoạt động kinh doanh tín dụng, chi nhánh ngân hàng nước ngoài
  + Hoạt động dịch vụ trung gian thanh toán
  + Thông tin thẻ tín dụng

## Các chức năng `bắt buộc` trong ứng dụng OB 2025
**Quy định**
- OB cần tuân thủ an toàn thông tin cấp 3 trở lên theo quy định

- [Lọc, phân loại, đánh giá] giao dịch khách hàng theo mức độ rủi ro theo nhóm/hành vi khách hàng, loại giao dịch, hạn mức giao dịch (nếu) và tuân thủ quy định pháp luật liên quan, dựa trên đó cung cấp hình thức xác nhận giao dịch tuân thủ quy định
  + Áp dụng tối thiểu một trong các hình thức xác nhận quy định tại khoản [3, 4, 5, 7, 8, 9] Điều 11 Thông tư này khi thay đổi thông tin định danh khách hàng

  + Áp dụng tối thiểu một hoặc kết hợp các hình thức xác nhận giao dịch

  + Đối với giao dịch gồm nhiều bước, phải thực hiện xác nhận giao dịch tại bước phê duyệt cuối cùng

  + Các trang thiết bị hạ tầng kỹ thuật công nghệ thông tin cung cấp dịch vụ Online Banking phải có bản quyền, nguồn gốc, xuất xứ rõ ràng, nếu các trang thiết bị hết vòng đời, không hỗ trợ, phải có kế hoạch nâng cấp

- Không cần tuân thủ quy định khoảng [7, 9, 10, 7] và mục 2 Chương II thông tư này

- Hệ thống OB chỉ được hoạt động cung cấp dịch vụ cho khách hàng khi bảo đảm an toàn, bảo mật theo quy định của Thông tư này và các quy định của pháp luật liên quan

**1. Hạ tầng, thiết bị, kỹ thuật, an toàn bảo mật**
- Yêu cầu thiết lập hệ thống mạng, truyền thông an toàn, bảo mật:
  + Tường lửa ứng dụng/giải pháp bảo vệ có tính năng tương đương
  + Tường lửa csdl/giải pháp bảo vệ có tính năng tương đương
  + Chống DDoS/DoS khi cung cấp trực tiếp internet
  + Hệ thống quản lý và phân tích sự kiện an toàn thông tin
- Thông tin khách hàng không được lưu trữ tại phân vùng kết nối Internet, phân vùng trung gian giữa mạng nội bộ và DMZ Hosting
- Thiết lập chính sách hạn chế tối đa các dịch vụ, cổng kết nối vào hệ thống Online Banking
- Kết nối từ bên ngoài vào hệ thống OB admin chỉ thực hiện khi không vào được mạng nội bộ, tuân thủ quy định sau:
  + Phải được cấp có thẩm quyền phê duyệt sau khi xem xét mục đích, cách thức kết nối
  + Phải có phương án quản lý truy cập, sử dụng VPN hoặc phương án tương đương
  + Thiết bị kết nối phải được cài đặt các phần mềm bảo đảm an toàn, bảo mật
  + Phải áp dụng tối thiểu hai trong các hình thức xác nhận quy định tại khoản [1, 3, 4, 7, 8, 9, 11] Thông tư này khi đăng nhập hệ thống
  + Sử dụng giao thức truyền thông được mã hóa an toàn và không lưu mã khóa bí mật tại các phần mềm tiện ích


**Chức năng**
- Dữ liệu trong môi trường mạng/trao đổi giữa ứng dụng OB phải được mã hóa đầu đến cuối

- Đảm bảo tính toàn vẹn dữ liệu, sửa đổi trái phép phải được phát hiện, cảnh báo, ngăn chặn và có biện pháp xử lý

- Hệ thống có quyền ngắt phiên giao dịch khi người dùng không thao tác

- Có chức năng che giấu khi hiển thị các khóa bí mật (như mã PIN, ...)

- Chức năng chống đăng nhập tự động

- **Trong trường hợp** tài khoản giao dịch điện từ quy định tại khoản 1 Điều 9 Thông tư 50 sử dụng PIN/Secret key phải có chức năng kiểm soát 2 cái đó

- Yêu cầu p.mềm thiết kế tối thiểu 2 bước khi giao dịch là tạo lập và phê duyệt giao dịch dành cho khách hàng là tổ chức, __không bắt buộc__ tách và áp dụng 2 bước đó **trong trường hợp** khách hàng thuộc hộ kinh doanh/doanh nghiệp siêu nhỏ

- Có chức năng thông báo **login `lần đầu/từ thiết bị khác`** trên p.mềm OB qua các kênh SMS hoặc kênh khác do người dùng đký __ngoại trừ trường hợp khách hàng tổ chức__ đăng nhập trên các thiết bị đăng ký dịch vụ hoặc tối thiểu đăng nhập một trong các hình thức tại khoản [3, 4, 5, 7, 8, 9] điều 11 Thông tư 50