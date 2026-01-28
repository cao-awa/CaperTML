package org.github.cao.awa.com.github.cao.awa.capertml.html.head.meta.content.author

import org.github.cao.awa.com.github.cao.awa.capertml.html.head.meta.content.AUTHOR
import org.github.cao.awa.com.github.cao.awa.capertml.html.head.meta.content.HTMLHeadMetaContentValue

class HTMLHeadMetaAuthorContent(val author: String) : HTMLHeadMetaContentValue<HTMLHeadMetaAuthorContent>(AUTHOR) {
    companion object {
        fun of(author: String): HTMLHeadMetaAuthorContent {
            return HTMLHeadMetaAuthorContent(author)
        }
    }

    override fun stringify(): String = this.author
}