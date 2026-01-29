package org.github.cao.awa.com.github.cao.awa.capertml.html.head.meta.equiv.security

import org.github.cao.awa.com.github.cao.awa.capertml.html.head.meta.equiv.CONTENT_SECURITY_POLICY
import org.github.cao.awa.com.github.cao.awa.capertml.html.head.meta.equiv.HTMLHTTPEquivValue

class HTMLHeadMetaContentSecurityPolicyEquivValue(val policy: String) :
    HTMLHTTPEquivValue<HTMLHeadMetaContentSecurityPolicyEquivValue>(
        CONTENT_SECURITY_POLICY
    ) {
    override fun stringify(): String = this.policy
}