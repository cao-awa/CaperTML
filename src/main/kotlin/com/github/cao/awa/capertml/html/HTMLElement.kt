package org.github.cao.awa.com.github.cao.awa.capertml.html

abstract class HTMLElement {
    private var hClass: String = ""
    private var id: String = ""

    abstract fun toString(pretty: Boolean, ident: String): String

    fun hClass(name: String) {
        this.hClass = name
    }

    fun id(id: String) {
        this.id = id
    }

    fun getHtmlClass(): String = this.hClass

    fun getId(): String = this.id
}