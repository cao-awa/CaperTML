package org.github.cao.awa.com.github.cao.awa.capertml.html.body

import org.github.cao.awa.com.github.cao.awa.capertml.html.HTMLElement
import org.github.cao.awa.com.github.cao.awa.capertml.html.div.HTMLDiv
import org.github.cao.awa.com.github.cao.awa.capertml.html.text.HTMLFlowContentContainer
import java.util.LinkedList

class HTMLBody: HTMLFlowContentContainer() {
    private val elements: LinkedList<HTMLElement> = LinkedList()

    fun div(body: HTMLDiv.() -> Unit) {
        HTMLDiv().also {
            body(it)
            this.elements.add(it)
        }
    }

    override fun addElement(element: HTMLElement) {
        this.elements.add(element)
    }

    override fun toString(pretty: Boolean, ident: String): String {
        val builder = StringBuilder()
        if (pretty) {
            builder.append(ident)
        }
        builder.append("<body>")
        if (pretty) {
            builder.append("\n")
        }
        for (element in this.elements) {
            builder.append(element.toString(pretty, "$ident    "))
        }
        if (pretty) {
            builder.append(ident)
        }
        builder.append("</body>")
        if (pretty) {
            builder.append("\n")
        }
        return builder.toString()
    }
}