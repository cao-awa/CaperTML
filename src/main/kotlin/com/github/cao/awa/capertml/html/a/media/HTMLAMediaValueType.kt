package org.github.cao.awa.com.github.cao.awa.capertml.html.a.media

import org.github.cao.awa.com.github.cao.awa.capertml.html.a.media.value.HTMLAMediaDeviceHeightValue
import org.github.cao.awa.com.github.cao.awa.capertml.html.a.media.value.HTMLAMediaDeviceWidthValue
import org.github.cao.awa.com.github.cao.awa.capertml.html.a.media.value.HTMLAMediaHeightValue
import org.github.cao.awa.com.github.cao.awa.capertml.html.a.media.value.HTMLAMediaOrientationValue
import org.github.cao.awa.com.github.cao.awa.capertml.html.a.media.value.HTMLAMediaWidthValue
import org.github.cao.awa.com.github.cao.awa.capertml.html.a.media.value.orientation.HTMLAMediaOrientations

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
}

fun width(value: String, prefix: String = ""): HTMLAMediaWidthValue {
    return HTMLAMediaWidthValue(
        HTMLAMediaValueType.WIDTH,
        value,
        prefix
    )
}

fun deviceWidth(value: String, prefix: String = ""): HTMLAMediaDeviceWidthValue {
    return HTMLAMediaDeviceWidthValue(
        HTMLAMediaValueType.DEVICE_WIDTH,
        value,
        prefix
    )
}

fun height(value: String, prefix: String = ""): HTMLAMediaHeightValue {
    return HTMLAMediaHeightValue(
        HTMLAMediaValueType.HEIGHT,
        value,
        prefix
    )
}

fun deviceHeight(value: String, prefix: String = ""): HTMLAMediaDeviceHeightValue {
    return HTMLAMediaDeviceHeightValue(
        HTMLAMediaValueType.DEVICE_HEIGHT,
        value,
    )
}

fun orientation(value: HTMLAMediaOrientations): HTMLAMediaOrientationValue {
    return HTMLAMediaOrientationValue(
        HTMLAMediaValueType.ORIENTATION,
        value
    )
}