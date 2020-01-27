package by.anjeikuptsou.savings.contractor.controller;

import by.anjeikuptsou.savings.contractor.domain.Contractor;
import by.anjeikuptsou.savings.contractor.repository.ContractorRepository;
import by.anjeikuptsou.savings.contractor.service.ContractorService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping(value = "/contractors")
public class ContractorController {
    @Autowired
    private ContractorService contractorService;

    @RequestMapping(method = RequestMethod.GET)
    public List<Contractor> findAll(@RequestParam(name = "personalNumber", required = false)String personalNumber) {
        return this.contractorService.findAll(personalNumber);
    }
}
