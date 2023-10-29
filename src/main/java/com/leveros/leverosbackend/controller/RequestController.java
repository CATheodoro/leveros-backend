package com.leveros.leverosbackend.controller;

import com.leveros.leverosbackend.entity.RequestEntity;
import com.leveros.leverosbackend.service.RequestService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import javax.validation.Valid;
import java.net.URI;
import java.util.Map;

@RestController
@RequestMapping("/pedidos")
public class RequestController {

    RequestService requestService;

    public RequestController(RequestService requestService) {
        this.requestService = requestService;
    }

    @PostMapping
    public  ResponseEntity<RequestEntity> save(@RequestBody @Valid RequestEntity request, UriComponentsBuilder uriComponentsBuilder){
        RequestEntity requestEntity = requestService.save(request);
        URI uri = uriComponentsBuilder.path("/pedidos/{id}").buildAndExpand(requestEntity.getId()).toUri();
        return ResponseEntity.created(uri).body(requestEntity);
    }

    @GetMapping
    @CrossOrigin
    public ResponseEntity<Page<RequestEntity>> getAll(@PageableDefault(size = 30) Pageable pageable){
        Page<RequestEntity> requestEntity = requestService.findAll(pageable);
        return ResponseEntity.ok(requestEntity);
    }

    @GetMapping("/resumoStatus")
    @CrossOrigin
    public Map<String, Long> getresumoStatus(){
        return requestService.getResumeStatus();
    }

    @GetMapping("/totalVendas")
    @CrossOrigin
    public ResponseEntity<?> getTotalSales(){
        Object totalSales = requestService.getTotalSales();
        return ResponseEntity.ok(totalSales);
    }

}
