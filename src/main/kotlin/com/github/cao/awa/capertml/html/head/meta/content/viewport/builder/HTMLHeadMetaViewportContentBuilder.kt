package org.github.cao.awa.com.github.cao.awa.capertml.html.head.meta.content.viewport.builder

import org.github.cao.awa.com.github.cao.awa.capertml.html.head.meta.content.viewport.HTMLHeadMetaViewportContent
import org.github.cao.awa.com.github.cao.awa.capertml.style.HTMLStyle
import org.github.cao.awa.com.github.cao.awa.capertml.style.HTMLStyleType
import org.github.cao.awa.com.github.cao.awa.capertml.style.height.HTMLHeightStyle
import org.github.cao.awa.com.github.cao.awa.capertml.style.scale.HTMLInitialScaleStyle
import org.github.cao.awa.com.github.cao.awa.capertml.style.width.HTMLWidthStyle

class HTMLHeadMetaViewportContentBuilder {
    private val styles:  MutableMap<HTMLStyleType, HTMLStyle> = mutableMapOf()

    fun width(px: Int) {
        width(HTMLWidthStyle.of(px))
    }

    fun width(width: HTMLWidthStyle) {
        this.styles[HTMLStyleType.WIDTH] = width
    }

    fun height(px: Int) {
        height(HTMLHeightStyle.of(px))
    }

    fun height(height: HTMLHeightStyle) {
        this.styles[HTMLStyleType.HEIGHT] = height
    }

    fun initialScale(scale: Double) {
        initialScale(scale.toFloat())
    }

    fun initialScale(scale: Float) {
        initialScale(HTMLInitialScaleStyle.of(scale))
    }

    fun initialScale(scale: HTMLInitialScaleStyle) {
        this.styles[HTMLStyleType.INITIAL_SCALE] = scale
    }

    fun build(): HTMLHeadMetaViewportContent {
        return HTMLHeadMetaViewportContent(this.styles)
    }
}

fun createViewport(builder: HTMLHeadMetaViewportContentBuilder.() -> Unit): HTMLHeadMetaViewportContent {
    return HTMLHeadMetaViewportContentBuilder().also {
        builder(it)
    }.build()
}