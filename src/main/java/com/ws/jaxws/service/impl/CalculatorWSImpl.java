package com.ws.jaxws.service.impl;

import javax.jws.WebService;

import com.ws.jaxws.service.CalculatorWS;

@WebService(endpointInterface = "com.ws.jaxws.service.CalculatorWS")
public class CalculatorWSImpl implements CalculatorWS {

	@Override
	public int add(int... numbers) {

		int sum = 0;

		for (int i : numbers) {

			sum += i;

		}

		return sum;
	}

}
