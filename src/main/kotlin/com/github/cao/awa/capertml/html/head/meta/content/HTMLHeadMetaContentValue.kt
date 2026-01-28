package org.github.cao.awa.com.github.cao.awa.capertml.html.head.meta.content

abstract class HTMLHeadMetaContentValue<T: HTMLHeadMetaContentValue<T>>(val type: HTMLHeadMetaContentType<T>) {
    abstract fun stringify(): String
}