# CaperTML
CaperTML is a DSL-style html template generator for kotlin.

## Samples
Execute the code.
```kotlin
fun main() {
    val html = html {
        lang("en")
        div {
            title("This is a title")
            draggable()
            a {
                href("https://example.org")
                hrefLang("zh")
                text("awa")
                target(HTMLATarget.PARENT)
                ping {
                    +"https://www.google.com"
                    +"https://github.com"
                }
                media(
                    HTMLADevice.ALL,
                    HTMLAMediaOperator.AND,
                    orientation(HTMLAMediaOrientations.LANDSCAPE)
                )
                hClass("type")
            }
        }
    }

    println(html.toString(true, ""))
}
```
You will get these output:
```html
<!doctype html>
<head></head>
<html lang="en">
<div title="This is a title" draggable="true">
    <a href="https://example.org" hreflang="zh" target="_parent" media="all and (orientation:landscape)" ping="https://www.google.com https://github.com" class="type">
        awa
    </a>
</div>
</html>
```