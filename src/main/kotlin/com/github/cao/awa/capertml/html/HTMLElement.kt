package org.github.cao.awa.com.github.cao.awa.capertml.html

abstract class HTMLElement {
    private var htmlClass = ""

    abstract fun toString(pretty: Boolean, ident: String): String

    fun htmlClass(name: String) {
        this.htmlClass = name
    }

    fun getHtmlClass(): String = this.htmlClass
}