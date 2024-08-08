package org.example.low_level_design.lld2.class3_factory.assignments.document_processing;


import org.example.low_level_design.lld2.class3_factory.assignments.document_processing.parser.DocumentParser;
import org.example.low_level_design.lld2.class3_factory.assignments.document_processing.parser.SpreadsheetDocumentParser;
import org.example.low_level_design.lld2.class3_factory.assignments.document_processing.printer.DocumentPrinter;
import org.example.low_level_design.lld2.class3_factory.assignments.document_processing.printer.SpreadsheetDocumentPrinter;
import org.example.low_level_design.lld2.class3_factory.assignments.document_processing.processor.DocumentProcessor;
import org.example.low_level_design.lld2.class3_factory.assignments.document_processing.processor.SpreadsheetDocumentProcessor;

public class SpreadsheetDocumentFactory extends DocumentFactory{


   @Override
   public DocumentType supportsType () {
	  return DocumentType.SPREAD_SHEET;
   }

   @Override
   public DocumentProcessor createProcessor (String documentName) {
	  return new SpreadsheetDocumentProcessor(documentName);
   }

   @Override
   public DocumentPrinter createPrinter (DocumentProcessor processor) {
	  return new SpreadsheetDocumentPrinter (processor);
   }

   @Override
   public DocumentParser createParser (String path) {
	  return new SpreadsheetDocumentParser (path);
   }
}