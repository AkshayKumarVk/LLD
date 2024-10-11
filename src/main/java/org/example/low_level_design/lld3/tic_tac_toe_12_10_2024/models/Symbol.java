package org.example.low_level_design.lld3.tic_tac_toe_12_10_2024.models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class Symbol {
   private char aChar;

   public Symbol (char aChar) {
	  this.aChar=aChar;
   }

}
