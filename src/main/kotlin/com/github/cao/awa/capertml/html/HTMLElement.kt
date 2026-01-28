package org.github.cao.awa.com.github.cao.awa.capertml.html

abstract class HTMLElement {
    private var hClass: Array<out String> = arrayOf()
    private var id: String = ""
    private var lang: String = ""
    private var titleAttr: String = ""
    private var customAttr: MutableMap<String, String> = mutableMapOf()

    abstract fun toString(pretty: Boolean, ident: String): String

    fun lang(lang: String) {
        this.lang = lang
    }

    fun classes(vararg name: String) {
        this.hClass = name
    }

    fun id(id: String) {
        this.id = id
    }

    fun title(title: String) {
        this.titleAttr = title
    }

    fun custom(key: String, value: String) {
        this.customAttr[key] = value
    }

    fun getLang(): String = this.lang

    fun getHtmlClass(): Array<out String> = this.hClass

    fun getId(): String = this.id

    fun getTitle(): String = this.titleAttr

    fun getCustomAttr(): MutableMap<String, String> = this.customAttr
}