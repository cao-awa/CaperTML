package org.github.cao.awa.com.github.cao.awa.capertml.html.p

import org.github.cao.awa.com.github.cao.awa.capertml.html.text.HTMLTextable
import org.github.cao.awa.com.github.cao.awa.capertml.style.align.HTMLAlignType

class HTMLP: HTMLTextable() {
    private var text: String? = null
    @Deprecated(level = DeprecationLevel.WARNING, message = "Deprecated in HTML5 and HTML 4.01")
    private var align: HTMLAlignType? = null

    operator fun String.unaryPlus() {
        this@HTMLP.text = this
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "Deprecated in HTML5 and HTML 4.01")
    fun align(align: HTMLAlignType) {
        this.align = align
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
        if (this.text != null) {
            builder.append(this.text)
        }
        builder.append("</p>")
        if (pretty) {
            builder.append("\n")
        }
        return builder.toString()
    }
}