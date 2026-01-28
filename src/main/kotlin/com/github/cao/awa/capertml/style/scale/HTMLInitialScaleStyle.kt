package org.github.cao.awa.com.github.cao.awa.capertml.style.scale

import org.github.cao.awa.com.github.cao.awa.capertml.style.HTMLStyle

class HTMLInitialScaleStyle(val scale: Float): HTMLStyle() {
    companion object {
        fun of(scale: Float): HTMLInitialScaleStyle {
            return HTMLInitialScaleStyle(scale)
        }
    }

    init {
        require(this.scale > 0.1)
    }

    override fun stringify(): String {
        return this.scale.toString()
    }
}

val INITIAL_SCALE: HTMLInitialScaleStyle = HTMLInitialScaleStyle(1.0F)
