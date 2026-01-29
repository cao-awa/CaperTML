package org.github.cao.awa.com.github.cao.awa.capertml.html.head.meta.equiv.refresh

import org.github.cao.awa.com.github.cao.awa.capertml.html.head.meta.equiv.CONTENT_SECURITY_POLICY
import org.github.cao.awa.com.github.cao.awa.capertml.html.head.meta.equiv.HTMLHTTPEquivValue
import org.github.cao.awa.com.github.cao.awa.capertml.html.head.meta.equiv.REFRESH

class HTMLHeadMetaRefreshEquivValue(val waitTime: Int = 0, val jumpUrl: String = "") :
    HTMLHTTPEquivValue<HTMLHeadMetaRefreshEquivValue>(
        REFRESH
    ) {
    override fun stringify(): String {
        val builder = StringBuilder()
        builder.append(this.waitTime.toString())
        if (this.jumpUrl.isNotEmpty()) {
            builder.append(";")
            builder.append(this.jumpUrl)
        }
        return builder.toString()
    }
}