package org.github.cao.awa.com.github.cao.awa.capertml.html

import org.github.cao.awa.com.github.cao.awa.capertml.html.a.HTMLA
import org.github.cao.awa.com.github.cao.awa.capertml.html.div.HTMLDiv
import org.github.cao.awa.com.github.cao.awa.capertml.html.head.HTMLHead
import java.util.LinkedList

class HTML: HTMLElement() {
    private val elements: LinkedList<HTMLElement> = LinkedList()
    private var head: HTMLHead = HTMLHead()

    fun a(body: HTMLA.() -> Unit) {
        a("", body)
    }

    fun a(href: String, body: HTMLA.() -> Unit) {
        HTMLA().also {
            it.href(href)
            body(it)
            this.elements.add(it)
        }
    }

    fun div(body: HTMLDiv.() -> Unit) {
        HTMLDiv().also {
            body(it)
            this.elements.add(it)
        }
    }

    override fun toString(pretty: Boolean, ident: String): String {
        val builder = StringBuilder()
        builder.append("<!doctype html>")
        if (pretty) {
            builder.append("\n")
        }
        builder.append(this.head.toString(pretty, ident))
        builder.append("\n")
        builder.append("<html")
        builder.append(" lang=\"${getLang()}\"")
        builder.append(">")
        if (pretty) {
            builder.append("\n")
        }
        this.elements.forEach { element ->
            builder.append(element.toString(pretty, "$ident    "))
        }
        builder.append("</html>")
        return builder.toString()
    }
}