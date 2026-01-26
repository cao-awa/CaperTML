package org.github.cao.awa.com.github.cao.awa.capertml

import org.github.cao.awa.com.github.cao.awa.capertml.html.HTML

fun html(body: HTML.() -> Unit): HTML {
    return HTML().also {
        body(it)
    }
}