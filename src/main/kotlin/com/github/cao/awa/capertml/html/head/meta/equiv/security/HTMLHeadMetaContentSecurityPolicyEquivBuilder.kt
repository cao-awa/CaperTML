package org.github.cao.awa.com.github.cao.awa.capertml.html.head.meta.equiv.security

class HTMLHeadMetaContentSecurityPolicyEquivValueBuilder {
    private var policy: String = ""

    fun policy(policy: String) {
        this.policy = policy
    }

    fun build(): HTMLHeadMetaContentSecurityPolicyEquivValue {
        return HTMLHeadMetaContentSecurityPolicyEquivValue(this.policy)
    }
}

fun createContentSecurityPolicy(builder: HTMLHeadMetaContentSecurityPolicyEquivValueBuilder.() -> Unit): HTMLHeadMetaContentSecurityPolicyEquivValue {
    return HTMLHeadMetaContentSecurityPolicyEquivValueBuilder().also {
        builder(it)
    }.build()
}