# Br
Tag 'br' can put into anywhere if not head scope.

```kotlin
fun main() {
    html {
        head { }
        body {
            // In body.
            br()
            p {
                +"P text"
                // In p tag.
                br()
                +"P text line2"
            }
        }
    }
}
```