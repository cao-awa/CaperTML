package org.github.cao.awa.com.github.cao.awa.capertml.html.head.meta

import org.github.cao.awa.com.github.cao.awa.capertml.html.HTMLElement

abstract class HTMLHeadMeta<T: HTMLHeadMeta<T>>(val metaType: HTMLHeadMetaType): HTMLElement() {
    abstract fun valueLiteral(): String
}