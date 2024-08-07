package org.example.low_level_design.lld2.class3_factory.assignments.document_processing.parser;


import org.example.low_level_design.lld2.class3_factory.assignments.document_processing.DocumentType;

public class TextDocumentParser extends DocumentParser {

    public TextDocumentParser(String path) {
        super(path);
    }

    public void parseDocument() {
        // Parse text document
    }

    @Override
    public DocumentType supportsType() {
        return DocumentType.TEXT;
    }
}