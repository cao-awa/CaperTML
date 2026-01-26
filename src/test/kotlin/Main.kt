import org.github.cao.awa.com.github.cao.awa.capertml.div
import org.github.cao.awa.com.github.cao.awa.capertml.html
import org.github.cao.awa.com.github.cao.awa.capertml.html.a.media.HTMLADevice
import org.github.cao.awa.com.github.cao.awa.capertml.html.a.media.HTMLAMediaOperator
import org.github.cao.awa.com.github.cao.awa.capertml.html.a.media.HTMLAMediaValueType
import org.github.cao.awa.com.github.cao.awa.capertml.html.a.media.orientation
import org.github.cao.awa.com.github.cao.awa.capertml.html.a.media.value.orientation.HTMLAMediaOrientations
import org.github.cao.awa.com.github.cao.awa.capertml.html.a.media.width
import org.github.cao.awa.com.github.cao.awa.capertml.html.a.target.HTMLATarget

fun main() {
    println(html {
        div {
            a {

            }
        }
        a {
            href("https://example.org")
            hrefLang("zh")
            text("awa")
            target(HTMLATarget.PARENT)
            media(
                HTMLADevice.ALL,
                HTMLAMediaOperator.AND,
                orientation(HTMLAMediaOrientations.LANDSCAPE)
            )
            htmlClass("type")
        }
    }.toString(true, ""))
}