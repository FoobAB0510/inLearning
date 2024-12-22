# Kiến trúc IOS
## Kernel
- Sử dụng Kernel XNU

  -> XNU Kernel được kết hợp từ nhiều công nghệ như Mach kernel, BSD

## Core OS
- `CFSockets`: Quản lý kết nối mạng
- `Security Framework`: Cung cấp bảo mật mã hóa, 
- `Local Authentication`: Xác thực cục bộ như touchID, FaceID
- `CoreBluetooth`: Quản lý giao tiếp Bluetooth
- `Accelerate Framework`: Sử dụng tính toán CPU hiệu suất cao cho tính toán số học và xử lý tín hiệu

## Core Services
- `Foundation Framework`: Cung cấp các dịch vụ cơ bản cho ứng dụng iOS như quản lý bộ sưu tập, các kiểu dữ liệu cơ bản, quản lý luồng
- `Core Data`: Quản lý và lưu trữ dữ liệu
- `CloudKit`: Đồng bộ hóa dữ liệu giữa các thiết bị thông qua iCloud
- `CoreMotion`: Quản lý cảm biến chuyển động
- `CoreLocation`: Quản lý dịch vụ định vị GPS
- `HealthKit`: Quản lý và chia sẻ dữ liệu sức khỏe

## Media
- `CoreGraphics`: Quản lý đồ họa 2D
- `CoreAnimation`: Tạo các hiệu ứng hoạt hình mượt mà
- `AVFoundation`: Quản lý các tính năng âm thanh và video
- `CoreImage`: Xử lý và phân tích hình ảnh
- `Metal`: Giao diện lập trình đồ họa hiệu suất cao

## Cocoa Touch (UIX)
- `UIKit`: Cung cấp các thành phần giao diện người dùng cơ bản như nút bấm, text input, bảng table
- `SwiftUI`: Sử dụng để xây dựng giao diện dễ dàng với Swift
- `Auto Layout`: Quản lý bố cục giao diện tự động, hỗ trợ nhiều kích thước màn hình khác nhau
- `Accessibility`: Hệ thống trợ năng