package org.example.low_level_design.lld2.factory.assignments.document_processing;

public class Client {
   public static void main (String[] args) {
	  demoDocumentProcess();
   }

   private static void demoDocumentProcess () {

	  String name = "Daily Report";
	  String path = "/d/e/d";

	  DocumentFactory documentFactory=new SpreadsheetDocumentFactory ();
	  documentFactory.createProcessor (name);
	  documentFactory.createParser (path);
	  documentFactory.createPrinter (documentFactory.createProcessor (name));

	  System.out.println ("debug");
   }
}
