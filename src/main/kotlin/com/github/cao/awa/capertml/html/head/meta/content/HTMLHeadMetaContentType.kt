package org.github.cao.awa.com.github.cao.awa.capertml.html.head.meta.content

import org.github.cao.awa.com.github.cao.awa.capertml.html.head.meta.HTMLHeadMetaType
import org.github.cao.awa.com.github.cao.awa.capertml.html.head.meta.content.author.HTMLHeadMetaAuthorContent
import org.github.cao.awa.com.github.cao.awa.capertml.html.head.meta.content.color.HTMLHeadMetaColorSchemeColorContent
import org.github.cao.awa.com.github.cao.awa.capertml.html.head.meta.content.description.HTMLHeadMetaDescriptionContent
import org.github.cao.awa.com.github.cao.awa.capertml.html.head.meta.content.keyword.HTMLHeadMetaKeywordsContent
import org.github.cao.awa.com.github.cao.awa.capertml.html.head.meta.content.rebot.HTMLHeadMetaRobotsContent
import org.github.cao.awa.com.github.cao.awa.capertml.html.head.meta.content.referrer.HTMLHeadMetaReferrerContent
import org.github.cao.awa.com.github.cao.awa.capertml.html.head.meta.content.theme.HTMLHeadMetaThemeColorContent
import org.github.cao.awa.com.github.cao.awa.capertml.html.head.meta.content.viewport.HTMLHeadMetaViewportContent

class HTMLHeadMetaContentType<T: HTMLHeadMetaContentValue<T>>(literal: String): HTMLHeadMetaType(literal)

val VIEWPORT = HTMLHeadMetaContentType<HTMLHeadMetaViewportContent>("viewport")
val DESCRIPTION = HTMLHeadMetaContentType<HTMLHeadMetaDescriptionContent>("description")
@Deprecated(level = DeprecationLevel.WARNING, message = "Deprecated by search engines")
val KEYWORDS = HTMLHeadMetaContentType<HTMLHeadMetaKeywordsContent>("keyword")
val AUTHOR = HTMLHeadMetaContentType<HTMLHeadMetaAuthorContent>("author")
val ROBOTS = HTMLHeadMetaContentType<HTMLHeadMetaRobotsContent>("robots")
val REFERRER = HTMLHeadMetaContentType<HTMLHeadMetaReferrerContent>("referer")
val THEME_COLOR = HTMLHeadMetaContentType<HTMLHeadMetaThemeColorContent>("theme-color")
val COLOR_SCHEME = HTMLHeadMetaContentType<HTMLHeadMetaColorSchemeColorContent>("color-scheme")