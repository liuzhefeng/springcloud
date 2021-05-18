package com.zfliu.nacosprovider.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by zfliu on 2021/5/18 16:39
 * Desc:
 */
@RestController
public class ProviderController
{
	@GetMapping("/hi")
	public String hi(@RequestParam(value = "name", defaultValue = "zfliu", required = false) String name)
	{
		return "hi " + name;
	}
}
