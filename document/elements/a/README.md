# A
Tag 'a' can put into any textable contains, include '\<p\>', '\<div\>' and other.

```kotlin
fun main() {
    html {
        head { }
        body {
            // In body.
            a {
                +"Example"
                href("https://example.org")
            }
            div {
                // In div.
                a {
                    +"GitHub"
                    href("https://github.org")
                }
                p {
                    // In p.
                    a {
                        +"Google"
                        href("https://google.org")
                    }
                }
            }
        }
    }
}
```