package org.example.low_level_design.lld2.strategy.assignment.refactoring_pricing_calculation;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class RideDetails {
    private double distance; // Distance in kilometers
    private int duration; // Duration in minutes
}