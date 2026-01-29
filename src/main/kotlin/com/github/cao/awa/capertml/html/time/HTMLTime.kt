package org.github.cao.awa.com.github.cao.awa.capertml.html.time

import org.github.cao.awa.com.github.cao.awa.capertml.context.HTMLPhrasingContext
import org.github.cao.awa.com.github.cao.awa.capertml.html.HTMLElement
import org.github.cao.awa.com.github.cao.awa.capertml.html.text.HTMLTextable

class HTMLTime: HTMLElement(), HTMLTextable, HTMLPhrasingContext {
    private var text: String = ""
    private var datetime: String = ""

    override fun text(text: String) {
        this.text = text
    }

    fun datetime(time: String) {
        this.datetime = time
    }

    operator fun String.unaryPlus() {
        this@HTMLTime.text = this
    }

    override fun toString(pretty: Boolean, ident: String): String {
        val builder = StringBuilder()
        if (pretty) {
            builder.append(ident)
        }
        builder.append("<time")
        appendGlobal(builder)
        if (this.datetime.isNotEmpty()) {
            builder.append(" datetime=\"${this.datetime}\"")
        }
        builder.append(">")
        if (this.text.isNotEmpty()) {
            builder.append(this.text)
        }
        builder.append("</time>")
        if (pretty) {
            builder.append("\n")
        }
        return builder.toString()
    }
}