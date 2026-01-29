# H1 ~ H6
Tag 'h1' ~ 'h6' can put into any textable contains, include '\<span\>', '\<div\>' and other.

It cannot put into text element like '\<p\>' or '\<em\>' ETC.

```kotlin
fun main() {
    html {
        head { }
        body {
            // In body.
            h1 {
                +"H1 text"
            }
            h2 {
                +"H2 text"
            }
            // ... and others.
        }
    }
}
```