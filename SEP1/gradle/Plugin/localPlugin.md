# Local plugin
**Các cách cơ bản để viết với local plugin**

- Viết inline trong file build
```kts
import org.gradle.api.Plugin
import org.gradle.api.Project

class customPlugin: Plugin<Project> {
    override fun apply(project: Project) {
        project.tasks.register("hello") {
            doLast {
                println("Hello world plugin")
            }
        }
    }
}
```
- Viết vào module trong root dự án <- Chưa rõ lắm :"