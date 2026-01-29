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

    infix fun and(type: HTMLAMediaValue<*>): HTMLAMedia {
        return HTMLAMedia(
            this,
            HTMLAMediaOperator.AND,
            type
        )
    }

    infix fun or(type: HTMLAMediaValue<*>): HTMLAMedia {
        return HTMLAMedia(
            this,
            HTMLAMediaOperator.OR,
            type
        )
    }

    infix fun not(type: HTMLAMediaValue<*>): HTMLAMedia {
        return HTMLAMedia(
            this,
            HTMLAMediaOperator.NOT,
            type
        )
    }
}

val ALL: HTMLADevice = HTMLADevice.ALL

val AURAL: HTMLADevice = HTMLADevice.AURAL

val BRAILLE: HTMLADevice = HTMLADevice.BRAILLE

val HANDHELD: HTMLADevice = HTMLADevice.HANDHELD

val PROJECTION: HTMLADevice = HTMLADevice.PROJECTION

val PRINT: HTMLADevice = HTMLADevice.PRINT

val SCREEN: HTMLADevice = HTMLADevice.SCREEN

val TTY: HTMLADevice = HTMLADevice.TTY

val TV: HTMLADevice = HTMLADevice.TV

