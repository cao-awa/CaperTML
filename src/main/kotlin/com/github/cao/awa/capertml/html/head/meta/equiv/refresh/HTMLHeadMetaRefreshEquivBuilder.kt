package org.github.cao.awa.com.github.cao.awa.capertml.html.head.meta.equiv.refresh

@Deprecated(
    level = DeprecationLevel.WARNING,
    message = "Not recommented to use"
)
class HTMLHeadMetaRefreshEquivValueBuilder {
    private var waitTime: Int = 0
    private var jumpUrl: String = ""

    fun waitTime(waitTime: Int) {
        this.waitTime = waitTime
    }

    fun jumpUrl(jumpUrl: String) {
        this.jumpUrl = jumpUrl
    }

    fun build(): HTMLHeadMetaRefreshEquivValue {
        return HTMLHeadMetaRefreshEquivValue(this.waitTime, this.jumpUrl)
    }
}

fun createRefresh(builder: HTMLHeadMetaRefreshEquivValueBuilder.() -> Unit): HTMLHeadMetaRefreshEquivValue {
    return HTMLHeadMetaRefreshEquivValueBuilder().also {
        builder(it)
    }.build()
}