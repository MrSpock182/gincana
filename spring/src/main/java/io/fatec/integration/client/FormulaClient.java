package io.fatec.integration.client;

import io.fatec.integration.client.dto.FormulaDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name = "Openf1" , url = "https://api.openf1.org/v1")
public interface FormulaClient {

    @GetMapping(value = "drivers?driver_number={id}&session_key=9158")
    List<FormulaDto> getFormula(@PathVariable("id") Integer id);

}
