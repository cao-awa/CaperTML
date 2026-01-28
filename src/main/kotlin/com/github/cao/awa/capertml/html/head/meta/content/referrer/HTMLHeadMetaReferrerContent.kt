package org.github.cao.awa.com.github.cao.awa.capertml.html.head.meta.content.referrer

import org.github.cao.awa.com.github.cao.awa.capertml.html.head.meta.content.HTMLHeadMetaContentValue
import org.github.cao.awa.com.github.cao.awa.capertml.html.head.meta.content.REFERRER
import org.github.cao.awa.com.github.cao.awa.capertml.referrer.HTMLReferrerType

class HTMLHeadMetaReferrerContent(val referrerType: HTMLReferrerType) :
    HTMLHeadMetaContentValue<HTMLHeadMetaReferrerContent>(
        REFERRER
    ) {
    companion object {
        fun of(referrerType: HTMLReferrerType): HTMLHeadMetaReferrerContent {
            return HTMLHeadMetaReferrerContent(referrerType)
        }
    }

    override fun stringify(): String = this.referrerType.literal
}