package io.fatec.integration;

import io.fatec.integration.adapter.FormulaintegrationAdapter;
import io.fatec.integration.client.FormulaClient;
import io.fatec.integration.client.dto.FormulaDto;
import io.fatec.model.DriverModel;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class FormulaIntegrationImpl implements FormulaIntegration {

    private final FormulaClient formulaClient;

    public FormulaIntegrationImpl(FormulaClient formulaClient) {
        this.formulaClient = formulaClient;
    }

    @Override
    public DriverModel consultarDriver(Integer numero) {
        List<FormulaDto> formula = formulaClient.getFormula(numero);
        return FormulaintegrationAdapter.cast(formula) ;
    }
}
