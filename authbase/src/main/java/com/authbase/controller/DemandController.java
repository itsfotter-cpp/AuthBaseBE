package com.authbase.controller;

import com.authbase.dto.TypeDemandDto;
import com.authbase.dto.request.DemandRequest;
import com.authbase.dto.response.DemandResponse;
import com.authbase.service.IDemandService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/api/demand")
public class DemandController {

    private final IDemandService IDemandService;

    @GetMapping("/type")
    @ResponseStatus(HttpStatus.OK)
    public List<TypeDemandDto> getTypeDemand() {
        return IDemandService.getTypeDemand();
    }

    @PostMapping("/insert-demand")
    @ResponseStatus(HttpStatus.CREATED)
    public boolean insertNewDemand(@RequestBody @Valid DemandRequest demandRequest) {
        return IDemandService.insertNewDemandRequest(demandRequest);
    }

    @GetMapping("/manage-demands/{userName}")
    @ResponseStatus(HttpStatus.OK)
    public List<DemandResponse> manageDemands(@PathVariable("userName") String userName) {
        return IDemandService.manageDemands(userName);
    }

}
