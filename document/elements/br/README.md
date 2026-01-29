# Br
Tag 'br' can put into anywhere if not head scope.

```kotlin
fun main() {
    html {
        head { }
        body {
            br()
            p {
                +"P text"
                br()
                +"P text line2"
            }
        }
    }
}
```