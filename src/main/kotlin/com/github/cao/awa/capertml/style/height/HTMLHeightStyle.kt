package org.github.cao.awa.com.github.cao.awa.capertml.style.height

import org.github.cao.awa.com.github.cao.awa.capertml.style.HTMLStyle
import org.github.cao.awa.com.github.cao.awa.capertml.style.unit.HTMLStyleNumberUnit

class HTMLHeightStyle(val number: Int, val unit: HTMLStyleNumberUnit): HTMLStyle() {
    companion object {
        fun of(number: Int, unit: HTMLStyleNumberUnit): HTMLHeightStyle {
            if (number == -1) {
                return DEVICE_HEIGHT
            }
            return HTMLHeightStyle(number, unit)
        }

        fun px(px: Int): HTMLHeightStyle {
            return of(px, HTMLStyleNumberUnit.PX)
        }

        fun em(px: Int): HTMLHeightStyle {
            return of(px, HTMLStyleNumberUnit.EM)
        }
    }

    override fun stringify(): String {
        if (this.number < 0) {
            return "device-height"
        }
        return this.number.toString() + this.unit.literal
    }
}

val DEVICE_HEIGHT: HTMLHeightStyle = HTMLHeightStyle(-1, HTMLStyleNumberUnit.NONE)
