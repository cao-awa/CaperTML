package org.github.cao.awa.com.github.cao.awa.capertml.html.head.meta.content.color

import org.github.cao.awa.com.github.cao.awa.capertml.style.color.HTMLColorSchemeType

class HTMLHeadMetaColorSchemeContentBuilder {
    private var schema: HTMLColorSchemeType = HTMLColorSchemeType.LIGHT

    fun schema(schema: HTMLColorSchemeType) {
        this.schema = schema
    }

    fun build(): HTMLHeadMetaColorSchemeColorContent {
        return HTMLHeadMetaColorSchemeColorContent(this.schema)
    }
}

fun createColorScheme(builder: HTMLHeadMetaColorSchemeContentBuilder.() -> Unit): HTMLHeadMetaColorSchemeColorContent {
    return HTMLHeadMetaColorSchemeContentBuilder().also {
        builder(it)
    }.build()
}