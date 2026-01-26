package org.github.cao.awa.com.github.cao.awa.capertml.html

import org.github.cao.awa.com.github.cao.awa.capertml.html.a.HTMLA
import java.util.LinkedList

class HTML {
    private val elements: LinkedList<HTMLElement> = LinkedList()

    fun a(body: HTMLA.() -> Unit): HTMLA {
        return a("", body)
    }

    fun a(href: String, body: HTMLA.() -> Unit): HTMLA {
        return HTMLA().also {
            it.href(href)
            body(it)
            this.elements.add(it)
        }
    }

    fun toString(pretty: Boolean, ident: String): String {
        val builder = StringBuilder()
        builder.append("<!doctype html>")
        if (pretty) {
            builder.append("\n")
        }
        builder.append("<html>")
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