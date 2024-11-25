# Gradle run with Java plugin

**Command** `gradle tasks`

**`build.gradle.kts`**

```kts
plugins {
  java
}
```

## Java Plugin Tasks

- `compliling class` Complie Java sang Class build

```bash
gradlew complieJava
```

- `managing resources` Chép src sang build

```bash
gradlew processResources
```

- `package into jar file` Complie class và src vào gói Jar archive

```bash
gradlew jar
```

- `Test`Thử code

```bash
gradlew test
```

**Dependencies**

```
dependencies {
    implementation 'group:name:version'
    testImplementation 'group:name:version'
}
```