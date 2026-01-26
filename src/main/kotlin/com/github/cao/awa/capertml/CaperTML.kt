package org.github.cao.awa.com.github.cao.awa.capertml

import org.github.cao.awa.com.github.cao.awa.capertml.html.HTML
import org.github.cao.awa.com.github.cao.awa.capertml.html.a.HTMLA
import org.github.cao.awa.com.github.cao.awa.capertml.html.div.HTMLDiv

fun html(body: HTML.() -> Unit): HTML {
    return HTML().also {
        body(it)
    }
}

fun a(body: HTMLA.() -> Unit): HTMLA {
    return HTMLA().also {
        body(it)
    }
}

fun div(body: HTMLDiv.() -> Unit): HTMLDiv {
    return HTMLDiv().also {
        body(it)
    }
}