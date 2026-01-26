package org.github.cao.awa.com.github.cao.awa.capertml.html.head

import org.github.cao.awa.com.github.cao.awa.capertml.html.HTMLElement

class HTMLHead: HTMLElement() {
    override fun toString(pretty: Boolean, ident: String): String {
        val builder = StringBuilder()
        builder.append("<head>")
        builder.append("</head>")
        return builder.toString()
    }
}