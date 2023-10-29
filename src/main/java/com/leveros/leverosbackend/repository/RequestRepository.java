package com.leveros.leverosbackend.repository;

import com.leveros.leverosbackend.entity.RequestEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Map;

@Repository
public interface RequestRepository extends JpaRepository <RequestEntity, Integer> {

    @Query(value = "SELECT " +
            "SUM(CASE WHEN r.status = '0' THEN 1 ELSE 0 END) AS qtdStatusAprovado, " +
            "SUM(CASE WHEN r.status = '1' THEN 1 ELSE 0 END) AS qtdStatusPendente, " +
            "SUM(CASE WHEN r.status = '2' THEN 1 ELSE 0 END) AS qtdStatusProcessando, " +
            "SUM(CASE WHEN r.status = '3' THEN 1 ELSE 0 END) AS qtdStatusCancelado, " +
            "SUM(1) AS qtdTotalPedidos " +
            "FROM request_entity r;", nativeQuery = true)
    Map<String, Long> getResumeStatus();

    @Query(value = "SELECT " +
            "SUM(r.price) AS totalSales " +
            "FROM request_entity r WHERE r.status != 3", nativeQuery = true)
    Double getTotalSales();
}
