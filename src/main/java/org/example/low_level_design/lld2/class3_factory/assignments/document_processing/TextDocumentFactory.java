package org.example.low_level_design.lld2.class3_factory.assignments.document_processing;

import org.example.low_level_design.lld2.class3_factory.assignments.document_processing.parser.DocumentParser;
import org.example.low_level_design.lld2.class3_factory.assignments.document_processing.parser.TextDocumentParser;
import org.example.low_level_design.lld2.class3_factory.assignments.document_processing.printer.DocumentPrinter;
import org.example.low_level_design.lld2.class3_factory.assignments.document_processing.printer.TextDocumentPrinter;
import org.example.low_level_design.lld2.class3_factory.assignments.document_processing.processor.DocumentProcessor;
import org.example.low_level_design.lld2.class3_factory.assignments.document_processing.processor.TextDocumentProcessor;

public class TextDocumentFactory extends  DocumentFactory{
   @Override
   public DocumentType supportsType () {
	  return DocumentType.TEXT;
   }

   @Override
   public DocumentProcessor createProcessor (String documentName) {
	  return new TextDocumentProcessor (documentName);
   }

   @Override
   public DocumentPrinter createPrinter (DocumentProcessor processor) {
	  return new TextDocumentPrinter (processor);
   }

   @Override
   public DocumentParser createParser (String path) {
	  return new TextDocumentParser (path);
   }
}