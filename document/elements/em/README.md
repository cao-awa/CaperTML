# Em
Tag 'em' can put into any textable contains, include '\<p\>', '\<div\>' and other.

```kotlin
fun main() {
    html {
        head { }
        body {
            em {
                +"Em text in body"
            }
            p {
                em {
                    +"Em text in P"
                }
            }
        }
    }
}
```