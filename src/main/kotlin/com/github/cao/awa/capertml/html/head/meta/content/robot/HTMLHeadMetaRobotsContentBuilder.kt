package org.github.cao.awa.com.github.cao.awa.capertml.html.head.meta.content.rebot

import org.github.cao.awa.com.github.cao.awa.capertml.html.head.meta.content.referrer.HTMLHeadMetaReferrerContent
import org.github.cao.awa.com.github.cao.awa.capertml.referrer.HTMLReferrerType
import org.github.cao.awa.com.github.cao.awa.capertml.robot.HTMLRobotPolicy

class HTMLHeadMetaRobotsContentBuilder {
    private var policies: Array<out HTMLRobotPolicy> = arrayOf()

    fun policies(vararg policies: HTMLRobotPolicy) {
        this.policies = policies
    }

    fun build(): HTMLHeadMetaRobotsContent {
        return HTMLHeadMetaRobotsContent(this.policies)
    }
}

fun createRobots(builder: HTMLHeadMetaRobotsContentBuilder.() -> Unit): HTMLHeadMetaRobotsContent {
    return HTMLHeadMetaRobotsContentBuilder().also {
        builder(it)
    }.build()
}