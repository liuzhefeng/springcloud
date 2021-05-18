package com.zfliu.nacosconsumer.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by zfliu on 2021/5/18 16:59
 * Desc:
 */
@FeignClient("nacos-provider")
public interface ProviderClient
{
	@GetMapping("/hi")
	String hi(@RequestParam(value = "name", defaultValue = "zfliu", required = false) String name);
}
