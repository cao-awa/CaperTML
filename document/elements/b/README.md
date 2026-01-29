# B
Tag 'b' can put into any textable contains, include '\<p\>', '\<div\>' and other.

```kotlin
fun main() {
    html {
        head { }
        body {
            b { 
                +"Bold text in body"
            }
            p {
                b {
                    +"Bold text in p"
                }
            }
        }
    }
}
```

## Methods
Tag 'b' has only a ```text``` method used to set text.

And could use plus operator to set the text.
