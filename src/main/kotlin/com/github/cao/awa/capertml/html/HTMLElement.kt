package org.github.cao.awa.com.github.cao.awa.capertml.html

import org.github.cao.awa.com.github.cao.awa.capertml.html.direction.HTMLDirection

abstract class HTMLElement {
    private var hClass: Array<out String> = arrayOf()
    private var id: String = ""
    private var lang: String = ""
    private var dir: HTMLDirection = HTMLDirection.AUTO
    private var titleAttr: String = ""
    private var customAttr: MutableMap<String, String> = mutableMapOf()
    private var contentEditable: Boolean = false
    private var draggable: Boolean = false
    private var tabindex: Int = 0
    private var spellcheck: Boolean = false
    private var hidden: Boolean = false
    private var translate: Boolean = false
    private var ariaLabel: String = ""
    private var ariaHidden: Boolean = false
    private var ariaExpanded: Boolean = false
    private var role: String = ""

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

    open fun title(title: String) {
        this.titleAttr = title
    }

    fun custom(key: String, value: String) {
        this.customAttr["data-$key"] = value
    }

    fun contentEditable(editable: Boolean) {
        this.contentEditable = editable
    }

    fun draggable() {
        this.draggable = true
    }

    fun tabindex(tabindex: Int) {
        this.tabindex = tabindex
    }

    fun spellcheck() {
        this.spellcheck = true
    }

    fun hidden() {
        this.hidden = true
    }

    fun dir(dir: HTMLDirection) {
        this.dir = dir
    }

    fun translate() {
        this.translate = true
    }

    fun ariaLabel(label: String) {
        this.ariaLabel = label
    }

    fun ariaHidden(hidden: Boolean) {
        this.ariaHidden = hidden
    }

    fun ariaExpanded(expanded: Boolean) {
        this.ariaExpanded = expanded
    }

    fun role(role: String) {
        this.role = role
    }

    fun getLang(): String = this.lang

    fun getHtmlClass(): Array<out String> = this.hClass

    fun getId(): String = this.id

    fun getTitle(): String = this.titleAttr

    fun getCustomAttr(): MutableMap<String, String> = this.customAttr

    fun isDraggable(): Boolean = this.draggable

    fun getTabindex(): Int = this.tabindex

    fun isSpellcheck(): Boolean = this.spellcheck

    fun isContentEditable(): Boolean = this.contentEditable

    fun isHidden(): Boolean = this.hidden

    fun getDir(): HTMLDirection = this.dir

    fun canTranslate(): Boolean = this.translate

    fun getArialLabel(): String = this.ariaLabel

    fun isArialHidden(): Boolean = this.ariaHidden

    fun isArialExpanded(): Boolean = this.ariaExpanded

    fun getRole(): String = this.role

    fun appendGlobal(builder: StringBuilder) {
        if (getLang().isNotEmpty()) {
            builder.append(" lang=\"${getLang()}\"")
        }
        if (getTitle().isNotEmpty()) {
            builder.append(" title=\"${getTitle()}\"")
        }
        if (getArialLabel().isNotEmpty()) {
            builder.append(" aria-label=\"${this.getArialLabel()}\"")
        }
        if (isArialHidden()) {
            builder.append(" aria-hidden=\"true\"")
        }
        if (isArialExpanded()) {
            builder.append(" aria-expanded=\"true\"")
        }
        if (isContentEditable()) {
            builder.append(" contenteditable=\"true\"")
        }
        if (isDraggable()) {
            builder.append(" draggable=\"true\"")
        }
        if (getTabindex() > 0) {
            builder.append(" tabindex=\"${getTabindex()}\"")
        }
        if (isSpellcheck()) {
            builder.append(" spellcheck=\"true\"")
        }
        if (canTranslate()) {
            builder.append(" translate=\"true\"")
        }
        if (getDir() != HTMLDirection.AUTO) {
            builder.append(" dir=\"${getDir().literal}\"")
        }
        if (isHidden()) {
            builder.append(" hidden")
        }
    }
}