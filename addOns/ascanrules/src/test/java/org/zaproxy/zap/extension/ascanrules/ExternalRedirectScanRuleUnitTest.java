/*
 * Zed Attack Proxy (ZAP) and its related class files.
 *
 * ZAP is an HTTP/HTTPS proxy for assessing web application security.
 *
 * Copyright 2018 The ZAP Development Team
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
package org.zaproxy.zap.extension.ascanrules;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;

import org.junit.jupiter.api.Test;
import org.parosproxy.paros.core.scanner.Alert;

/** Unit test for {@link ExternalRedirectScanRule}. */
class ExternalRedirectScanRuleUnitTest extends ActiveScannerTest<ExternalRedirectScanRule> {

    @Override
    protected ExternalRedirectScanRule createScanner() {
        return new ExternalRedirectScanRule();
    }

    @Test
    void shouldHaveHighRisk() {
        // Given / When
        int risk = rule.getRisk();
        // Then
        assertThat(risk, is(equalTo(Alert.RISK_HIGH)));
    }
}
