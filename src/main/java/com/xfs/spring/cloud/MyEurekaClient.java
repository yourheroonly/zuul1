package com.xfs.spring.cloud;

import com.netflix.appinfo.InstanceInfo;
import com.netflix.discovery.EurekaClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;

import java.util.List;

/**
 * @author mjp
 */
public class MyEurekaClient {

    @Autowired
    private EurekaClient eurekaClient;

    public String serviceUrl() {
        InstanceInfo instance = eurekaClient.getNextServerFromEureka("STORES", false);

        List<ServiceInstance> list = eurekaClient.getInstancesById("STORES");
        if (list != null && list.size() > 0 ) {
            return list.get(0).getUri().toString();
        }
//        RsaKeyConvert.PrivateKeyPkcs1ToPkcs8();
        return instance.getHomePageUrl();
    }
}
