package org.github.cao.awa.com.github.cao.awa.capertml.html.a.media.value

import org.github.cao.awa.com.github.cao.awa.capertml.html.a.media.HTMLAMediaValueType
import org.github.cao.awa.com.github.cao.awa.capertml.html.a.media.value.orientation.HTMLAMediaOrientations

class HTMLAMediaOrientationValue(type: HTMLAMediaValueType, val orientation: HTMLAMediaOrientations): HTMLAMediaValue(type, orientation.literal) {
    override fun literal(): String {
        val builder = StringBuilder()
        builder.append(this.type.literal)
        builder.append(":")
        builder.append(this.orientation.literal)
        return builder.toString()
    }
}