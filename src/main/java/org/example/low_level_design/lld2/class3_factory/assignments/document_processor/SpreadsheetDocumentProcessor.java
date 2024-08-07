package org.example.low_level_design.lld2.class3_factory.assignments.document_processor;

public class SpreadsheetDocumentProcessor extends DocumentProcessor{

   public SpreadsheetDocumentProcessor(String documentName) {
	  super (documentName);
   }

   public DocumentType supportsType(){
	  return DocumentType.SPREAD_SHEET;
   }
   public void processDocument() {
	  // Implement spreadsheet document processing logic
	  System.out.println("Processing a spreadsheet document: " + getDocumentName());
	  // Additional logic for spreadsheet document processing
   }

   public void performDataAnalysis() {
	  System.out.println("Performing data analysis on the spreadsheet.");
   }
}
