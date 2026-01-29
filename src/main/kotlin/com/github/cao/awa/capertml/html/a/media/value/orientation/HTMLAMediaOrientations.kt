package org.github.cao.awa.com.github.cao.awa.capertml.html.a.media.value.orientation

import org.github.cao.awa.com.github.cao.awa.capertml.html.a.media.orientation
import org.github.cao.awa.com.github.cao.awa.capertml.html.a.media.value.HTMLAMediaValue

enum class HTMLAMediaOrientations(val literal: String) {
    PORTRAIT("portrait"),
    LANDSCAPE("landscape"), ;

    override fun toString(): String {
        return this.literal
    }
}

val PORTRAIT: HTMLAMediaValue<HTMLAMediaOrientations> = orientation(HTMLAMediaOrientations.PORTRAIT)

val LANDSCAPE: HTMLAMediaValue<HTMLAMediaOrientations> = orientation(HTMLAMediaOrientations.LANDSCAPE)
