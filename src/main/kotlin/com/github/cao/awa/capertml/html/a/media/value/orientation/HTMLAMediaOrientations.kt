package org.github.cao.awa.com.github.cao.awa.capertml.html.a.media.value.orientation

import org.github.cao.awa.com.github.cao.awa.capertml.html.a.media.orientation
import org.github.cao.awa.com.github.cao.awa.capertml.html.a.media.value.HTMLAMediaValue

enum class HTMLAMediaOrientations(val literal: String) {
    PORTRAIT("portrait"),
    LANDSCAPE("landscape"),
}

val portrait: HTMLAMediaValue = orientation(HTMLAMediaOrientations.PORTRAIT)

val landscape: HTMLAMediaValue = orientation(HTMLAMediaOrientations.LANDSCAPE)
