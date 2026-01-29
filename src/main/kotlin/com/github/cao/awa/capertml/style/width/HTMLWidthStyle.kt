package org.github.cao.awa.com.github.cao.awa.capertml.style.width

import org.github.cao.awa.com.github.cao.awa.capertml.style.HTMLStyle
import org.github.cao.awa.com.github.cao.awa.capertml.style.height.HTMLHeightStyle
import org.github.cao.awa.com.github.cao.awa.capertml.style.unit.HTMLStyleNumberUnit

class HTMLWidthStyle(val number: Int, val unit: HTMLStyleNumberUnit) : HTMLStyle() {
    companion object {
        fun of(number: Int, unit: HTMLStyleNumberUnit): HTMLWidthStyle {
            if (number == -1) {
                return DEVICE_WIDTH
            }
            return HTMLWidthStyle(number, unit)
        }

        fun px(px: Int): HTMLHeightStyle {
            return HTMLHeightStyle.Companion.of(px, HTMLStyleNumberUnit.PX)
        }

        fun em(px: Int): HTMLHeightStyle {
            return HTMLHeightStyle.Companion.of(px, HTMLStyleNumberUnit.EM)
        }
    }

    override fun stringify(): String {
        if (this.number < 0) {
            return "device-width"
        }
        return this.number.toString() + this.unit.literal
    }
}

val DEVICE_WIDTH: HTMLWidthStyle = HTMLWidthStyle(-1, HTMLStyleNumberUnit.NONE)
