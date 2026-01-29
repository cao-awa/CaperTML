package org.github.cao.awa.com.github.cao.awa.capertml.context

import org.github.cao.awa.com.github.cao.awa.capertml.code.HTMLCode
import org.github.cao.awa.com.github.cao.awa.capertml.html.b.HTMLB
import org.github.cao.awa.com.github.cao.awa.capertml.html.br.HTMLBr
import org.github.cao.awa.com.github.cao.awa.capertml.html.em.HTMLEm
import org.github.cao.awa.com.github.cao.awa.capertml.html.h.HTMLH1
import org.github.cao.awa.com.github.cao.awa.capertml.html.h.HTMLH2
import org.github.cao.awa.com.github.cao.awa.capertml.html.h.HTMLH3
import org.github.cao.awa.com.github.cao.awa.capertml.html.h.HTMLH4
import org.github.cao.awa.com.github.cao.awa.capertml.html.h.HTMLH5
import org.github.cao.awa.com.github.cao.awa.capertml.html.h.HTMLH6
import org.github.cao.awa.com.github.cao.awa.capertml.html.hr.HTMLHr
import org.github.cao.awa.com.github.cao.awa.capertml.html.i.HTMLI
import org.github.cao.awa.com.github.cao.awa.capertml.html.img.HTMLImg
import org.github.cao.awa.com.github.cao.awa.capertml.html.mark.HTMLMark
import org.github.cao.awa.com.github.cao.awa.capertml.html.small.HTMLSmall
import org.github.cao.awa.com.github.cao.awa.capertml.html.span.HTMLSpan
import org.github.cao.awa.com.github.cao.awa.capertml.html.time.HTMLTime
import org.github.cao.awa.com.github.cao.awa.capertml.html.u.HTMLU

interface HTMLPhrasingContext {
    @Deprecated(level = DeprecationLevel.ERROR, message = "Tag 'h1' cannot put into phrasing node")
    fun h1(body: HTMLH1.() -> Unit) {

    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "Tag 'h2' cannot put into phrasing node")
    fun h2(body: HTMLH2.() -> Unit) {

    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "Tag 'h3' cannot put into phrasing node")
    fun h3(body: HTMLH3.() -> Unit) {

    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "Tag 'h4' cannot put into phrasing node")
    fun h4(body: HTMLH4.() -> Unit) {

    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "Tag 'h5' cannot put into phrasing node")
    fun h5(body: HTMLH5.() -> Unit) {

    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "Tag 'h6' cannot put into phrasing node")
    fun h6(body: HTMLH6.() -> Unit) {

    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "Tag 'br' cannot put into phrasing node")
    fun br() {

    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "Tag 'em' cannot put into phrasing node")
    fun em(body: HTMLEm.() -> Unit) {

    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "Tag 'i' cannot put into phrasing node")
    fun i(body: HTMLI.() -> Unit) {

    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "Tag 'b' cannot put into phrasing node")
    fun b(body: HTMLB.() -> Unit) {

    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "Tag 'br' cannot put into phrasing node")
    fun br(body: HTMLBr.() -> Unit) {

    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "Tag 'img' cannot put into phrasing node")
    fun img(body: HTMLImg.() -> Unit) {

    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "Tag 'code' cannot put into phrasing node")
    fun code(code: HTMLCode.() -> Unit) {

    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "Tag 'small' cannot put into phrasing node")
    fun small(small: HTMLSmall.() -> Unit) {

    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "Tag 'u' cannot put into phrasing node")
    fun u(u: HTMLU.() -> Unit) {

    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "Tag 'span' cannot put into phrasing node")
    fun span(span: HTMLSpan.() -> Unit) {

    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "Tag 'hr' cannot put into phrasing node")
    fun hr() {

    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "Tag 'mark' cannot put into phrasing node")
    fun mark(mark: HTMLMark.() -> Unit) {

    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "Tag 'time' cannot put into phrasing node")
    fun time(time: HTMLTime.() -> Unit) {

    }
}