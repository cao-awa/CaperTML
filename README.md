# CaperTML

CaperTML is a DSL-style html template generator for kotlin.

## Samples

Execute the code.

```kotlin
fun main() {
    val html = html {
        lang("en")
        head {
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
                    media(
                        HTMLADevice.ALL,
                        HTMLAMediaOperator.AND,
                        orientation(HTMLAMediaOrientations.LANDSCAPE)
                    )
                    hClass("type")
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
<head>
    <title>TestPage</title>
</head>
<html lang="en">
    <body>
        <div lang="en" title="This is a title" draggable="true">
          <a lang="en" href="https://example.org" hreflang="zh" target="_parent" media="all and (orientation:landscape)" ping="https://www.google.com https://github.com" class="type">
              awa
          </a>
        </div>
    </body>
</html>
```