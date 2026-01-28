package org.github.cao.awa.com.github.cao.awa.capertml.html

abstract class HTMLElement {
    private var hClass: String = ""
    private var id: String = ""
    private var lang: String = "en"

    abstract fun toString(pretty: Boolean, ident: String): String

    fun lang(lang: String) {
        this.lang = lang
    }

    fun hClass(name: String) {
        this.hClass = name
    }

    fun id(id: String) {
        this.id = id
    }

    fun getLang(): String = this.lang

    fun getHtmlClass(): String = this.hClass

    fun getId(): String = this.id
}