package org.github.cao.awa.com.github.cao.awa.capertml.html.text

import org.github.cao.awa.com.github.cao.awa.capertml.html.HTMLElement
import org.github.cao.awa.com.github.cao.awa.capertml.html.a.HTMLA
import org.github.cao.awa.com.github.cao.awa.capertml.html.br.HTMLBr
import org.github.cao.awa.com.github.cao.awa.capertml.html.h.HTMLH1
import org.github.cao.awa.com.github.cao.awa.capertml.html.h.HTMLH2
import org.github.cao.awa.com.github.cao.awa.capertml.html.h.HTMLH3
import org.github.cao.awa.com.github.cao.awa.capertml.html.h.HTMLH4
import org.github.cao.awa.com.github.cao.awa.capertml.html.h.HTMLH5
import org.github.cao.awa.com.github.cao.awa.capertml.html.h.HTMLH6
import org.github.cao.awa.com.github.cao.awa.capertml.html.img.HTMLImg
import org.github.cao.awa.com.github.cao.awa.capertml.html.p.HTMLP
import org.w3c.dom.html.HTMLImageElement

interface HTMLImageContainer {
    fun addImage(img: HTMLImg)

    fun img(body: HTMLImg.() -> Unit) {
        HTMLImg().also {
            body(it)
            addImage(it)
        }
    }
}