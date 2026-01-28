package org.github.cao.awa.com.github.cao.awa.capertml.html.head.meta.content.theme

class HTMLHeadMetaThemeColorContentBuilder {
    private var color: String = "#FFFFFF"

    fun color(color: String) {
        this.color = color
    }

    fun build(): HTMLHeadMetaThemeColorContent {
        return HTMLHeadMetaThemeColorContent(this.color)
    }
}

fun createThemeColor(builder: HTMLHeadMetaThemeColorContentBuilder.() -> Unit): HTMLHeadMetaThemeColorContent {
    return HTMLHeadMetaThemeColorContentBuilder().also {
        builder(it)
    }.build()
}