package org.example.low_level_design.lld3.tictactoe.models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Symbol {
   private char symbol;

   public Symbol(char symbol) {
	  this.symbol = symbol;
   }
}
