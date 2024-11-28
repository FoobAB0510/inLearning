# Basic structure

```kts
rootProject.name = "tên project"

// Quản lý đa dự án con trong 1 dự án lớn
include("project con 1")
include("project con 2")

// Plugin config
// Dành cho việc cấu hình toàn cục đồng bộ các Project con 
pluginManagement {
   repositories {
       gradlePluginPortal()
       mavenCentral()
       jcenter()
   }
   plugins {
       id("org.jetbrains.kotlin.jvm") version "1.5.31"
       id("application")
   }
}
```
