package org.github.cao.awa.com.github.cao.awa.capertml.html.head.meta.equiv.type

import org.github.cao.awa.com.github.cao.awa.capertml.html.head.meta.equiv.CONTENT_SECURITY_POLICY
import org.github.cao.awa.com.github.cao.awa.capertml.html.head.meta.equiv.CONTENT_TYPE
import org.github.cao.awa.com.github.cao.awa.capertml.html.head.meta.equiv.DEFAULT_STYLE
import org.github.cao.awa.com.github.cao.awa.capertml.html.head.meta.equiv.HTMLHTTPEquivValue
import org.github.cao.awa.com.github.cao.awa.capertml.html.head.meta.equiv.REFRESH

@Deprecated(level = DeprecationLevel.WARNING, message = "Not recommented to use")
class HTMLHeadMetaContentTypeEquivValue(val contentType: String = "") :
    HTMLHTTPEquivValue<HTMLHeadMetaContentTypeEquivValue>(
        CONTENT_TYPE
    ) {
    override fun stringify(): String {
        val builder = StringBuilder()
        if (this.contentType.isNotEmpty()) {
            builder.append(this.contentType)
        }
        return builder.toString()
    }
}