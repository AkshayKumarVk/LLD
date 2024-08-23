package org.example.low_level_design.lld3.tictactoe.services.strategies.winning_strategy;

import org.example.low_level_design.lld3.tictactoe.models.Board;
import org.example.low_level_design.lld3.tictactoe.models.Move;

public interface WinningStrategy {
   boolean isWinning(Board board, Move move);
}
