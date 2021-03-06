/*
 * Copyright 2000-2009 JetBrains s.r.o.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.intellij.lang.regexp;

import org.intellij.lang.regexp.psi.RegExpGroup;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * @author yole
 */
public interface RegExpLanguageHost {
  boolean characterNeedsEscaping(char c);
  boolean supportsPerl5EmbeddedComments();
  boolean supportsPossessiveQuantifiers();
  boolean supportsPythonConditionalRefs();
  boolean supportsNamedGroupSyntax(RegExpGroup group);

  boolean isValidCategory(@NotNull String category);
  @NotNull
  String[][] getAllKnownProperties();
  @Nullable
  String getPropertyDescription(@Nullable final String name);
  @NotNull
  String[][] getKnownCharacterClasses();
}
