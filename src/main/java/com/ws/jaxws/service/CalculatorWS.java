package com.ws.jaxws.service;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public interface CalculatorWS {

	@WebMethod(operationName = "add")
	public int add(int... numbers);
	

}
