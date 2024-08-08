package org.example.low_level_design.lld2.class3_factory.assignments.document_processing.printer;


import org.example.low_level_design.lld2.class3_factory.assignments.document_processing.DocumentType;
import org.example.low_level_design.lld2.class3_factory.assignments.document_processing.processor.DocumentProcessor;

public class TextDocumentPrinter extends DocumentPrinter {

    public TextDocumentPrinter(DocumentProcessor processor) {
        super(processor);
    }

    public void printDocument() {
	   System.out.println ("Printing the Text document");
    }

    @Override
    public DocumentType supportsType() {
        return DocumentType.TEXT;
    }
}