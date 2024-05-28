package com.chuvblocks.arquic4contribuyenteservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ContribuyenteService {
    @Autowired
    private RestTemplate restTemplate;

    public Boolean getApiResponse(String cedula) {
        String url = "https://srienlinea.sri.gob.ec/sri-catastro-sujeto-servicio-internet/rest/ConsolidadoContribuyente/existePorNumeroRuc?numeroRuc=" + cedula;
        return restTemplate.getForObject(url, Boolean.class);
    }
}
