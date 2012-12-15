/*
 * Created on Sep 23, 2006
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 * 
 * Copyright @2006-2011 the original author or authors.
 */
package org.fest.util;

import static org.fest.util.Dates.parse;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import org.junit.Test;

/**
 * Tests for {@link Dates#parse(String)}.
 * 
 * @author Joel Costigliola
 */
public class Dates_parse_Test {

  @Test
  public void should_parse_string() throws ParseException {
    String dateAsString = "26/08/1994";
    SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
    assertEquals(formatter.parse(dateAsString), parse("1994-08-26"));
  }

  @Test
  public void should_return_null_if_string_to_parse_is_null() {
    assertNull(parse(null));
  }

}
