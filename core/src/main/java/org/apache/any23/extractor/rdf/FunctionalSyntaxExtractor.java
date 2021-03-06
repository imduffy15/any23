/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.any23.extractor.rdf;

import org.apache.any23.extractor.ExtractionContext;
import org.apache.any23.extractor.ExtractionResult;
import org.apache.any23.extractor.ExtractorDescription;
import org.eclipse.rdf4j.rio.RDFParser;

/**
 * Concrete implementation of {@link org.apache.any23.extractor.Extractor.ContentExtractor}
 * handling <a href="https://www.w3.org/TR/owl2-syntax/">OWL2 Functional-Style Syntax</a> format.
 *
 * @author Peter Ansell
 */
public class FunctionalSyntaxExtractor extends BaseRDFExtractor {

    public FunctionalSyntaxExtractor(boolean verifyDataType, boolean stopAtFirstError) {
        super(verifyDataType, stopAtFirstError);
    }

    public FunctionalSyntaxExtractor() {
        this(false, false);
    }

    @Override
    public ExtractorDescription getDescription() {
        return FunctionalSyntaxExtractorFactory.getDescriptionInstance();
    }

    @Override
    protected RDFParser getParser(ExtractionContext extractionContext, ExtractionResult extractionResult) {
        return RDFParserFactory.getInstance().getFunctionalSyntaxParser(
                isVerifyDataType(), isStopAtFirstError(), extractionContext, extractionResult
        );
    }

}
