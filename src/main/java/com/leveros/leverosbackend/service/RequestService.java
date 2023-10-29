package com.leveros.leverosbackend.service;

import com.leveros.leverosbackend.entity.RequestEntity;
import com.leveros.leverosbackend.repository.RequestRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class RequestService {

    RequestRepository requestRepository;

    public RequestService(RequestRepository requestRepository) {
        this.requestRepository = requestRepository;
    }


    public RequestEntity save(RequestEntity request) {
        return requestRepository.save(request);
    }

    public Page<RequestEntity> findAll(Pageable pageable) {
        return requestRepository.findAll(pageable);
    }

    public Map<String, Long> getResumeStatus() {
        return requestRepository.getResumeStatus();
    }

    public Object getTotalSales() {
        Map<String, Object> resultMap = new HashMap<>();
        resultMap.put("totalSales", requestRepository.getTotalSales());
        return resultMap;
    }
}
