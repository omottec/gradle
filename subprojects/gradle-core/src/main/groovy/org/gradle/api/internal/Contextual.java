/*
 * Copyright 2009 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.gradle.api.internal;

import java.lang.annotation.*;

/**
 * This annotation is attached to an exception class to indicate that it provides contextual information about the
 * exception which might help the user determine what the failed operation was, or where it took place. Generally, this
 * annotation is only attached to exceptions which chain lower-level exceptions.
 *
 * A contextual exception class should declare a no-args constructor or a copy constructor, to allow automated
 * generation of subclasses by an {@link org.gradle.api.internal.ExceptionAnalyser}.
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Inherited
public @interface Contextual {
}
