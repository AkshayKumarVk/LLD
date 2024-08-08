package org.example.low_level_design.lld2.class3_factory.assignments.document_processing;


import org.example.low_level_design.lld2.class3_factory.assignments.document_processing.parser.DocumentParser;
import org.example.low_level_design.lld2.class3_factory.assignments.document_processing.printer.DocumentPrinter;
import org.example.low_level_design.lld2.class3_factory.assignments.document_processing.processor.DocumentProcessor;

public abstract class DocumentFactory {
   public abstract DocumentType supportsType ();

   public abstract DocumentProcessor createProcessor (String documentName);

   public abstract DocumentPrinter createPrinter (DocumentProcessor processor);

   public abstract DocumentParser createParser (String path);

}