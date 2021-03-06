/**
 * (c) Copyright 2013 WibiData, Inc.
 *
 * See the NOTICE file distributed with this work for additional
 * information regarding copyright ownership.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.kiji.scoring.params.parser;

import org.kiji.scoring.params.IllegalParamValueException;
import org.kiji.scoring.params.ParamSpec;

/**
 * Parser for Float parameters.
 */
public class FloatParser extends NullableSimpleValueParser<Float> {
  /** {@inheritDoc} */
  @Override
  public Class<? extends Float> getParsedClass() {
    return Float.class;
  }

  /** {@inheritDoc} */
  @Override
  public Float parseNonNull(ParamSpec param, String string) {
    try {
      return Float.parseFloat(string);
    } catch (NumberFormatException nfe) {
      throw new IllegalParamValueException(param, string);
    }
  }
}
