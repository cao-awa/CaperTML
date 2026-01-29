package org.github.cao.awa.com.github.cao.awa.capertml.html.p

import org.github.cao.awa.com.github.cao.awa.capertml.html.HTMLElement
import org.github.cao.awa.com.github.cao.awa.capertml.html.img.HTMLImg
import org.github.cao.awa.com.github.cao.awa.capertml.html.span.HTMLSpan
import org.github.cao.awa.com.github.cao.awa.capertml.html.text.HTMLFlowContentContainer
import org.github.cao.awa.com.github.cao.awa.capertml.html.text.HTMLText
import org.github.cao.awa.com.github.cao.awa.capertml.html.text.HTMLTextable
import org.github.cao.awa.com.github.cao.awa.capertml.style.align.HTMLAlignType
import java.util.LinkedList

class HTMLP: HTMLFlowContentContainer(), HTMLTextable {
    private val elements: LinkedList<HTMLElement> = LinkedList()
    @Deprecated(level = DeprecationLevel.WARNING, message = "Deprecated in HTML5 and HTML 4.01")
    private var align: HTMLAlignType? = null

    operator fun String.unaryPlus() {
        this@HTMLP.elements.add(
            HTMLText().apply {
                text(this@unaryPlus)
            }
        )
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "Deprecated in HTML5 and HTML 4.01")
    fun align(align: HTMLAlignType) {
        this. align = align
    }

    fun span(body: HTMLSpan.() -> Unit) {
        HTMLSpan().also {
            body(it)
            this.elements.add(it)
        }
    }

    override fun toString(pretty: Boolean, ident: String): String {
        val builder = StringBuilder()
        if (pretty) {
            builder.append(ident)
        }
        builder.append("<p")
        appendGlobal(builder)
        if (this.align != null) {
            builder.append(" align=\"${this.align!!.literal}\"")
        }
        builder.append(">")
        if (pretty) {
            builder.append("\n")
        }
        if (this.elements.isNotEmpty()) {
            for (element in this.elements) {
                builder.append(element.toString(pretty, "$ident    "))
            }
            builder.delete(builder.length - 1, builder.length)
        }
        if (pretty) {
            builder.append("\n")
            builder.append(ident)
        }
        builder.append("</p>")
        if (pretty) {
            builder.append("\n")
        }
        return builder.toString()
    }

    override fun img(body: HTMLImg.() -> Unit) {
        HTMLImg().also {
            body(it)
            this.elements.add(it)
        }
    }

    override fun addElement(element: HTMLElement) {
        this.elements.add(element)
    }

    override fun text(text: String) {
        this.elements.add(HTMLText().apply {
            text(text)
        })
    }
}