package org.github.cao.awa.com.github.cao.awa.capertml.html.div

import org.github.cao.awa.com.github.cao.awa.capertml.html.HTMLElement
import org.github.cao.awa.com.github.cao.awa.capertml.html.a.HTMLA
import java.util.LinkedList

class HTMLDiv: HTMLElement() {
    private val elements: LinkedList<HTMLElement> = LinkedList()

    fun a(body: HTMLA.() -> Unit) {
        HTMLA().also {
            body(it)
            this.elements.add(it)
        }
    }

    fun a(href: String, body: HTMLA.() -> Unit): HTMLA {
        return HTMLA().also {
            it.href(href)
            body(it)
            this.elements.add(it)
        }
    }

    override fun toString(pretty: Boolean, ident: String): String {
        val builder = StringBuilder()
        if (pretty) {
            builder.append(ident)
        }
        if (this.elements.isEmpty()) {
            builder.append("<div></div>")
        } else {
            builder.append("<div>\n")
            this.elements.forEach { element ->
                builder.append(element.toString(pretty, "$ident    "))
            }
            if (pretty) {
                builder.append(ident)
            }
            builder.append("</div>")
        }
        if (pretty) {
            builder.append("\n")
        }
        return builder.toString()
    }
}