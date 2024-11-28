# BÁO CÁO HỌC TẬP
## Build gradle config

- Đã dựa trên NPM để hiểu một số vấn đề của Gradle

**Config plugin**
  
[Thông tin về cơ bản Plugin](https://github.com/Fubuki-World0510/inLearning/tree/main/SEP1/gradle/Plugin)
```
-> Hiểu các kiểu viết plugin: id(), dấu nháy kép, viết gọn
-> Hiểu cơ bản cách hoạt động plugin cục bộ
```

**Cấu hình Dependencies**

[Thông tin cấu hình](https://github.com/Fubuki-World0510/inLearning/blob/main/SEP1/gradle/BuildAndConfig/build.gradle.kts.md#dependencies)
```
-> Hiểu cơ bản implementation và testImplementation
-> Tìm hiểu qua 1 số option khác như compileOnly, runtimeOnly, api, ...
```

**Cấu hình task cơ bản**
- Sử dụng DSL Kotlin

[Cấu hình task cơ bản](https://github.com/Fubuki-World0510/inLearning/blob/main/SEP1/gradle/BuildAndConfig/build.gradle.kts.md#build-a-task)
```
-> Cấu hình Manifest
-> Cấu hình task với thuộc tính register, named
```

## Cấu trúc Gradle Project

**Cấu trúc mặc định Gradle**

[Thông tin cấu trúc cơ bản](https://github.com/Fubuki-World0510/inLearning/tree/main/SEP1/gradle/Project)

- Nhận dạng các cấu trúc Gradle
- Tìm hiểu về Gradle Wrapper
- Tìm hiểu về Gradle Build Project Layout


## Hiểu 1 chút với Settings.Gradle

[Thông tin settings.gradle cơ bản](https://github.com/Fubuki-World0510/inLearning/blob/main/SEP1/gradle/BuildAndConfig/settings.gradle.kts.md)

- Hiểu cơ bản cách cấu hình cấu hình các project con với file `settings.gradle.kts`

- Hiểu cơ bản cấu hình Plugin toàn cục với các project con

## Kotlin
[Dự án mẫu nhỏ](https://github.com/Fubuki-World0510/inLearning/tree/main/SEP1/gradle/KotlinProject/FisrtWithKotlin)
- Hiểu các khái niệm cơ bản của Kotlin như `variable`, `data type`, `function`
- Làm việc cơ bản với các câu lệnh trường hợp như `try-catch`, `when`, `if-else`
- Xử lý mảng và hướng đối tượng cơ bản như `Class`, `Object`, `ArrayList`
- Dựa trên Gradle Dependencies như Microsoft JDBC để viết cơ bản ứng dụng hiển thị dữ liệu trên Console
- Xử lý cơ bản Fetch API Async Await với dependencie Coroutines và Ktor
