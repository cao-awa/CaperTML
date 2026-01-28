package org.github.cao.awa.com.github.cao.awa.capertml.html

import org.github.cao.awa.com.github.cao.awa.capertml.html.a.HTMLA
import org.github.cao.awa.com.github.cao.awa.capertml.html.body.HTMLBody
import org.github.cao.awa.com.github.cao.awa.capertml.html.div.HTMLDiv
import org.github.cao.awa.com.github.cao.awa.capertml.html.head.HTMLHead
import java.util.LinkedList

class HTML : HTMLElement() {
    private var head: HTMLHead = HTMLHead()
    private var body: HTMLBody = HTMLBody()

    fun head(body: HTMLHead.() -> Unit) {
        body(this.head)
    }

    fun body(body: HTMLBody.() -> Unit) {
        body(this.body)
    }

    override fun toString(pretty: Boolean, ident: String): String {
        val builder = StringBuilder()
        builder.append("<!doctype html>")
        if (pretty) {
            builder.append("\n")
        }
        builder.append(this.head.toString(pretty, "$ident    "))
        builder.append("<html")
        builder.append(" lang=\"${getLang()}\"")
        builder.append(">")
        if (pretty) {
            builder.append("\n")
        }
        builder.append(this.body.toString(pretty, "$ident    "))
        builder.append("</html>")
        return builder.toString()
    }
}