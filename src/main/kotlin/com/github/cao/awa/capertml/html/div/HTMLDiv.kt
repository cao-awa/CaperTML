package org.github.cao.awa.com.github.cao.awa.capertml.html.div

import org.github.cao.awa.com.github.cao.awa.capertml.html.HTMLElement
import org.github.cao.awa.com.github.cao.awa.capertml.html.a.HTMLA
import org.github.cao.awa.com.github.cao.awa.capertml.html.direction.HTMLDirection
import org.github.cao.awa.com.github.cao.awa.capertml.html.p.HTMLP
import org.github.cao.awa.com.github.cao.awa.capertml.html.span.HTMLSpan
import org.github.cao.awa.com.github.cao.awa.capertml.html.text.HTMLTextable
import org.github.cao.awa.com.github.cao.awa.capertml.html.text.HTMLTextableContainer
import java.util.LinkedList

class HTMLDiv: HTMLTextableContainer() {
    private val elements: LinkedList<HTMLElement> = LinkedList()

    fun span(span: HTMLSpan.() -> Unit) {
        HTMLSpan().also {
            span(it)
            this.elements.add(it)
        }
    }

    override fun addTextable(textable: HTMLTextable) {
        this.elements.add(textable as HTMLElement)
    }

    override fun toString(pretty: Boolean, ident: String): String {
        val builder = StringBuilder()
        if (pretty) {
            builder.append(ident)
        }
        if (this.elements.isEmpty()) {
            builder.append("<div></div>")
        } else {
            builder.append("<div")
            appendGlobal(builder)
            builder.append(">")
            if (pretty) {
                builder.append("\n")
            }
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