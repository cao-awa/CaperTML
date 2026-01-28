package org.github.cao.awa.com.github.cao.awa.capertml.html.head.meta.content.keyword

import org.github.cao.awa.com.github.cao.awa.capertml.html.head.meta.content.HTMLHeadMetaContentValue

class HTMLHeadMetaKeywordsContent(val keywords: Array<out String>): HTMLHeadMetaContentValue() {
    companion object {
        fun of(vararg keywords: String): HTMLHeadMetaKeywordsContent {
            return HTMLHeadMetaKeywordsContent(keywords)
        }
    }

    override fun stringify(): String {
        val builder = StringBuilder()
        for (keyword in this.keywords) {
            builder.append(keyword)
            builder.append(" ")
        }
        builder.delete(builder.length - 1, builder.length)
        return builder.toString()
    }
}