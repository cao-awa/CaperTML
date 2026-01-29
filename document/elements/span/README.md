# Span
Tag 'span' can put into any textable contains, include '\<p\>', '\<div\>' and other.

```kotlin
fun main() {
    html {
        head { }
        body {
            span {
                +"Span text in body"
            }
            p {
                span {
                    +"Span text in p"
                }
            }
        }
    }
}
```