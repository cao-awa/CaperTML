package org.github.cao.awa.com.github.cao.awa.capertml.html.head.meta.content.keyword

class HTMLHeadMetaKeywordsContentBuilder {
    private var keywords: ArrayList<String> = arrayListOf()

    fun keywords(vararg keywords: String) {
        this.keywords.addAll(keywords)
    }

    operator fun String.unaryPlus() {
        this@HTMLHeadMetaKeywordsContentBuilder.keywords.add(this)
    }

    fun build(): HTMLHeadMetaKeywordsContent {
        return HTMLHeadMetaKeywordsContent(this.keywords)
    }
}

fun createKeywords(builder: HTMLHeadMetaKeywordsContentBuilder.() -> Unit): HTMLHeadMetaKeywordsContent {
    return HTMLHeadMetaKeywordsContentBuilder().also {
        builder(it)
    }.build()
}