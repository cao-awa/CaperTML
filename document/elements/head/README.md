# Head

Tag 'head' can only put into 'html' tag once.

```kotlin
fun main() {
    html {
        head {
            pageTitle {
                +"This is a title"
            }
        }
    }
}
```

## Methods

Tag 'head' has a lots of methods, here is list:

| Method                | Description                       | Deprecated |
|-----------------------|-----------------------------------|------------|
| pageTitle             | Setting page title                | NO         |
| charset               | Setting charset                   | NO         |
| viewport              | Setting viewport                  | NO         |
| themeColor            | Setting theme color               | NO         |
| colorScheme           | Setting color scheme              | NO         |
| referrer              | Setting referrer                  | NO         |
| robots                | Setting robots policy             | NO         |
| keywords              | Setting keyword                   | NO         |
| description           | Setting description               | NO         |
| author                | Setting author                    | NO         |
| contentSecurityPolicy | Setting content security policy   | NO         |
| refresh               | Setting refresh time and jump url | YES        |
| defaultStyle          | Setting default style             | YES        |
