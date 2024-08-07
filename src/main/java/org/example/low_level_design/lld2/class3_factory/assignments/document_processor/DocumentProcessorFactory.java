package org.example.low_level_design.lld2.class3_factory.assignments.document_processor;

public class DocumentProcessorFactory {
   public static DocumentProcessor getDocument
		   (DocumentType documentType, String documentName) {
	  if (documentType.equals (DocumentType.PRESENTATION)) {
		 return new PresentationDocumentProcessor (documentName);
	  }
	  if (documentType.equals (DocumentType.SPREAD_SHEET)) {
		 return new SpreadsheetDocumentProcessor (documentName);
	  }
	  if (documentType == DocumentType.TEXT) {
		 return new TextDocumentProcessor (documentName);
	  }
	  return null;
   }
}
