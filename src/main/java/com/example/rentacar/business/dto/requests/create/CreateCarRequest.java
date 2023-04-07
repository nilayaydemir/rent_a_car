package com.example.rentacar.business.dto.requests.create;

import com.example.rentacar.entities.State;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CreateCarRequest {
    private int modelId;
    private int modelYear ;
    private String plate;
    private State state;
    private double dailyPrice;
}
