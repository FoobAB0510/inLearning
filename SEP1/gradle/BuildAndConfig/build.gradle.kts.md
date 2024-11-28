# Build a task
**build.gradle.kts**
```kts
tasks.named("check") {
    doLast {
        println("OK")
    }
}

tasks.register("myTask1") {
    doLast {
        println("That's my task")
    }
}

tasks.named<JavaCompile>("compileJava") {
    options.encoding = "UTF-8"
}

tasks.register<Copy>("myCopy1") {
    from("src") 
    into("dist")
}
```

# Plugins

- Được sử dụng để mở rộng chức năng build cho Gradle, giống pm2 với NodeJS
```
plugins {
    java <- cách gọi tên ngắn trực tiếp bình thường
    `java` <- cách gọi dành cho các plugin ký tự đặc biệt
    id("") version "" <- cách gọi cho các plugin tùy chỉnh
}
```
# Repositories
- Kho lưu trữ của **Dependencies** trong dự án có thể tải xuống, khai báo nơi các lib đang lưu trữ để Gradle thực hiện tìm và cài đặt
- Một số kho lưu trữ chuyên dùng: `Maven Central`, `jcenter`
- Có thể sử dụng kho lưu trữ local
- Có thể sử dụng kho lưu trữ tùy chỉnh bởi tổ chức hoặc chính tôi
```
repositories {
    mavenCentral()
    jcenter()
    maven {
        url = uri("https://reg.ownrepo.com")
    }
}
```
# Dependencies
- Là các thư viện hoặc module trong dự án được cài đặt, giúp tích hợp các lib bên ngoài vào dựa án
```
dependencies {
    implementation("group:name:version")
    implementation("group:name:version")

    testImplementation("group:name:version")
    testImplementation("group:name:version")
}
```
- implementation sử dụng cho các vùng dự án chính, phạm vi sử dụng có thể bao gồm cả main và test project
- testImplementation sử dụng cho vùng thử nghiệm dự án, phạm vi sử dụng chỉ bao gồm test `src/test/java` trong project
- Ngoài ra có 1 số options khác
```
compileOnly (Chỉ dùng trong quá trình biên dịch)
```

```
runtimeOnly (Chỉ dùng trong quá trình chạy, không gồm quá trình biên dịch)
```

```
compileClasspath (Tập hợp các dependencies cho việc biên dịch)
```

```
api (khai báo các dependencies mà các dự án khác phụ thuộc vào dự án cũng có thể sử dụng)
```