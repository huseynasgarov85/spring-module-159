package com.example.springmodule159.client;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.data.domain.jaxb.SpringDataJaxb;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient(name = "trendshop",url ="https://localhost:8080/orders")
public interface MovesManagerClient {
    @GetMapping
     List<SpringDataJaxb.OrderDto> getOrders();
}
