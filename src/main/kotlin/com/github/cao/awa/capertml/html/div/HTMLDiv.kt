package org.github.cao.awa.com.github.cao.awa.capertml.html.div

import org.github.cao.awa.com.github.cao.awa.capertml.html.HTMLElement
import org.github.cao.awa.com.github.cao.awa.capertml.html.a.HTMLA
import java.util.LinkedList

class HTMLDiv: HTMLElement() {
    private val elements: LinkedList<HTMLElement> = LinkedList()
    private var title: String = ""
    private var hidden: Boolean = false
    private var role: String = ""
    private var ariaLabel: String = ""
    private var ariaHidden: Boolean = false
    private var ariaExpanded: Boolean = false
    private var contentEditable: Boolean = false
    private var draggable: Boolean = false
    private var tabindex: Int = 0
    private var spellcheck: Boolean = false

    fun title(title: String) {
        this.title = title
    }

    fun hidden() {
        this.hidden = true
    }

    fun role(role: String) {
        this.role = role
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

    fun a(body: HTMLA.() -> Unit) {
        HTMLA().also {
            body(it)
            this.elements.add(it)
        }
    }

    fun a(href: String, body: HTMLA.() -> Unit): HTMLA {
        return HTMLA().also {
            it.href(href)
            body(it)
            this.elements.add(it)
        }
    }

    override fun toString(pretty: Boolean, ident: String): String {
        val builder = StringBuilder()
        if (pretty) {
            builder.append(ident)
        }
        if (this.elements.isEmpty()) {
            builder.append("<div></div>")
        } else {
            builder.append("<div")
            if (this.title.isNotEmpty()) {
                builder.append(" title=\"${this.title}\"")
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
                builder.append(" contenteditable=\"${this.contentEditable}\"")
            }
            if (this.draggable) {
                builder.append(" draggable=\"${this.draggable}\"")
            }
            if (this.tabindex > 0) {
                builder.append(" tabindex=\"${this.tabindex}\"")
            }
            if (this.spellcheck) {
                builder.append(" spellcheck=\"${this.spellcheck}\"")
            }
            if (this.hidden) {
                builder.append(" hidden")
            }
            builder.append(">\n")
            this.elements.forEach { element ->
                builder.append(element.toString(pretty, "$ident    "))
            }
            if (pretty) {
                builder.append(ident)
            }
            builder.append("</div>")
        }
        if (pretty) {
            builder.append("\n")
        }
        return builder.toString()
    }
}