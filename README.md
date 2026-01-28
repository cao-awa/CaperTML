# CaperTML

CaperTML is a DSL-style strong type html template generator for kotlin.

![](https://count.getloli.com/get/@capertml?theme=rule34)

## Samples

Execute the code.

```kotlin
fun main() {
    val html = html {
        lang("en")
        head {
            // This invoke is global attr in HTML, but will not be appending to generated HTML.
            title("INVALID CASE")
            pageTitle {
                +"TestPage"
            }
        }
        body {
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
                    // Standard media style.
                    media(
                        HTMLADevice.ALL,
                        HTMLAMediaOperator.AND,
                        orientation(HTMLAMediaOrientations.LANDSCAPE)
                    )
                    classes("type", "test")
                }
                a {
                    href("https://www.awa.com")
                    // Shorter media style.
                    media(all and landscape)
                }
            }
        }
    }

    println(html.toString(true, ""))
}
```

You will get these output:

```
<!doctype html>
<html lang="en">
    <head>
        <title>TestPage</title>
    </head>
    <body>
        <div title="This is a title" draggable="true">
            <a href="https://example.org" hreflang="zh" target="_parent" media="all and (orientation:landscape)" ping="https://www.google.com https://github.com" class="type test">
                awa
            </a>
            <a href="https://www.awa.com" media="all and (orientation:landscape)">
                
            </a>
        </div>
    </body>
</html>
```
