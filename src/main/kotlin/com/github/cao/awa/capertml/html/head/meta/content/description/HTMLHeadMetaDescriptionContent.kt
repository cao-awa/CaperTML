package org.github.cao.awa.com.github.cao.awa.capertml.html.head.meta.content.description

import org.github.cao.awa.com.github.cao.awa.capertml.html.head.meta.content.HTMLHeadMetaContentValue

class HTMLHeadMetaDescriptionContent(val description: String): HTMLHeadMetaContentValue() {
    companion object {
        fun of(description: String): HTMLHeadMetaDescriptionContent {
            return HTMLHeadMetaDescriptionContent(description)
        }
    }

    override fun stringify(): String = this.description
}