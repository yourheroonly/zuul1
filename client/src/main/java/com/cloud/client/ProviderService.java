package com.cloud.client;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author mjp
 */
@RestController
public class ProviderService {

    @GetMapping("/provider/service/1")
    public String providerService1(){
        return "hello word!";
    }
}
