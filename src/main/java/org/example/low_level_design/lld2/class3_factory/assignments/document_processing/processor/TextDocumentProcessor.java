package org.example.low_level_design.lld2.class3_factory.assignments.document_processing.processor;

import org.example.low_level_design.lld2.class3_factory.assignments.document_processing.DocumentType;

public class TextDocumentProcessor extends DocumentProcessor {

    public TextDocumentProcessor(String documentName) {
        super(documentName);
    }

    @Override
    public void processDocument() {
        // Implement text document processing logic
        System.out.println("Processing a text document: " + getDocumentName());
        // Additional logic for text document processing
    }

    @Override
    public DocumentType supportsType() {
        return DocumentType.TEXT;
    }
}