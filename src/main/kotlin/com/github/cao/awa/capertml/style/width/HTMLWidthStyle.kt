package org.github.cao.awa.com.github.cao.awa.capertml.style.width

import org.github.cao.awa.com.github.cao.awa.capertml.style.HTMLStyle

class HTMLWidthStyle(val px: Int): HTMLStyle() {
    companion object {
        fun of(px: Int): HTMLWidthStyle {
            if (px == -1) {
                return DEVICE_WIDTH
            }
            return HTMLWidthStyle(px)
        }
    }

    override fun stringify(): String {
        if (this.px < 0) {
            return "device-width"
        }
        return this.px.toString()
    }
}

val DEVICE_WIDTH: HTMLWidthStyle = HTMLWidthStyle(-1)
