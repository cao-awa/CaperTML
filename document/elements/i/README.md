# I
Tag 'i' can put into any textable contains, include '\<p\>', '\<div\>' and other.

```kotlin
fun main() {
    html {
        head { }
        body {
            i {
                +"I text"
            }
            p {
                i {
                    +"I text in P"
                }
            }
        }
    }
}
```