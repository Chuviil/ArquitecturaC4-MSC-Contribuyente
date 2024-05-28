package com.chuvblocks.arquic4contribuyenteservice.controller;

import com.chuvblocks.arquic4contribuyenteservice.service.ContribuyenteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ContribuyenteController {
    @Autowired
    private ContribuyenteService contribuyenteService;

    @GetMapping("/contribuyente")
    public Boolean getContribuyente(@RequestParam(value = "cedula") String cedula) {
        return contribuyenteService.getApiResponse(cedula);
    }
}
