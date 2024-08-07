package org.example.low_level_design.lld2.class3_factory.assignments.document_processing.printer;


import org.example.low_level_design.lld2.class3_factory.assignments.document_processing.DocumentType;
import org.example.low_level_design.lld2.class3_factory.assignments.document_processing.processor.DocumentProcessor;

public abstract class DocumentPrinter {

    private final DocumentProcessor processor;

    public DocumentPrinter(DocumentProcessor processor) {
        this.processor = processor;
    }

    public DocumentProcessor getProcessor() {
        return processor;
    }

    public abstract void printDocument();

    public abstract DocumentType supportsType();

}