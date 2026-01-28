package org.github.cao.awa.com.github.cao.awa.capertml.html.head.meta.content.color

import org.github.cao.awa.com.github.cao.awa.capertml.html.head.meta.content.HTMLHeadMetaContentValue
import org.github.cao.awa.com.github.cao.awa.capertml.style.color.HTMLColorSchemeType

class HTMLHeadMetaColorSchemeColorContent(val color: HTMLColorSchemeType): HTMLHeadMetaContentValue() {
    companion object {
        fun of(color: HTMLColorSchemeType): HTMLHeadMetaColorSchemeColorContent {
            return HTMLHeadMetaColorSchemeColorContent(color)
        }
    }

    override fun stringify(): String = this.color.literal
}