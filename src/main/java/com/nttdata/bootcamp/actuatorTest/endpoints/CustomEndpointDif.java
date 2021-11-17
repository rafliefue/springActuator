package com.nttdata.bootcamp.actuatorTest.endpoints;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.actuate.endpoint.annotation.DeleteOperation;
import org.springframework.boot.actuate.endpoint.annotation.Endpoint;
import org.springframework.boot.actuate.endpoint.annotation.ReadOperation;
import org.springframework.boot.actuate.endpoint.annotation.Selector;
import org.springframework.boot.actuate.endpoint.annotation.WriteOperation;
import org.springframework.stereotype.Component;


@Component
@Endpoint(id = "cosas")
public class CustomEndpointDif {
	
	private List<String> lista = new ArrayList<>();
	
	@ReadOperation
	public List<String> Cosas(){
		return lista;
	}
	
	@WriteOperation
	public void writeOperation(@Selector String nuevaCosa){
		lista.add(nuevaCosa);
	}
	
	
	@DeleteOperation
	public void deleteOperation(@Selector String nuevaCosa){
		lista.remove(nuevaCosa);
	}
	
	
	

}
