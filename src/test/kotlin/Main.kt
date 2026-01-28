import org.github.cao.awa.com.github.cao.awa.capertml.html
import org.github.cao.awa.com.github.cao.awa.capertml.html.a.media.HTMLADevice
import org.github.cao.awa.com.github.cao.awa.capertml.html.a.media.HTMLAMediaOperator
import org.github.cao.awa.com.github.cao.awa.capertml.html.a.media.orientation
import org.github.cao.awa.com.github.cao.awa.capertml.html.a.media.value.orientation.HTMLAMediaOrientations
import org.github.cao.awa.com.github.cao.awa.capertml.html.a.target.HTMLATarget
import java.io.File

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
                    media(
                        HTMLADevice.ALL,
                        HTMLAMediaOperator.AND,
                        orientation(HTMLAMediaOrientations.LANDSCAPE)
                    )
                    classes("type", "test")
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