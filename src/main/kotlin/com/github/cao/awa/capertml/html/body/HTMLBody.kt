package org.github.cao.awa.com.github.cao.awa.capertml.html.body

import org.github.cao.awa.com.github.cao.awa.capertml.html.HTMLElement
import org.github.cao.awa.com.github.cao.awa.capertml.html.a.HTMLA
import org.github.cao.awa.com.github.cao.awa.capertml.html.br.HTMLBr
import org.github.cao.awa.com.github.cao.awa.capertml.html.div.HTMLDiv
import org.github.cao.awa.com.github.cao.awa.capertml.html.text.HTMLTextable
import org.github.cao.awa.com.github.cao.awa.capertml.html.text.HTMLTextableContainer
import java.util.LinkedList

class HTMLBody: HTMLTextableContainer() {
    private val elements: LinkedList<HTMLElement> = LinkedList()

    fun div(body: HTMLDiv.() -> Unit) {
        HTMLDiv().also {
            body(it)
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