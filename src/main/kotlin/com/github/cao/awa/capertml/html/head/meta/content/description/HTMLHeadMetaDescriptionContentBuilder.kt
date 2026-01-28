package org.github.cao.awa.com.github.cao.awa.capertml.html.head.meta.content.description

import org.github.cao.awa.com.github.cao.awa.capertml.html.head.meta.content.keyword.HTMLHeadMetaKeywordsContent

class HTMLHeadMetaDescriptionContentBuilder {
    private var description: String = ""

    fun description(description: String) {
        this.description = description
    }

    operator fun String.unaryPlus() {
        this@HTMLHeadMetaDescriptionContentBuilder.description = this
    }

    fun build(): HTMLHeadMetaDescriptionContent {
        return HTMLHeadMetaDescriptionContent(this.description)
    }
}

fun createDescription(builder: HTMLHeadMetaDescriptionContentBuilder.() -> Unit): HTMLHeadMetaDescriptionContent {
    return HTMLHeadMetaDescriptionContentBuilder().also {
        builder(it)
    }.build()
}