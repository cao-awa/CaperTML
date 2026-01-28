package org.github.cao.awa.com.github.cao.awa.capertml.html.a

import org.github.cao.awa.com.github.cao.awa.capertml.html.HTMLElement
import org.github.cao.awa.com.github.cao.awa.capertml.html.a.media.HTMLADevice
import org.github.cao.awa.com.github.cao.awa.capertml.html.a.media.HTMLAMedia
import org.github.cao.awa.com.github.cao.awa.capertml.html.a.media.HTMLAMediaOperator
import org.github.cao.awa.com.github.cao.awa.capertml.html.a.media.HTMLAMediaValueType
import org.github.cao.awa.com.github.cao.awa.capertml.html.a.media.value.HTMLAMediaValue
import org.github.cao.awa.com.github.cao.awa.capertml.html.a.ping.HTMLAPingList
import org.github.cao.awa.com.github.cao.awa.capertml.html.a.ref.HTMLAReferrerPolicy
import org.github.cao.awa.com.github.cao.awa.capertml.html.a.rel.HTMLARelType
import org.github.cao.awa.com.github.cao.awa.capertml.html.a.target.HTMLATarget
import org.github.cao.awa.com.github.cao.awa.capertml.html.text.HTMLTextable

class HTMLA: HTMLTextable() {
    private var download: String = ""
    private var href: String = ""
    private var hrefLang: String = ""
    private var referrerPolicy: HTMLAReferrerPolicy? = null
    private var rel: HTMLARelType? = null
    private var text: String = ""
    private var target: HTMLATarget? = null
    private var media: HTMLAMedia? = null
    private var type: String? = null
    private var ping: HTMLAPingList? = null

    fun download(download: String) {
        if (this.download.isNotEmpty()) {
            error("Download is already set")
        }
        this.download = download
    }

    fun href(href: String) {
        if (this.href.isNotEmpty()) {
            error("Href is already set")
        }
        this.href = href
    }

    fun hrefLang(hrefLang: String) {
        if (this.hrefLang.isNotEmpty()) {
            error("Href lang is already set")
        }
        this.hrefLang = hrefLang
    }

    fun referrerPolicy(policy: HTMLAReferrerPolicy) {
        if (this.referrerPolicy != null) {
            error("Referrer policy already set")
        }
        this.referrerPolicy = policy
    }

    fun rel(type: HTMLARelType) {
        if (this.rel != null) {
            error("Rel is already set")
        }
        this.rel = type
    }

    fun text(text: String) {
        setText(text)
    }

    operator fun String.unaryPlus() {
        setText(this)
    }

    private fun setText(text: String) {
        if (this.text.isNotEmpty()) {
            error("Text is already set")
        }
            this.text = text
    }

    fun target(target: HTMLATarget) {
        if (this.target != null) {
            error("Target is already set")
        }
        this.target = target
    }

    fun media(media: HTMLAMedia) {
        if (this.media != null) {
            error("Media is already set")
        }
        this.media = media
    }

    fun media(device: HTMLADevice, operator: HTMLAMediaOperator, value: HTMLAMediaValue) {
        media(HTMLAMedia(device, operator, value))
    }

    fun type(type: String) {
        if (this.type != null) {
            error("Type is already set")
        }
        this.type = type
    }

    fun ping(body: HTMLAPingList.() -> Unit) {
        if (this.ping != null) {
            error("Ping list is already set")
        }
        this.ping = HTMLAPingList().also {
            body(it)
        }
    }

    override fun toString(pretty: Boolean, ident: String): String {
        val builder = StringBuilder()
        if (pretty) {
            builder.append(ident)
        }
        builder.append("<a")
        if (getLang().isNotEmpty()) {
            builder.append(" lang=\"${getLang()}\"")
        }
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
        if (this.ping != null && !this.ping!!.isEmpty()) {
            builder.append(" ping=\"${this.ping}\"")
        }
        if (getHtmlClass().isNotEmpty()) {
            builder.append(" class=\"")
            for (clazz in getHtmlClass()) {
                builder.append(clazz)
                builder.append(" ")
            }
            builder.delete(builder.length - 1, builder.length)
            builder.append("\"")
        }
        if (getId().isNotEmpty()) {
            builder.append(" id=\"${getId()}\"")
        }
        for ((key, value) in getCustomAttr()) {
            builder.append(" $key=\"$value\"")
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