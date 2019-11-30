package com.lxl.api;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
@FeignClient(name = "CLIENT2")
public interface TestClient2Api {

    @RequestMapping("test2")
    public String test01();
}
