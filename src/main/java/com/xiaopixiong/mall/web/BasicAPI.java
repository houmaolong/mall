package com.xiaopixiong.mall.web;

import java.util.Map;

import com.google.common.collect.Maps;

/**
 * 基础API
 * 
 * @author houmaolong
 *
 */
public class BasicAPI {

	public Map<String, Object> SUCCESS() {
		Map<String, Object> result = Maps.newHashMap();
		result.put("code", 1);
		result.put("msg", "系统处理成功");
		return result;
	}

	public Map<String, Object> SUCCESS(Object data) {
		Map<String, Object> result = Maps.newHashMap();
		result.put("code", 1);
		result.put("msg", "系统处理成功");
		result.put("data", data);
		return result;
	}
}
