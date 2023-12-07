package com.authbase.controller;

import com.authbase.dto.response.TypeDemandResponse;
import com.authbase.service.DemandService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/api/demand")
public class DemandController {

    private final DemandService demandService;

    @GetMapping("/type")
    public List<TypeDemandResponse> getTypeDemand() {
        return demandService.getTypeDemand();
    }

}
