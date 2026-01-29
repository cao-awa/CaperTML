package org.github.cao.awa.com.github.cao.awa.capertml.html.a.media

import org.github.cao.awa.com.github.cao.awa.capertml.html.a.media.value.HTMLAMediaDeviceHeightValue
import org.github.cao.awa.com.github.cao.awa.capertml.html.a.media.value.HTMLAMediaDeviceWidthValue
import org.github.cao.awa.com.github.cao.awa.capertml.html.a.media.value.HTMLAMediaHeightValue
import org.github.cao.awa.com.github.cao.awa.capertml.html.a.media.value.HTMLAMediaOrientationValue
import org.github.cao.awa.com.github.cao.awa.capertml.html.a.media.value.HTMLAMediaWidthValue
import org.github.cao.awa.com.github.cao.awa.capertml.html.a.media.value.orientation.HTMLAMediaOrientations
import org.github.cao.awa.com.github.cao.awa.capertml.style.height.HTMLHeightStyle
import org.github.cao.awa.com.github.cao.awa.capertml.style.width.HTMLWidthStyle

enum class HTMLAMediaValueType(val literal: String) {
    WIDTH("width"),
    HEIGHT("height"),
    DEVICE_WIDTH("device-width"),
    DEVICE_HEIGHT("device-height"),
    ORIENTATION("orientation"),
    ASPECT_RATIO("aspect-radio"),
    DEVICE_ASPECT_RATIO("device-aspect-ratio"),
    COLOR("color"),
    COLOR_INDEX("color-index"),
    MONOCHROME("monochrome"),
    RESOLUTION("resolution"),
    SCAN("scan"),
    GRID("gird");

    override fun toString(): String {
        return this.literal
    }
}

fun width(value: Int, prefix: String = ""): HTMLAMediaWidthValue {
    return HTMLAMediaWidthValue(
        HTMLAMediaValueType.WIDTH,
        HTMLWidthStyle.px(value),
        prefix
    )
}

fun deviceWidth(value: Int, prefix: String = ""): HTMLAMediaDeviceWidthValue {
    return HTMLAMediaDeviceWidthValue(
        HTMLAMediaValueType.DEVICE_WIDTH,
        HTMLWidthStyle.px(value),
        prefix
    )
}

fun height(value: Int, prefix: String = ""): HTMLAMediaHeightValue {
    return HTMLAMediaHeightValue(
        HTMLAMediaValueType.HEIGHT,
        HTMLHeightStyle.px(value),
        prefix
    )
}

fun deviceHeight(value: Int, prefix: String = ""): HTMLAMediaDeviceHeightValue {
    return HTMLAMediaDeviceHeightValue(
        HTMLAMediaValueType.DEVICE_HEIGHT,
        HTMLHeightStyle.px(value),
    )
}

fun orientation(value: HTMLAMediaOrientations): HTMLAMediaOrientationValue {
    return HTMLAMediaOrientationValue(
        HTMLAMediaValueType.ORIENTATION,
        value
    )
}