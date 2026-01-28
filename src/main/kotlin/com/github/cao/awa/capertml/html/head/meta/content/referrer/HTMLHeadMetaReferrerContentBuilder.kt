package org.github.cao.awa.com.github.cao.awa.capertml.html.head.meta.content.referrer

import org.github.cao.awa.com.github.cao.awa.capertml.referrer.HTMLReferrerType

class HTMLHeadMetaReferrerContentBuilder {
    private var referrerType: HTMLReferrerType = HTMLReferrerType.NO_REFERRER_WHEN_DOWNGRADE

    fun referrer(referrerType: HTMLReferrerType) {
        this.referrerType = referrerType
    }

    fun build(): HTMLHeadMetaReferrerContent {
        return HTMLHeadMetaReferrerContent(this.referrerType)
    }
}

fun createReferrer(builder: HTMLHeadMetaReferrerContentBuilder.() -> Unit): HTMLHeadMetaReferrerContent {
    return HTMLHeadMetaReferrerContentBuilder().also {
        builder(it)
    }.build()
}