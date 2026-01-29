package org.github.cao.awa.com.github.cao.awa.capertml.html.text

import org.github.cao.awa.com.github.cao.awa.capertml.html.HTMLElement
import org.github.cao.awa.com.github.cao.awa.capertml.html.a.HTMLA
import org.github.cao.awa.com.github.cao.awa.capertml.html.b.HTMLB
import org.github.cao.awa.com.github.cao.awa.capertml.html.br.HTMLBr
import org.github.cao.awa.com.github.cao.awa.capertml.html.em.HTMLEm
import org.github.cao.awa.com.github.cao.awa.capertml.html.h.HTMLH1
import org.github.cao.awa.com.github.cao.awa.capertml.html.h.HTMLH2
import org.github.cao.awa.com.github.cao.awa.capertml.html.h.HTMLH3
import org.github.cao.awa.com.github.cao.awa.capertml.html.h.HTMLH4
import org.github.cao.awa.com.github.cao.awa.capertml.html.h.HTMLH5
import org.github.cao.awa.com.github.cao.awa.capertml.html.h.HTMLH6
import org.github.cao.awa.com.github.cao.awa.capertml.html.h.HTMLI
import org.github.cao.awa.com.github.cao.awa.capertml.html.p.HTMLP

abstract class HTMLTextableContainer : HTMLElement() {
    abstract fun addTextable(textable: HTMLTextable)

    fun a(a: HTMLA.() -> Unit) {
        HTMLA().also {
            a(it)
            addTextable(it)
        }
    }

    fun a(href: String, body: HTMLA.() -> Unit) {
        HTMLA().also {
            it.href(href)
            body(it)
            addTextable(it)
        }
    }

    fun p(body: HTMLP.() -> Unit) {
        HTMLP().also {
            body(it)
            addTextable(it)
        }
    }

    fun h1(body: HTMLH1.() -> Unit) {
        HTMLH1().also {
            body(it)
            addTextable(it)
        }
    }

    fun h2(body: HTMLH2.() -> Unit) {
        HTMLH2().also {
            body(it)
            addTextable(it)
        }
    }

    fun h3(body: HTMLH3.() -> Unit) {
        HTMLH3().also {
            body(it)
            addTextable(it)
        }
    }

    fun h4(body: HTMLH4.() -> Unit) {
        HTMLH4().also {
            body(it)
            addTextable(it)
        }
    }

    fun h5(body: HTMLH5.() -> Unit) {
        HTMLH5().also {
            body(it)
            addTextable(it)
        }
    }

    fun h6(body: HTMLH6.() -> Unit) {
        HTMLH6().also {
            body(it)
            addTextable(it)
        }
    }

    fun br() {
        br {

        }
    }

    fun em(body: HTMLEm.() -> Unit) {
        HTMLEm().also {
            body(it)
            addTextable(it)
        }
    }

    fun i(body: HTMLI.() -> Unit) {
        HTMLI().also {
            body(it)
            addTextable(it)
        }
    }

    fun b(body: HTMLB.() -> Unit) {
        HTMLB().also {
            body(it)
            addTextable(it)
        }
    }

    fun br(body: HTMLBr.() -> Unit) {
        HTMLBr().also {
            body(it)
            addTextable(it)
        }
    }
}