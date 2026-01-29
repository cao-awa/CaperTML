package org.github.cao.awa.com.github.cao.awa.capertml.html.p

import org.github.cao.awa.com.github.cao.awa.capertml.html.HTMLElement
import org.github.cao.awa.com.github.cao.awa.capertml.html.img.HTMLImg
import org.github.cao.awa.com.github.cao.awa.capertml.html.text.HTMLImageContainer
import org.github.cao.awa.com.github.cao.awa.capertml.html.text.HTMLText
import org.github.cao.awa.com.github.cao.awa.capertml.html.text.HTMLTextable
import org.github.cao.awa.com.github.cao.awa.capertml.html.text.HTMLTextableContainer
import org.github.cao.awa.com.github.cao.awa.capertml.style.align.HTMLAlignType
import java.util.LinkedList

class HTMLP: HTMLTextableContainer(), HTMLTextable, HTMLImageContainer {
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

    override fun addImage(img: HTMLImg) {
        this.elements.add(img)
    }

    override fun addTextable(textable: HTMLTextable) {
        this.elements.add(textable as HTMLElement)
    }
}