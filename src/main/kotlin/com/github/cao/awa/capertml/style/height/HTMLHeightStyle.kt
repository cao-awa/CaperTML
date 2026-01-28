package org.github.cao.awa.com.github.cao.awa.capertml.style.height

import org.github.cao.awa.com.github.cao.awa.capertml.style.HTMLStyle

class HTMLHeightStyle(val px: Int): HTMLStyle() {
    companion object {
        fun of(px: Int): HTMLHeightStyle {
            if (px == -1) {
                return DEVICE_HEIGHT
            }
            return HTMLHeightStyle(px)
        }
    }

    override fun stringify(): String {
        if (this.px < 0) {
            return "device-height"
        }
        return this.px.toString()
    }
}

val DEVICE_HEIGHT: HTMLHeightStyle = HTMLHeightStyle(-1)
