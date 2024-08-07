package org.example.low_level_design.lld2.class3_factory.assignments.document_processing.parser;


import org.example.low_level_design.lld2.class3_factory.assignments.document_processing.DocumentType;

public class SpreadsheetDocumentParser extends DocumentParser {

    public SpreadsheetDocumentParser(String path) {
        super(path);
    }

    public void parseDocument() {
        // Parse spreadsheet document
    }

    @Override
    public DocumentType supportsType() {
        return DocumentType.SPREAD_SHEET;
    }
}