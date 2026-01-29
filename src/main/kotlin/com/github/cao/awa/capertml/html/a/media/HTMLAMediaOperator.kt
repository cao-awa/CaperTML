package org.github.cao.awa.com.github.cao.awa.capertml.html.a.media

enum class HTMLAMediaOperator(val literal: String) {
    AND("and"),
    NOT("not"),
    OR(",");

    override fun toString(): String {
     return this.literal
    }
}