/**
 * Copyright (c) 2000-2016 Liferay, Inc. All rights reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.liferay.faces.test.showcase.selectmanycheckbox;

import com.liferay.faces.test.showcase.select.SelectManyTester;


/**
 * @author  Kyle Stiemann
 * @author  Philip White
 */
public class SelectManyCheckboxTester extends SelectManyTester {

	// Component URL
	protected static final String selectManyCheckboxURL = TEST_CONTEXT_URL + "/selectmanycheckbox";

	// Common Xpath
	protected static final String selectManyCheckbox1Xpath =
		"(//table[contains(@id,':selectManyCheckbox')]|//div[contains(@id,':selectManyCheckbox')])[1]";
	protected static final String selectManyCheckbox2Xpath =
		"(//table[contains(@id,':selectManyCheckbox')]|//div[contains(@id,':selectManyCheckbox')])[2]";

	// Protected Constants
	protected static final String CHECKBOX_CHILD_XPATH = "//input[contains(@id,':selectManyCheckbox')]";
}