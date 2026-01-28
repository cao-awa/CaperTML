package org.github.cao.awa.com.github.cao.awa.capertml.html.head.meta.content.theme

import org.github.cao.awa.com.github.cao.awa.capertml.html.head.meta.content.HTMLHeadMetaContentValue

class HTMLHeadMetaThemeColorContent(val color: String): HTMLHeadMetaContentValue() {
    companion object {
        fun of(color: String): HTMLHeadMetaThemeColorContent {
            return HTMLHeadMetaThemeColorContent(color)
        }
    }

    override fun stringify(): String = this.color
}