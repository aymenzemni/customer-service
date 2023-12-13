package com.example.customer.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("CLIENT-SERVICE")
public interface HelloInterface {

    @GetMapping("client/hello")
    public String welcome();

    @GetMapping("client/helloClient")
    public String helloClient();

}
