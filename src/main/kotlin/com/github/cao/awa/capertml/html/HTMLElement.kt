package org.github.cao.awa.com.github.cao.awa.capertml.html

import org.github.cao.awa.com.github.cao.awa.capertml.html.capitalize.HTMLAutoCapitalizeType
import org.github.cao.awa.com.github.cao.awa.capertml.html.direction.HTMLDirection

abstract class HTMLElement {
    private var classes: Array<out String> = arrayOf()
    private var author: String = ""
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
    private var contextMenu: String = ""
    private var accessKey: String = ""
    private var autoCapitalize: HTMLAutoCapitalizeType? = null

    abstract fun toString(pretty: Boolean, ident: String): String

    fun lang(lang: String) {
        this.lang = lang
    }

    fun classes(vararg name: String) {
        this.classes = name
    }

    fun author(author: String) {
        this.author = author
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

    fun contextMenu(name: String) {
        this.contextMenu = name
    }

    fun accessKey(key: String) {
        this.accessKey = key
    }

    fun autoCapitalize(type: HTMLAutoCapitalizeType) {
        this.autoCapitalize = type
    }

    fun getLang(): String = this.lang

    fun getHtmlClass(): Array<out String> = this.classes

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

    fun getContextMenu(): String = this.contextMenu

    fun appendGlobal(builder: StringBuilder) {
        if (this.lang.isNotEmpty()) {
            builder.append(" lang=\"${this.lang}\"")
        }
        if (this.classes.isNotEmpty()) {
            builder.append(" class=\"")
            for (clazz in this.classes) {
                builder.append(clazz)
                builder.append(" ")
            }
            builder.delete(builder.length - 1, builder.length)
            builder.append("\"")
        }
        if (this.author.isNotEmpty()) {
            builder.append(" author=\"${this.author}\"")
        }
        if (this.titleAttr.isNotEmpty()) {
            builder.append(" title=\"${this.titleAttr}\"")
        }
        if (this.ariaLabel.isNotEmpty()) {
            builder.append(" aria-label=\"${this.ariaLabel}\"")
        }
        if (this.ariaHidden) {
            builder.append(" aria-hidden=\"true\"")
        }
        if (this.ariaExpanded) {
            builder.append(" aria-expanded=\"true\"")
        }
        if (this.contentEditable) {
            builder.append(" contenteditable=\"true\"")
        }
        if (this.draggable) {
            builder.append(" draggable=\"true\"")
        }
        if (this.tabindex > 0) {
            builder.append(" tabindex=\"${this.tabindex}\"")
        }
        if (this.spellcheck) {
            builder.append(" spellcheck=\"true\"")
        }
        if (this.translate) {
            builder.append(" translate=\"true\"")
        }
        if (this.dir != HTMLDirection.AUTO) {
            builder.append(" dir=\"${this.dir.literal}\"")
        }
        if (this.role.isNotEmpty()) {
            builder.append(" role=\"${this.role}\"")
        }
        if (this.contextMenu.isNotEmpty()) {
            builder.append(" contextmenu=\"${this.contextMenu}\"")
        }
        if (this.accessKey.isNotEmpty()) {
            builder.append(" accesskey=\"${this.accessKey}\"")
        }
        if (this.autoCapitalize != null) {
            builder.append(" autapitalize=\"${this.autoCapitalize}\"")
        }
        if (isHidden()) {
            builder.append(" hidden")
        }
    }
}