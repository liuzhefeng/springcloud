package com.zfliu.nacosprovider.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by zfliu on 2021/5/18 17:21
 * Desc:
 */
@RestController
@RefreshScope
public class ConfigController
{
	@Value("${username:lily}")
	private String username;

	@RequestMapping("/username")
	public String get()
	{
		return username;
	}
}
