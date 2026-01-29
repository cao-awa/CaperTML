package org.github.cao.awa.com.github.cao.awa.capertml.html.head

import org.github.cao.awa.com.github.cao.awa.capertml.html.HTMLElement
import org.github.cao.awa.com.github.cao.awa.capertml.html.head.meta.charset.HTMLHeadCharsetMeta
import org.github.cao.awa.com.github.cao.awa.capertml.html.head.meta.HTMLHeadMeta
import org.github.cao.awa.com.github.cao.awa.capertml.html.head.meta.HTMLHeadMetaType
import org.github.cao.awa.com.github.cao.awa.capertml.html.head.meta.content.author.HTMLHeadMetaAuthorContentBuilder
import org.github.cao.awa.com.github.cao.awa.capertml.html.head.meta.content.author.createAuthor
import org.github.cao.awa.com.github.cao.awa.capertml.html.head.meta.content.color.HTMLHeadMetaColorSchemeContentBuilder
import org.github.cao.awa.com.github.cao.awa.capertml.html.head.meta.content.color.createColorScheme
import org.github.cao.awa.com.github.cao.awa.capertml.html.head.meta.content.description.HTMLHeadMetaDescriptionContentBuilder
import org.github.cao.awa.com.github.cao.awa.capertml.html.head.meta.content.description.createDescription
import org.github.cao.awa.com.github.cao.awa.capertml.html.head.meta.content.keyword.HTMLHeadMetaKeywordsContentBuilder
import org.github.cao.awa.com.github.cao.awa.capertml.html.head.meta.content.keyword.createKeywords
import org.github.cao.awa.com.github.cao.awa.capertml.html.head.meta.content.rebot.HTMLHeadMetaRobotsContentBuilder
import org.github.cao.awa.com.github.cao.awa.capertml.html.head.meta.content.rebot.createRobots
import org.github.cao.awa.com.github.cao.awa.capertml.html.head.meta.content.referrer.HTMLHeadMetaReferrerContentBuilder
import org.github.cao.awa.com.github.cao.awa.capertml.html.head.meta.content.referrer.createReferrer
import org.github.cao.awa.com.github.cao.awa.capertml.html.head.meta.content.theme.HTMLHeadMetaThemeColorContentBuilder
import org.github.cao.awa.com.github.cao.awa.capertml.html.head.meta.content.theme.createThemeColor
import org.github.cao.awa.com.github.cao.awa.capertml.html.head.meta.content.viewport.HTMLHeadMetaViewportContentBuilder
import org.github.cao.awa.com.github.cao.awa.capertml.html.head.meta.content.viewport.createViewport
import org.github.cao.awa.com.github.cao.awa.capertml.html.head.meta.equiv.refresh.HTMLHeadMetaRefreshEquivValueBuilder
import org.github.cao.awa.com.github.cao.awa.capertml.html.head.meta.equiv.refresh.createRefresh
import org.github.cao.awa.com.github.cao.awa.capertml.html.head.meta.equiv.security.HTMLHeadMetaContentSecurityPolicyEquivValueBuilder
import org.github.cao.awa.com.github.cao.awa.capertml.html.head.meta.equiv.security.createContentSecurityPolicy
import org.github.cao.awa.com.github.cao.awa.capertml.html.head.meta.equiv.style.HTMLHeadMetaDefaultStyleEquivValueBuilder
import org.github.cao.awa.com.github.cao.awa.capertml.html.head.meta.equiv.style.createDefaultStyle
import org.github.cao.awa.com.github.cao.awa.capertml.html.head.meta.equiv.type.HTMLHeadMetaContentTypeEquivValueBuilder
import org.github.cao.awa.com.github.cao.awa.capertml.html.head.meta.equiv.type.createContentType
import org.github.cao.awa.com.github.cao.awa.capertml.html.head.title.HTMLTitle
import java.nio.charset.Charset

class HTMLHead: HTMLElement() {
    private var pageTitle: HTMLTitle = HTMLTitle()
    private var metadata: LinkedHashMap<HTMLHeadMetaType, HTMLHeadMeta<*>> = LinkedHashMap()

    fun pageTitle(title: HTMLTitle.() -> Unit) {
        title(this.pageTitle)
    }

    fun content(content: HTMLHeadMeta<*>) {
        val currentData = this.metadata[content.metaType]
        if (currentData != null) {
            error("Meta content '${content.metaType.literal}' cannot set because it already set to '${currentData.valueLiteral()}'")
        }
        this.metadata[content.metaType] = content
    }

    fun charset(charset: Charset) {
        content(HTMLHeadCharsetMeta().apply {
            charset(charset)
        })
    }

    fun viewport(builder: HTMLHeadMetaViewportContentBuilder.() -> Unit) {
        content(createViewport(builder))
    }

    fun themeColor(builder: HTMLHeadMetaThemeColorContentBuilder.() -> Unit) {
        content(createThemeColor(builder))
    }

    fun referrer(builder: HTMLHeadMetaReferrerContentBuilder.() -> Unit) {
        content(createReferrer(builder))
    }

    fun robots(builder: HTMLHeadMetaRobotsContentBuilder.() -> Unit) {
        content(createRobots(builder))
    }

    fun keywords(builder: HTMLHeadMetaKeywordsContentBuilder.() -> Unit) {
        content(createKeywords(builder))
    }

    fun description(builder: HTMLHeadMetaDescriptionContentBuilder.() -> Unit) {
        content(createDescription(builder))
    }

    fun author(builder: HTMLHeadMetaAuthorContentBuilder.() -> Unit) {
        content(createAuthor(builder))
    }

    fun colorScheme(builder: HTMLHeadMetaColorSchemeContentBuilder.() -> Unit) {
        content(createColorScheme(builder))
    }

    fun contentSecurityPolicy(builder: HTMLHeadMetaContentSecurityPolicyEquivValueBuilder.() -> Unit) {
        content(createContentSecurityPolicy(builder))
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "Not recommented to use")
    fun refresh(builder: HTMLHeadMetaRefreshEquivValueBuilder.() -> Unit) {
        content(createRefresh(builder))
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "Not recommented to use, use css instead")
    fun defaultStyle(builder: HTMLHeadMetaDefaultStyleEquivValueBuilder.() -> Unit) {
        content(createDefaultStyle(builder))
    }

    @Deprecated(
        level = DeprecationLevel.WARNING,
        message = "Not recommented to use",
        replaceWith = ReplaceWith(
            expression = "charset(Charsets.UTF_8)"
        )
    )
    fun contentType(builder: HTMLHeadMetaContentTypeEquivValueBuilder.() -> Unit) {
        content(createContentType(builder))
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "Invalid scope, use 'pageTitle' instead")
    override fun title(title: String) {
        error("Cannot set title in <head> tag, use 'pageTitle' instead")
    }

    override fun toString(pretty: Boolean, ident: String): String {
        val builder = StringBuilder()
        if (pretty) {
            builder.append(ident)
        }
        builder.append("<head")
        builder.append(">")
        if (pretty) {
            builder.append("\n")
        }
        for ((type, meta) in this.metadata) {
            builder.append(meta.toString(pretty, "$ident    "))
        }
        builder.append(this.pageTitle.toString(pretty, "$ident    "))
        if (pretty) {
            builder.append("\n")
            builder.append(ident)
        }
        builder.append("</head>")
        if (pretty) {
            builder.append("\n")
        }
        return builder.toString()
    }
}