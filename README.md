# CaperTML
CaperTML is a DSL-style html template generator for kotlin.

## Samples
Execute the code.
```kotlin
fun main() {
    val html = html {
        a {
            this.href = "https://example.org"
            this.text = "awa"
            this.target = HTMLATarget.PARENT
            media(
                HTMLADevice.ALL,
                HTMLAMediaOperator.AND,
                orientation(HTMLAMediaOrientations.LANDSCAPE)
            )
        }
    }

    println(html.toString(true, ""))
}
```
You will get these output:
```html
<!doctype html>
<html>
    <a href="https://example.org" target="_parent" media="all and (orientation:landscape)">
        awa
    </a>
</html>
```