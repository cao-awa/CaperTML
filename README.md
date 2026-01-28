# CaperTML

CaperTML is a DSL-style strong type html template generator for kotlin.

![](https://count.getloli.com/get/@capertml?theme=rule34)

# Do notice
CaperTML are not a assembly as will tool, it enforces a subset of HTML content rules at compile time.

It's making invalid HTML content cannot be produce.

## Samples

Execute the code:

```kotlin
fun main() {
    val html = html {
        lang("en")
        head {
            meta {
                charset(Charsets.UTF_8)
                content(viewport {
                    width(DEVICE_WIDTH)
                    initialScale(1.0)
                })
            }
            pageTitle {
                +"TestPage"
            }
        }
        body {
            div {
                title("This is a title")
                draggable()
                a {
                    +"awa"
                    // Custom tag attr.
                    custom("my-tag", "awa")
                    // Href.
                    href("https://example.org")
                    // Href lang.
                    hrefLang("zh")
                    // Target.
                    target(HTMLATarget.PARENT)
                    // Ping list.
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
                    // Element classes.
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
        <meta charset="UTF-8" name="viewport" content="width=device-width,initial-scale=1.0"></meta>
        <title>TestPage</title>
    </head>
    <body>
        <div title="This is a title" draggable="true">
            <a href="https://example.org" hreflang="zh" target="_parent" media="all and (orientation:landscape)" ping="https://www.google.com https://github.com" class="type test" my-tag="awa">
                awa
            </a>
            <a href="https://www.awa.com" media="all and (orientation:landscape)">
                
            </a>
        </div>
    </body>
</html>
```
