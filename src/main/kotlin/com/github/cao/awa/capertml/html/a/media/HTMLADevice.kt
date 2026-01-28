package org.github.cao.awa.com.github.cao.awa.capertml.html.a.media

import org.github.cao.awa.com.github.cao.awa.capertml.html.a.media.value.HTMLAMediaValue

enum class HTMLADevice(val literal: String) {
    ALL("all"),
    AURAL("aural"),
    BRAILLE("braille"),
    HANDHELD("handheld"),
    PROJECTION("projection"),
    PRINT("print"),
    SCREEN("screen"),
    TTY("tty"),
    TV("tv");

    infix fun and(type: HTMLAMediaValue): HTMLAMedia {
        return HTMLAMedia(
            this,
            HTMLAMediaOperator.AND,
            type
        )
    }

    infix fun or(type: HTMLAMediaValue): HTMLAMedia {
        return HTMLAMedia(
            this,
            HTMLAMediaOperator.OR,
            type
        )
    }

    infix fun not(type: HTMLAMediaValue): HTMLAMedia {
        return HTMLAMedia(
            this,
            HTMLAMediaOperator.NOT,
            type
        )
    }
}

val all: HTMLADevice = HTMLADevice.ALL

val aural: HTMLADevice = HTMLADevice.AURAL

val braille: HTMLADevice = HTMLADevice.BRAILLE

val handheld: HTMLADevice = HTMLADevice.HANDHELD

val projection: HTMLADevice = HTMLADevice.PROJECTION

val print: HTMLADevice = HTMLADevice.PRINT

val screen: HTMLADevice = HTMLADevice.SCREEN

val tty: HTMLADevice = HTMLADevice.TTY

val tv: HTMLADevice = HTMLADevice.TV

