package org.github.cao.awa.com.github.cao.awa.capertml.html.head.meta.content.theme

import org.github.cao.awa.com.github.cao.awa.capertml.html.head.meta.content.HTMLHeadMetaContentValue
import org.github.cao.awa.com.github.cao.awa.capertml.html.head.meta.content.THEME_COLOR

class HTMLHeadMetaThemeColorContent(val color: String) : HTMLHeadMetaContentValue<HTMLHeadMetaThemeColorContent>(
    THEME_COLOR
) {
    companion object {
        fun of(color: String): HTMLHeadMetaThemeColorContent {
            return HTMLHeadMetaThemeColorContent(color)
        }
    }

    override fun stringify(): String = this.color
}