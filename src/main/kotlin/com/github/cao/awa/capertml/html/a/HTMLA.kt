package org.github.cao.awa.com.github.cao.awa.capertml.html.a

import org.github.cao.awa.com.github.cao.awa.capertml.html.HTMLElement
import org.github.cao.awa.com.github.cao.awa.capertml.html.a.media.HTMLADevice
import org.github.cao.awa.com.github.cao.awa.capertml.html.a.media.HTMLAMedia
import org.github.cao.awa.com.github.cao.awa.capertml.html.a.media.HTMLAMediaOperator
import org.github.cao.awa.com.github.cao.awa.capertml.html.a.media.HTMLAMediaValueType
import org.github.cao.awa.com.github.cao.awa.capertml.html.a.media.value.HTMLAMediaValue
import org.github.cao.awa.com.github.cao.awa.capertml.html.a.target.HTMLATarget

class HTMLA: HTMLElement {
    var download: String = ""
    var href: String = ""
    var text: String = ""
    var target: HTMLATarget? = null
    var media: HTMLAMedia? = null

    fun href(href: String): HTMLA {
        this.href = href
        return this
    }

    fun text(text: String): HTMLA {
        this.text = text
        return this
    }

    fun media(device: HTMLADevice, operator: HTMLAMediaOperator, value: HTMLAMediaValue): HTMLA {
        this.media = HTMLAMedia(device, operator, value)
        return this
    }

    override fun toString(pretty: Boolean, ident: String): String {
        val builder = StringBuilder()
        if (this.href.isNotEmpty()) {
            if (pretty) {
                builder.append(ident)
            }
            builder.append("<a href=\"${this.href}\"")
        }
        if (this.target != null) {
            builder.append(" target=\"${this.target!!.literal}\"")
        }
        if (this.download.isNotEmpty()) {
            builder.append(" download=\"${this.download}\"")
        }
        if (this.media != null) {
            builder.append(" media=\"${this.media!!.toString(pretty, ident)}\"")
        }
        builder.append(">")

        if (this.text.isNotEmpty()) {
            if (pretty) {
                builder.append("\n")
                builder.append("$ident    ")
            }
            builder.append(this.text)
            if (pretty) {
                builder.append("\n")
            }
        }
        if (pretty) {
            builder.append(ident)
        }
        builder.append("</a>")
        if (pretty) {
            builder.append("\n")
        }
        return builder.toString()
    }
}