package io.fatec.integration.adapter;

import io.fatec.integration.client.dto.FormulaDto;
import io.fatec.model.DriverModel;

import java.util.List;

public class FormulaintegrationAdapter {

    private FormulaintegrationAdapter() {
    }

    public static DriverModel cast(List<FormulaDto> formula) {
        FormulaDto v = formula.get(0);

        return new DriverModel(
                v.lastName(),
                v.teamName(),
                v.driverNumber()
        );

    }
}
