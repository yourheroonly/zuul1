package com.cloud.client;

import org.springframework.util.Base64Utils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Base64;
import java.util.Date;

/**
 * @author mjp
 */
@RestController
public class ProviderService {

    @GetMapping("/provider/service/1")
    public String providerService1(@RequestParam String paramJson) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println("paramJson:"+paramJson+"\n"+"base64Decoder:"+ Base64Utils.decodeFromString(paramJson));
        System.out.println(dateFormat.format(System.currentTimeMillis()) + "--被调用-----------------------");
        return "hello word!";
    }
}
