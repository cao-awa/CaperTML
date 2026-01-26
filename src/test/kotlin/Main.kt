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
    }.toString(true, ""))
}