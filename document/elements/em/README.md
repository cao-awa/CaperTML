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

## Methods
Tag 'i' has only a ```text``` method used to set text.

And could use plus operator to set the text.
