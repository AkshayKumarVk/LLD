package org.example.low_level_design.lld3.tic_tac_toe_12_10_2024.services.strategies.bot_playing_strategy;

import org.example.low_level_design.lld3.tic_tac_toe_12_10_2024.models.Board;
import org.example.low_level_design.lld3.tic_tac_toe_12_10_2024.models.Move;

public interface BotPlayingStrategy {

   Move botMove (Board board);
}
