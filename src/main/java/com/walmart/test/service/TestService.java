package com.walmart.test.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class TestService {

	private static final Logger log = LoggerFactory.getLogger(TestService.class);

	public Map<String, Integer>countString(List<String> arrayA, List<String> arrayB) {
			
		Map<String, Integer> map = new HashMap<String, Integer>();

		for (String element: arrayA) {
			if (arrayB.contains(element)) {
				map.merge(element, 1, Integer::sum);
			} 

		}
		
		log.info(map.toString());
		return map;
	}
}
