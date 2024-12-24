# Build AAB (Android App Bundle) sang APK với Bundletool
- `Cần chuẩn bị`: your_app.aab, bundletool
  - `your_app.aab` sinh ra khi bạn thực hiện build aab bằng gradle
  - `bundletool` có thể được tải xuống từ [trang github](https://github.com/google/bundletool/releases)

## 1️⃣ Lệnh build APK cơ bản
- Để build cơ bản AAB sang APKS ta có lệnh
> [!WARNING]
> Lệnh bundle này không ký cho tệp APK của bạn, APK của bạn không thể phát hành và sử dụng, nhưng bundle sẽ tự động ký bằng keystore có sẵn của Android Studio với mục đích là debug thử nghiệm
```sh
java -jar bundletool-all-<version>.jar build-apks --bundle=/MyApp/my_app.aab --output=/MyApp/my_app.apks
```
trong đó:
- `java -jar bundletool-all-[version].jar` là lệnh chạy file jar của java, "[version] là mã phiên bản của bundletool
- `build-apks` lệnh yêu cầu build sang APKS
- `--bundle=/MyApp/my_app.aab` Đường dẫn có chứa file AAB
- `--output=/MyApp/my_app.apks` Output file được build

## 2️⃣ Build apk với việc ký ứng dụng
```sh
java -jar bundletool build-apks --bundle=/MyApp/my_app.aab --output=/MyApp/my_app.apks
--ks=/MyApp/keystore.jks
--ks-pass=file:/MyApp/keystore.pwd
--ks-key-alias=MyKeyAlias
--mode=universal
--key-pass=file:/MyApp/key.pwd
```
trong đó:
- `--ks=` Đường dẫn keystore để ký file APK
- `--ks-pass=file:/MyApp/keystore.pwd` Đường dẫn chứa khóa mở keystore
  - `--ks-pass=password` có thể dùng như này
- `--ks-key-alias=` Tên bí danh của key trong keystore dùng để ký
- `--key-pass=file:/MyApp/key.pwd`: Đường dẫn chứa khóa mở key
  - `--ks-pass=password` có thể dùng như này
- `--mode=` Chế độ build APKS
  - Có 3 chế độ khác nhau:
    - `universal`: Tạo 1 file APK cho tất cả thiết bị
    - `default`: Tạo các file APK cho các thiết bị khác nhau
    - `split`: Tạo các file APK cho từng cấu hình thiết bị cụ thể
## Một số flag khác
- `--overwrite` Ghi đè output lên đường dẫn output hiện tại, nếu không có cờ này sẽ xảy ra lỗi bản dựng
- `--connected-device` Tạo APK nhắm đến thiết bị đã kết nối
  - `--device-id=` Nếu có nhiều thiết bị kết nối, có thể sử dụng device id
  - `--device-spec=` Bạn có 1 tệp JSON danh sách các thiết bị cho file APK này ? Flag này là của bạn, cung cấp JSON chỉ định các thiết bị nhắm đến
  - `--local-testing` Bật gói ứng dụng để kiểm thử và phát hành mà không cần tải lên máy chủ Google Play
- `...` và nhiều flag khác
<!-- https://developer.android.com/tools/bundletool?hl=vi -->