package org.example.low_level_design.lld2.class3_factory.assignments.document_processor;

public abstract class DocumentProcessor {
   private final String documentName;

   public DocumentProcessor (String documentName) {
	  this.documentName = documentName;
   }

   public abstract DocumentType supportsType ();

   public abstract void processDocument ();
   
   public String getDocumentName () {
	  return this.documentName;
   }
}
