package com.nttdata.bootcamp.actuatorTest.endpoints;

import org.springframework.boot.actuate.endpoint.web.annotation.RestControllerEndpoint;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;

@Component
@RestControllerEndpoint(id = "customEndpoint")
public class CustomEndpoint {
	
	@GetMapping("/")
	public ResponseEntity<String> customEndPointBase(){
		return new ResponseEntity<>("TextoBase", HttpStatus.OK);
	}
	
	@GetMapping("/random")
	public ResponseEntity<String> customEndPoint(){
		return new ResponseEntity<>("Prueba endpoint", HttpStatus.OK);
	}

}
