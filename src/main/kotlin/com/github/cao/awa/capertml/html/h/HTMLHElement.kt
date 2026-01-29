package org.github.cao.awa.com.github.cao.awa.capertml.html.h

import org.github.cao.awa.com.github.cao.awa.capertml.context.HTMLPhrasingContext
import org.github.cao.awa.com.github.cao.awa.capertml.html.HTMLElement
import org.github.cao.awa.com.github.cao.awa.capertml.html.text.HTMLTextable

abstract class HTMLHElement: HTMLElement(), HTMLTextable, HTMLPhrasingContext {
    private var text: String? = null

    operator fun String.unaryPlus() {
        this@HTMLHElement.text = this
    }

    override fun text(text: String) {
        this.text = text
    }

    override fun toString(pretty: Boolean, ident: String): String {
        val builder = StringBuilder()
        if (pretty) {
            builder.append(ident)
        }
        builder.append("<${getTagName()}")
        appendGlobal(builder)
        builder.append(">")
        if (this.text != null) {
            builder.append(this.text)
        }
        builder.append("</${getTagName()}>")
        if (pretty) {
            builder.append("\n")
        }
        return builder.toString()
    }

    abstract fun getTagName(): String
}