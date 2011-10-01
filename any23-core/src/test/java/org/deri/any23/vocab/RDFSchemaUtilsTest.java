/*
 * Copyright 2008-2010 Digital Enterprise Research Institute (DERI)
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

package org.deri.any23.vocab;

import org.deri.any23.util.StringUtils;
import org.junit.Assert;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.ByteArrayOutputStream;

/**
 * Test case for {@link RDFSchemaUtils}.
 *
 * @author Michele Mostarda (mostarda@fbk.eu)
 */
public class RDFSchemaUtilsTest {

    private static final Logger logger = LoggerFactory.getLogger(RDFSchemaUtilsTest.class);

    /**
     * Test case for
     * {@link org.deri.any23.vocab.RDFSchemaUtils#serializeVocabularies(
     * org.deri.any23.vocab.RDFSchemaUtils.VocabularyFormat, java.io.OutputStream)} with <i>NTriples</i> format.
     */
    @Test
    public void testSerializeVocabulariesNTriples() {
        serializeVocabularies(RDFSchemaUtils.VocabularyFormat.NTriples, 802);
    }

    /**
     * Test case for
     * {@link org.deri.any23.vocab.RDFSchemaUtils#serializeVocabularies(
     * org.deri.any23.vocab.RDFSchemaUtils.VocabularyFormat, java.io.OutputStream)} with <i>RDFXML</i> format.
     */
    @Test
    public void testSerializeVocabulariesRDFXML() {
        serializeVocabularies(RDFSchemaUtils.VocabularyFormat.RDFXML, 2065);
    }

    private void serializeVocabularies(RDFSchemaUtils.VocabularyFormat format, int expectedLines) {
        final ByteArrayOutputStream baos = new ByteArrayOutputStream();
        RDFSchemaUtils.serializeVocabularies(format, baos);
        final String output = baos.toString();
        logger.debug(output);
        final int occurrences= StringUtils.countOccurrences(output, "\n");
        Assert.assertEquals(expectedLines, occurrences);
    }

}
