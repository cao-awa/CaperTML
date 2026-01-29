package org.github.cao.awa.com.github.cao.awa.capertml.html.head.meta.equiv.style

import org.github.cao.awa.com.github.cao.awa.capertml.html.head.meta.equiv.CONTENT_SECURITY_POLICY
import org.github.cao.awa.com.github.cao.awa.capertml.html.head.meta.equiv.DEFAULT_STYLE
import org.github.cao.awa.com.github.cao.awa.capertml.html.head.meta.equiv.HTMLHTTPEquivValue
import org.github.cao.awa.com.github.cao.awa.capertml.html.head.meta.equiv.REFRESH

@Deprecated(level = DeprecationLevel.WARNING, message = "Not recommented to use")
class HTMLHeadMetaDefaultStyleEquivValue(val defaultStyle: String = "") :
    HTMLHTTPEquivValue<HTMLHeadMetaDefaultStyleEquivValue>(
        DEFAULT_STYLE
    ) {
    override fun stringify(): String {
        val builder = StringBuilder()
        if (this.defaultStyle.isNotEmpty()) {
            builder.append(this.defaultStyle)
        }
        return builder.toString()
    }
}