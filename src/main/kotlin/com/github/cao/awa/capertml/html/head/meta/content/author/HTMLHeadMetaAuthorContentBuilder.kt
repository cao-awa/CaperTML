package org.github.cao.awa.com.github.cao.awa.capertml.html.head.meta.content.author

class HTMLHeadMetaAuthorContentBuilder {
    private var author: String = ""

    fun author(author: String) {
        this.author = author
    }

    operator fun String.unaryPlus() {
        this@HTMLHeadMetaAuthorContentBuilder.author = this
    }

    fun build(): HTMLHeadMetaAuthorContent {
        return HTMLHeadMetaAuthorContent(this.author)
    }
}

fun createAuthor(builder: HTMLHeadMetaAuthorContentBuilder.() -> Unit): HTMLHeadMetaAuthorContent {
    return HTMLHeadMetaAuthorContentBuilder().also {
        builder(it)
    }.build()
}