package org.github.cao.awa.com.github.cao.awa.capertml.html.head.meta.equiv.style

@Deprecated(level = DeprecationLevel.WARNING, message = "Not recommented to use")
class HTMLHeadMetaDefaultStyleEquivValueBuilder {
    private var defaultStyle: String = ""

    fun defaultStyle(style: String) {
        this.defaultStyle = style
    }

    fun build(): HTMLHeadMetaDefaultStyleEquivValue {
        return HTMLHeadMetaDefaultStyleEquivValue(this.defaultStyle)
    }
}

fun createDefaultStyle(builder: HTMLHeadMetaDefaultStyleEquivValueBuilder.() -> Unit): HTMLHeadMetaDefaultStyleEquivValue {
    return HTMLHeadMetaDefaultStyleEquivValueBuilder().also {
        builder(it)
    }.build()
}