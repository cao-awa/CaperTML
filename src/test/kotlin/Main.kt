import org.github.cao.awa.com.github.cao.awa.capertml.html
import org.github.cao.awa.com.github.cao.awa.capertml.html.a.media.HTMLADevice
import org.github.cao.awa.com.github.cao.awa.capertml.html.a.media.HTMLAMediaOperator
import org.github.cao.awa.com.github.cao.awa.capertml.html.a.media.all
import org.github.cao.awa.com.github.cao.awa.capertml.html.a.media.orientation
import org.github.cao.awa.com.github.cao.awa.capertml.html.a.media.value.orientation.HTMLAMediaOrientations
import org.github.cao.awa.com.github.cao.awa.capertml.html.a.media.value.orientation.landscape
import org.github.cao.awa.com.github.cao.awa.capertml.html.a.target.HTMLATarget
import org.github.cao.awa.com.github.cao.awa.capertml.html.head.meta.content.HTMLHeadMetaContentType
import org.github.cao.awa.com.github.cao.awa.capertml.html.head.meta.content.VIEWPORT
import org.github.cao.awa.com.github.cao.awa.capertml.html.head.meta.content.viewport.builder.viewport
import org.github.cao.awa.com.github.cao.awa.capertml.style.width.DEVICE_WIDTH
import java.io.File

fun main() {
    val html = html {
        lang("en")
        head {
            meta {
                charset(Charsets.UTF_8)
                content(VIEWPORT, viewport {
                    width(DEVICE_WIDTH)
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

    File("test.html").bufferedWriter(Charsets.UTF_8).use {
        it.write(html.toString(pretty = true, ident = ""))
        it.flush()
        it.close()
    }
}