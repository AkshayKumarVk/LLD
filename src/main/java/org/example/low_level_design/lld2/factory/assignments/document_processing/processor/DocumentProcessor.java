package org.example.low_level_design.lld2.factory.assignments.document_processing.processor;


import org.example.low_level_design.lld2.factory.assignments.document_processing.DocumentType;

public abstract class DocumentProcessor {
    private String documentName;

    public DocumentProcessor(String documentName) {
        this.documentName = documentName;
    }

    public String getDocumentName() {
        return documentName;
    }

    public abstract void processDocument();

    public abstract DocumentType supportsType();

}