package org.example.low_level_design.lld2.factory.assignments.document_processing.parser;


import org.example.low_level_design.lld2.factory.assignments.document_processing.DocumentType;

public class SpreadsheetDocumentParser extends DocumentParser {

    public SpreadsheetDocumentParser(String path) {
        super(path);
    }

    public void parseDocument() {
	   System.out.println ("Parsing the Spreadsheet Document");
    }

    @Override
    public DocumentType supportsType() {
        return DocumentType.SPREAD_SHEET;
    }
}