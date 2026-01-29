package org.github.cao.awa.com.github.cao.awa.capertml.html.head.meta.equiv.type

@Deprecated(level = DeprecationLevel.WARNING, message = "Not recommented to use")
class HTMLHeadMetaContentTypeEquivValueBuilder {
    private var contentType: String = ""

    fun contentType(type: String) {
        this.contentType = type
    }

    fun build(): HTMLHeadMetaContentTypeEquivValue {
        return HTMLHeadMetaContentTypeEquivValue(this.contentType)
    }
}

fun createContentType(builder: HTMLHeadMetaContentTypeEquivValueBuilder.() -> Unit): HTMLHeadMetaContentTypeEquivValue {
    return HTMLHeadMetaContentTypeEquivValueBuilder().also {
        builder(it)
    }.build()
}