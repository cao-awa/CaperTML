package org.github.cao.awa.com.github.cao.awa.capertml.html.a

import org.github.cao.awa.com.github.cao.awa.capertml.html.HTMLElement
import org.github.cao.awa.com.github.cao.awa.capertml.html.a.media.HTMLADevice
import org.github.cao.awa.com.github.cao.awa.capertml.html.a.media.HTMLAMedia
import org.github.cao.awa.com.github.cao.awa.capertml.html.a.media.HTMLAMediaOperator
import org.github.cao.awa.com.github.cao.awa.capertml.html.a.media.HTMLAMediaValueType
import org.github.cao.awa.com.github.cao.awa.capertml.html.a.media.value.HTMLAMediaValue
import org.github.cao.awa.com.github.cao.awa.capertml.html.a.ref.HTMLAReferrerPolicy
import org.github.cao.awa.com.github.cao.awa.capertml.html.a.rel.HTMLARelType
import org.github.cao.awa.com.github.cao.awa.capertml.html.a.target.HTMLATarget

class HTMLA: HTMLElement() {
    private var download: String = ""
    private var href: String = ""
    private var hrefLang: String = ""
    private var referrerPolicy: HTMLAReferrerPolicy? = null
    private var rel: HTMLARelType? = null
    private var text: String = ""
    private var target: HTMLATarget? = null
    private var media: HTMLAMedia? = null
    private var type: String? = null

    fun download(download: String) {
        this.download = download
    }

    fun href(href: String) {
        this.href = href
    }

    fun hrefLang(hrefLang: String) {
        this.hrefLang = hrefLang
    }

    fun referrerPolicy(policy: HTMLAReferrerPolicy) {
        this.referrerPolicy = policy
    }

    fun rel(type: HTMLARelType) {
        this.rel = type
    }

    fun text(text: String) {
        this.text = text
    }

    fun target(target: HTMLATarget) {
        this.target = target
    }

    fun media(device: HTMLADevice, operator: HTMLAMediaOperator, value: HTMLAMediaValue) {
        this.media = HTMLAMedia(device, operator, value)
    }

    fun type(type: String) {
        this.type = type
    }

    override fun toString(pretty: Boolean, ident: String): String {
        val builder = StringBuilder()
        if (pretty) {
            builder.append(ident)
        }
        builder.append("<a")
        if (this.href.isNotEmpty()) {
            builder.append(" href=\"${this.href}\"")
        }
        if (this.hrefLang.isNotEmpty()) {
            builder.append(" hreflang=\"${this.hrefLang}\"")
        }
        if (this.referrerPolicy != null) {
            builder.append(" referrer-policy=\"${this.referrerPolicy!!.literal}\"")
        }
        if (this.rel != null) {
            builder.append(" rel=\"${this.rel!!.literal}\"")
        }
        if (this.target != null) {
            builder.append(" target=\"${this.target!!.literal}\"")
        }
        if (this.download.isNotEmpty()) {
            builder.append(" download=\"${this.download}\"")
        }
        if (this.media != null) {
            builder.append(" media=\"${this.media}\"")
        }
        if (this.type != null) {
            builder.append(" type=\"${this.type}\"")
        }
        if (getHtmlClass().isNotEmpty()) {
            builder.append(" class=\"${getHtmlClass()}\"")
        }
        builder.append(">")

        if (pretty) {
            builder.append("\n")
            builder.append("$ident    ")
        }
        if (this.text.isNotEmpty()) {
            builder.append(this.text)
        }
        if (pretty) {
            builder.append("\n")
            builder.append(ident)
        }
        builder.append("</a>")
        if (pretty) {
            builder.append("\n")
        }
        return builder.toString()
    }
}