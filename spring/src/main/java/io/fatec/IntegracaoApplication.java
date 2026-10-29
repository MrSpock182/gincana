package io.fatec;

import io.fatec.integration.FormulaIntegration;
import io.fatec.model.DriverModel;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class IntegracaoApplication implements CommandLineRunner {

	private final FormulaIntegration formulaIntegration;

	public IntegracaoApplication(FormulaIntegration formulaIntegration) {
		this.formulaIntegration = formulaIntegration;
	}

	@Override
	public void run(String... args) throws Exception {
		DriverModel driverModel = formulaIntegration.consultarDriver(1);
		System.out.println(driverModel.toString());

	}

	public static void main(String[] args) {
		SpringApplication.run(IntegracaoApplication.class, args);
	}

}
