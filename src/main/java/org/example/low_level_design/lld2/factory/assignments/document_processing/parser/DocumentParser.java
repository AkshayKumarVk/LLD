package org.example.low_level_design.lld2.factory.assignments.document_processing.parser;


import org.example.low_level_design.lld2.factory.assignments.document_processing.DocumentType;

public abstract class DocumentParser {

    private final String path;

    public DocumentParser(String path) {
        this.path = path;
    }

    public abstract void parseDocument();

    public String getPath() {
        return path;
    }

    public abstract DocumentType supportsType();

}