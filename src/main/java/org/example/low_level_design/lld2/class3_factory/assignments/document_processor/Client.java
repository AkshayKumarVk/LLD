package org.example.low_level_design.lld2.class3_factory.assignments.document_processor;

public class Client {
   public static void main (String[] args) {
	  documentDemo ();
   }

   private static void documentDemo () {
	  String documentName = "Daily Report";
	  DocumentType documentType = DocumentType.SPREAD_SHEET;

	  DocumentProcessor documentProcessor =
			  DocumentProcessorFactory.getDocument (documentType, documentName);


	  documentProcessor.processDocument ();
	  ((SpreadsheetDocumentProcessor)documentProcessor).performDataAnalysis ();

	  ((PresentationDocumentProcessor) documentProcessor).addSlide ();

	  System.out.println ("Debug");

   }
}
