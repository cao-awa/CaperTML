## Div
Div block cannot put into head scope.

It can put into any non-text element node.

```kotlin
fun main() {
    html {
        head { }
        body {
            // In body.
            div {
                
            }
        }
    }
}
```