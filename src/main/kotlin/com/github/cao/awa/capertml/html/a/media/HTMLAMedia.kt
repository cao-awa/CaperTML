package org.github.cao.awa.com.github.cao.awa.capertml.html.a.media

import org.github.cao.awa.com.github.cao.awa.capertml.html.HTMLElement
import org.github.cao.awa.com.github.cao.awa.capertml.html.a.media.value.HTMLAMediaValue

class HTMLAMedia(
    val device: HTMLADevice,
    val operator: HTMLAMediaOperator,
    val value: HTMLAMediaValue
) {
    override fun toString(): String {
        val builder = StringBuilder()
        builder.append(this.device.literal)
        builder.append(" ")
        builder.append(this.operator.literal)
        builder.append(" (")
        builder.append(this.value.literal())
        builder.append(")")
        return builder.toString()
    }
}