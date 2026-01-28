package org.github.cao.awa.com.github.cao.awa.capertml.html.head.meta.content.rebot

import org.github.cao.awa.com.github.cao.awa.capertml.html.head.meta.content.HTMLHeadMetaContentValue
import org.github.cao.awa.com.github.cao.awa.capertml.robot.HTMLRobotPolicy

class HTMLHeadMetaRobotsContent(val policies: Array<out HTMLRobotPolicy>): HTMLHeadMetaContentValue() {
    companion object {
        fun of(vararg keywords: HTMLRobotPolicy): HTMLHeadMetaRobotsContent {
            return HTMLHeadMetaRobotsContent(keywords)
        }
    }

    override fun stringify(): String {
        val builder = StringBuilder()
        for (keyword in this.policies) {
            builder.append(keyword.literal)
            builder.append(",")
        }
        builder.delete(builder.length - 1, builder.length)
        return builder.toString()
    }
}