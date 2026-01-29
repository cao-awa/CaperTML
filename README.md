# CaperTML

CaperTML is a DSL-style strong type html template generator for kotlin.

![](https://count.getloli.com/get/@capertml?theme=rule34)

## Do notice

CaperTML are not a assembly as will tool, it enforces a subset of HTML content rules at compile time, this is not a
string template engine.

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
            }
            meta {
                viewport {
                    width(DEVICE_WIDTH)
                    initialScale(1.0)
                }
            }
            pageTitle {
                +"TestPage"
            }
        }
        body {
            div {
                draggable()
                title("This is a title")
                h1 {
                    +"Section title"
                }
                span {
                    p {
                        +"This is a p text"
                        img {
                            src("/awa.png")
                            width(DEVICE_WIDTH)
                            height(DEVICE_HEIGHT)
                        }
                        br()
                        em {
                            +"notice"
                        }
                        b {
                            +"Notice 2"
                            classes("the-b")
                        }
                        classes("the-p")
                    }
                }
                br()
                br()
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
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width,initial-scale=1.0">
        <title>TestPage</title>
    </head>
    <body>
        <div title="This is a title" draggable="true">
            <h1>Section title</h1>
            <span>
                <p class="the-p">
                    This is a p text
                    <img src="/awa.png" width="device-width" height="device-height">
                    <br />
                    <em>notice</em>
                    <b class="the-b">Notice 2</b>
                </p>
            </span>
            <br />
            <br />
            <a href="https://example.org" hreflang="zh" target="_parent" media="all and (orientation:landscape)" ping="https://www.google.com https://github.com" class="type test" class="type test" data-my-tag="awa">
                awa
            </a>
            <a href="https://www.awa.com" media="all and (orientation:landscape)">
                
            </a>
        </div>
    </body>
</html>
```

## Philosophy

CaperTML is **not** a general-purpose HTML template engine, nor a string-based HTML assembler.

It is a **DSL-style, strongly-typed HTML generator** whose primary goal is **correctness**.

### Design Goal

The core design goal of CaperTML is simple:

> **If HTML is invalid by specification, it should be impossible to produce it.**

Instead of validating HTML at runtime or relying on user discipline,
CaperTML enforces a **strict subset of HTML content rules at compile time** through Kotlin’s type system.

This means:

* Invalid tag nesting is rejected by the compiler
* Invalid attributes for a given element cannot be expressed
* Certain structural rules (e.g. document layout) are encoded into the DSL itself

As a result, generated HTML is **structurally valid by construction**.

### Not a Template Engine

CaperTML is intentionally **not** a template engine.

It does **not**:

* Perform string interpolation
* Evaluate runtime expressions in templates
* Attempt to replace frontend frameworks
* Aim to be fully compatible with every browser quirk or framework-specific pattern

If you need maximum flexibility or free-form HTML generation, CaperTML is likely **not the right tool**.

### Strong Typing over Flexibility

CaperTML favors **strong typing and explicit modeling** over permissive APIs.

HTML concepts such as:

* attributes
* media queries
* targets
* element-specific constraints

are represented as **types**, not strings.

This provides:

* Compile-time safety
* IDE auto-completion
* Self-documenting APIs
* Reduced reliance on external HTML references

When necessary, controlled escape hatches (such as custom attributes) are provided, but they are **explicit**, not
implicit.

### Subset by Design

CaperTML does not aim to model *every* possible HTML behavior.

Instead, it models a **well-defined, safe subset** of HTML that is:

* predictable
* spec-oriented
* suitable for static generation and server-side rendering

This design choice is intentional and allows the DSL to remain:

* readable
* maintainable
* analyzable by the compiler

### Who Is This For?

CaperTML is suitable for:

* Static HTML generation
* Server-side HTML rendering
* Projects where correctness matters more than permissiveness
* Developers interested in DSL design and type-driven APIs

It is **not** intended for:

* Complex SPA development
* Framework-specific attribute hacks
* Runtime-heavy template logic

### Summary

CaperTML treats HTML as a **structured language**, not a string.

By encoding HTML rules into the type system, it shifts error detection from runtime to compile time and makes invalid
HTML **unrepresentable**.

Correctness is not an option — it is the default.

