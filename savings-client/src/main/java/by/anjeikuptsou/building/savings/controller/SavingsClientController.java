package by.anjeikuptsou.building.savings.controller;

import by.anjeikuptsou.building.savings.client.ContractorService;
import by.anjeikuptsou.building.savings.domain.Contractor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
public class SavingsClientController {
    private final ContractorService contractorService;

    @Autowired
    public SavingsClientController(ContractorService contractorService) {
        this.contractorService = contractorService;
    }

    @RequestMapping(value = "/contractors", method = RequestMethod.GET)
    public List<Contractor> getAllContractors() {
        return this.contractorService.findAll(null);
    }
}
