package org.github.cao.awa.com.github.cao.awa.capertml.html.body

import org.github.cao.awa.com.github.cao.awa.capertml.html.HTMLElement
import org.github.cao.awa.com.github.cao.awa.capertml.html.a.HTMLA
import org.github.cao.awa.com.github.cao.awa.capertml.html.div.HTMLDiv
import java.util.LinkedList

class HTMLBody: HTMLElement() {
    private val elements: LinkedList<HTMLElement> = LinkedList()

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
        if (pretty) {
            builder.append(ident)
        }
        builder.append("<body>\n")
        for (element in this.elements) {
            builder.append(element.toString(pretty, "$ident    "))
        }
        if (pretty) {
            builder.append(ident)
        }
        builder.append("</body>\n")
        return builder.toString()
    }
}