# Supported element
## HTML head and body
```kotlin
fun main() {
    html {
        head { }
        body { }
    }
}
```

## Div
Div block cannot put into head scope.

```kotlin
fun main() {
    html {
        head { }
        body {
            // In body.
            div {
                
            }
        }
    }
}
```

# A
Tag 'a' can put into any textable contains, include '\<p\>', '\<div\>' and other.

```kotlin
fun main() {
    html {
        head { }
        body {
            // In body.
            a {
                
            }
            div {
                // In div.
                a {
                    
                }
            }
        }
    }
}
```

# H1 ~ H6
Tag 'h1' ~ 'h6' can put into any textable contains, include '\<p\>', '\<div\>' and other.

```kotlin
fun main() {
    html {
        head { }
        body {
            h1 {
                +"H1 text"
            }
            h2 {
                +"H2 text"
            }
            // ... and others.
        }
    }
}
```

# B
Tag 'b' can put into any textable contains, include '\<p\>', '\<div\>' and other.

```kotlin
fun main() {
    html {
        head { }
        body {
            b { 
                +"Bold text"
            }
        }
    }
}
```

# Br
Tag 'br' can put into anywhere if not head scope.

```kotlin
fun main() {
    html {
        head { }
        body {
            br()
            p {
                +"P text"
                br()
                +"P text line2"
            }
        }
    }
}
```

# I
Tag 'i' can put into any textable contains, include '\<p\>', '\<div\>' and other.

```kotlin
fun main() {
    html {
        head { }
        body {
            i {
                +"I text"
            }
            p {
                i {
                    +"I text in P"
                }
            }
        }
    }
}
```

# Em
Tag 'em' can put into any textable contains, include '\<p\>', '\<div\>' and other.

```kotlin
fun main() {
    html {
        head { }
        body {
            em {
                +"Em text"
            }
            p {
                em {
                    +"Em text in P"
                }
            }
        }
    }
}
```