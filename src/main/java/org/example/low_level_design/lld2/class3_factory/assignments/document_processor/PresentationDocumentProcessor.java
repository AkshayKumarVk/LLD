package org.example.low_level_design.lld2.class3_factory.assignments.document_processor;

public class PresentationDocumentProcessor extends DocumentProcessor{

   public PresentationDocumentProcessor(String documentName) {
	  super (documentName);
   }

   @Override
   public DocumentType supportsType(){
	  return DocumentType.PRESENTATION;
   }

   @Override
   public void processDocument() {
	  // Implement text document processing logic
	  System.out.println("Processing a text document: " + getDocumentName());
	  // Additional logic for text document processing
   }
   public void addSlide() {
	  System.out.println("Adding a slide to the presentation.");
   }
}
