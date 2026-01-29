package org.github.cao.awa.com.github.cao.awa.capertml.html

import org.github.cao.awa.com.github.cao.awa.capertml.html.body.HTMLBody
import org.github.cao.awa.com.github.cao.awa.capertml.html.br.HTMLBr
import org.github.cao.awa.com.github.cao.awa.capertml.html.head.HTMLHead

class HTML : HTMLElement() {
    private var head: HTMLHead? = null
    private var body: HTMLBody? = null

    fun head(head: HTMLHead.() -> Unit) {
        if (this.head != null) {
            error("Head is already set")
        }
        this.head = HTMLHead().also {
            head(it)
        }
    }

    fun body(body: HTMLBody.() -> Unit) {
        if (this.body != null) {
            error("Head is already set")
        }
        this.body = HTMLBody().also {
            body(it)
        }
    }

    override fun toString(pretty: Boolean, ident: String): String {
        val builder = StringBuilder()
        builder.append("<!doctype html>")
        if (pretty) {
            builder.append("\n")
        }
        builder.append("<html")
        builder.append(" lang=\"${getLang()}\"")
        builder.append(">")
        if (pretty) {
            builder.append("\n")
        }
        if (this.head != null) {
            builder.append(this.head!!.toString(pretty, "$ident    "))
        } else {
            builder.append("<head></head>")
        }
        if (this.body != null) {
            builder.append(this.body!!.toString(pretty, "$ident    "))
        } else {
            builder.append("<body></body>")
        }
        builder.append("</html>")
        return builder.toString()
    }
}