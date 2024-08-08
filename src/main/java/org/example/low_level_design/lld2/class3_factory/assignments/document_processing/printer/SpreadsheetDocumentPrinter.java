package org.example.low_level_design.lld2.class3_factory.assignments.document_processing.printer;


import org.example.low_level_design.lld2.class3_factory.assignments.document_processing.DocumentType;
import org.example.low_level_design.lld2.class3_factory.assignments.document_processing.processor.DocumentProcessor;

public class SpreadsheetDocumentPrinter extends DocumentPrinter {

    public SpreadsheetDocumentPrinter(DocumentProcessor processor) {
        super(processor);
    }

    public void printDocument() {
	   System.out.println ("Printing the Spreadsheet Document");
    }

    @Override
    public DocumentType supportsType() {
        return DocumentType.SPREAD_SHEET;
    }
}