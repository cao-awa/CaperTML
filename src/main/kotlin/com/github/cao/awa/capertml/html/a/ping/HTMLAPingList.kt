package org.github.cao.awa.com.github.cao.awa.capertml.html.a.ping

import java.util.LinkedList

class HTMLAPingList {
    private val targets: LinkedList<String> = LinkedList()

    operator fun String.unaryPlus() {
        this@HTMLAPingList.targets.add(this)
    }

    fun isEmpty(): Boolean = this.targets.isEmpty()

    override fun toString(): String {
        if (this.targets.isEmpty()) {
            return ""
        }
        val builder = StringBuilder()
        this.targets.forEach {
            builder.append(it)
            builder.append(" ")
        }
        return builder.substring(0, builder.length - 1)
    }
}