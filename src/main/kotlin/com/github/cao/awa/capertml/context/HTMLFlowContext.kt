package org.github.cao.awa.com.github.cao.awa.capertml.context

import org.github.cao.awa.com.github.cao.awa.capertml.code.HTMLCode
import org.github.cao.awa.com.github.cao.awa.capertml.html.HTMLElement
import org.github.cao.awa.com.github.cao.awa.capertml.html.hr.HTMLHr
import org.github.cao.awa.com.github.cao.awa.capertml.html.mark.HTMLMark
import org.github.cao.awa.com.github.cao.awa.capertml.html.small.HTMLSmall
import org.github.cao.awa.com.github.cao.awa.capertml.html.span.HTMLSpan
import org.github.cao.awa.com.github.cao.awa.capertml.html.time.HTMLTime
import org.github.cao.awa.com.github.cao.awa.capertml.html.u.HTMLU

interface HTMLFlowContext {
    fun code(code: HTMLCode.() -> Unit) {
        HTMLCode().also {
            code(it)
            addElement(it)
        }
    }

    fun small(small: HTMLSmall.() -> Unit) {
        HTMLSmall().also {
            small(it)
            addElement(it)
        }
    }

    fun u(u: HTMLU.() -> Unit) {
        HTMLU().also {
            u(it)
            addElement(it)
        }
    }

    fun span(span: HTMLSpan.() -> Unit) {
        HTMLSpan().also {
            span(it)
            addElement(it)
        }
    }

    fun hr() {
        HTMLHr().also {
            addElement(it)
        }
    }

    fun mark(mark: HTMLMark.() -> Unit) {
        HTMLMark().also {
            mark(it)
            addElement(it)
        }
    }

    fun time(time: HTMLTime.() -> Unit) {
        HTMLTime().also {
            time(it)
            addElement(it)
        }
    }

    fun addElement(element: HTMLElement)
}