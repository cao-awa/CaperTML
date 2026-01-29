package org.github.cao.awa.com.github.cao.awa.capertml.html.head.meta.equiv

import org.github.cao.awa.com.github.cao.awa.capertml.html.head.meta.HTMLHeadMetaType
import org.github.cao.awa.com.github.cao.awa.capertml.html.head.meta.equiv.refresh.HTMLHeadMetaRefreshEquivValue
import org.github.cao.awa.com.github.cao.awa.capertml.html.head.meta.equiv.security.HTMLHeadMetaContentSecurityPolicyEquivValue
import org.github.cao.awa.com.github.cao.awa.capertml.html.head.meta.equiv.style.HTMLHeadMetaDefaultStyleEquivValue
import org.github.cao.awa.com.github.cao.awa.capertml.html.head.meta.equiv.type.HTMLHeadMetaContentTypeEquivValue

class HTMLHTTPEquivType<T: HTMLHTTPEquivValue<T>>(literal: String): HTMLHeadMetaType(literal)

val CONTENT_SECURITY_POLICY: HTMLHTTPEquivType<HTMLHeadMetaContentSecurityPolicyEquivValue> = HTMLHTTPEquivType("Content-Security-Policy")
val REFRESH: HTMLHTTPEquivType<HTMLHeadMetaRefreshEquivValue> = HTMLHTTPEquivType("refresh")
val DEFAULT_STYLE: HTMLHTTPEquivType<HTMLHeadMetaDefaultStyleEquivValue> = HTMLHTTPEquivType("default-style")

@Deprecated(level = DeprecationLevel.WARNING, message = "Deprecated in HTML5")
val CONTENT_TYPE: HTMLHTTPEquivType<HTMLHeadMetaContentTypeEquivValue> = HTMLHTTPEquivType("content-type")

@Deprecated(level = DeprecationLevel.WARNING, message = "Deprecated")
val EXPIRES = HTMLHTTPEquivType("expires")

@Deprecated(level = DeprecationLevel.WARNING, message = "Deprecated")
val PRAGMA = HTMLHTTPEquivType("pragma")

@Deprecated(level = DeprecationLevel.WARNING, message = "Deprecated")
val CACHE_CONTROL = HTMLHTTPEquivType("cache-control")

@Deprecated(level = DeprecationLevel.WARNING, message = "Only used in IE")
val X_UA_COMPATIBLE = HTMLHTTPEquivType("X-UA-Compatible")

@Deprecated(level = DeprecationLevel.WARNING, message = "Deprecated")
val PICS_LABEL = HTMLHTTPEquivType("pics-label")

@Deprecated(level = DeprecationLevel.WARNING, message = "Never be used")
val SET_COOKIE = HTMLHTTPEquivType("set-cookie")

@Deprecated(level = DeprecationLevel.WARNING, message = "Only used in IE or Netscape")
val WINDOW_TARGET = HTMLHTTPEquivType("window-target")
