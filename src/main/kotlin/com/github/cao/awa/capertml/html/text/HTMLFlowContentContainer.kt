package org.github.cao.awa.com.github.cao.awa.capertml.html.text

import org.github.cao.awa.com.github.cao.awa.capertml.html.HTMLElement
import org.github.cao.awa.com.github.cao.awa.capertml.html.a.HTMLA
import org.github.cao.awa.com.github.cao.awa.capertml.html.abbr.HTMLAbbr
import org.github.cao.awa.com.github.cao.awa.capertml.html.b.HTMLB
import org.github.cao.awa.com.github.cao.awa.capertml.html.br.HTMLBr
import org.github.cao.awa.com.github.cao.awa.capertml.html.em.HTMLEm
import org.github.cao.awa.com.github.cao.awa.capertml.html.h.HTMLH1
import org.github.cao.awa.com.github.cao.awa.capertml.html.h.HTMLH2
import org.github.cao.awa.com.github.cao.awa.capertml.html.h.HTMLH3
import org.github.cao.awa.com.github.cao.awa.capertml.html.h.HTMLH4
import org.github.cao.awa.com.github.cao.awa.capertml.html.h.HTMLH5
import org.github.cao.awa.com.github.cao.awa.capertml.html.h.HTMLH6
import org.github.cao.awa.com.github.cao.awa.capertml.html.i.HTMLI
import org.github.cao.awa.com.github.cao.awa.capertml.html.img.HTMLImg
import org.github.cao.awa.com.github.cao.awa.capertml.html.p.HTMLP

abstract class HTMLFlowContentContainer : HTMLElement() {
    abstract fun addElement(element: HTMLElement)

    fun a(a: HTMLA.() -> Unit) {
        HTMLA().also {
            a(it)
            addElement(it)
        }
    }

    fun a(href: String, body: HTMLA.() -> Unit) {
        HTMLA().also {
            it.href(href)
            body(it)
            addElement(it)
        }
    }

    fun p(body: HTMLP.() -> Unit) {
        HTMLP().also {
            body(it)
            addElement(it)
        }
    }

    open fun h1(body: HTMLH1.() -> Unit) {
        HTMLH1().also {
            body(it)
            addElement(it)
        }
    }

    open fun h2(body: HTMLH2.() -> Unit) {
        HTMLH2().also {
            body(it)
            addElement(it)
        }
    }

    open fun h3(body: HTMLH3.() -> Unit) {
        HTMLH3().also {
            body(it)
            addElement(it)
        }
    }

    open fun h4(body: HTMLH4.() -> Unit) {
        HTMLH4().also {
            body(it)
            addElement(it)
        }
    }

    open fun h5(body: HTMLH5.() -> Unit) {
        HTMLH5().also {
            body(it)
            addElement(it)
        }
    }

    open fun h6(body: HTMLH6.() -> Unit) {
        HTMLH6().also {
            body(it)
            addElement(it)
        }
    }

    fun br() {
        br {

        }
    }

    fun em(body: HTMLEm.() -> Unit) {
        HTMLEm().also {
            body(it)
            addElement(it)
        }
    }

    fun i(body: HTMLI.() -> Unit) {
        HTMLI().also {
            body(it)
            addElement(it)
        }
    }

    fun b(body: HTMLB.() -> Unit) {
        HTMLB().also {
            body(it)
            addElement(it)
        }
    }

    fun br(body: HTMLBr.() -> Unit) {
        HTMLBr().also {
            body(it)
            addElement(it)
        }
    }

    open fun img(body: HTMLImg.() -> Unit) {
        HTMLImg().also {
            body(it)
            addElement(it)
        }
    }

    open fun abbr(text: String, body: HTMLAbbr.() -> Unit) {
        HTMLAbbr(HTMLText().apply {
            text(text)
        }).also {
            body(it)
            addElement(it)
        }
    }
}