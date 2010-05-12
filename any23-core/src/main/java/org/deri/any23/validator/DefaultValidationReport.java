/*
 * Copyright 2008-2010 Digital Enterprise Research Institute (DERI)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *          http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.deri.any23.validator;

import java.util.List;

/**
 * Default implementation of {@link org.deri.any23.validator.ValidationReport}.
 * 
 * @author Michele Mostarda (mostarda@fbk.eu)
 */
public class DefaultValidationReport implements ValidationReport {

    private List<Issue> issues;
    private List<RuleActivation> ruleActivations;
    private List<Error> errors;

    public DefaultValidationReport(
            List<Issue> issues,
            List<RuleActivation> ruleActivations,
            List<Error> errors
    ) {
        this.issues = issues;
        this.ruleActivations = ruleActivations;
        this.errors = errors;
    }

    public List<Issue> getIssues() {
        return issues;
    }

    public List<RuleActivation> getRuleActivations() {
        return ruleActivations;
    }

    public List<Error> getErrors() {
        return errors;
    }
}
