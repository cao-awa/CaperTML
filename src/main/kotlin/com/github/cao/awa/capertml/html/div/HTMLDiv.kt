package org.github.cao.awa.com.github.cao.awa.capertml.html.div

import org.github.cao.awa.com.github.cao.awa.capertml.context.HTMLFlowContext
import org.github.cao.awa.com.github.cao.awa.capertml.html.HTMLElement
import org.github.cao.awa.com.github.cao.awa.capertml.html.text.HTMLFlowContentContainer
import java.util.LinkedList

class HTMLDiv: HTMLFlowContentContainer(), HTMLFlowContext {
    private val elements: LinkedList<HTMLElement> = LinkedList()

    override fun addElement(element: HTMLElement) {
        this.elements.add(element)
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