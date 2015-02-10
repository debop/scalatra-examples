package com.github.debop.scalatra.annotations

import java.lang.annotation.{ElementType, Retention, RetentionPolicy, Target}

/**
 * Annotation for specifying the `url path for controller`.
 */
class ServletPath(url: String) extends scala.annotation.ClassfileAnnotation
