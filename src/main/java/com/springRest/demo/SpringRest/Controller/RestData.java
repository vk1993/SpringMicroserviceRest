package com.springRest.demo.SpringRest.Controller;

import java.util.Map;

import javax.servlet.http.HttpServletResponse;
import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.springRest.demo.SpringRest.service.RestServiceEnd;
import com.springRest.demo.SpringRest.utility.BadRequest;

@RestController
@RequestMapping("/api")
public class RestData {

	@Autowired
	RestServiceEnd restServiceEnd;

	@GetMapping(value = "/Fibonacci")
	@ResponseStatus(value = HttpStatus.OK)
	public int getNthFibonacci(@PathParam(value = "n") Long n, HttpServletResponse response) throws BadRequest {
		if (n instanceof Long && n > 0) {
			response.setHeader("pragma", "no-cache");
			response.setHeader("expires", "-1");
			response.setContentLength(122);
			return restServiceEnd.getNthFebbonic(n);
		} else {

			throw new BadRequest("enter valid url");
		}
	}

	@GetMapping(value = "/ReverseWords")
	@ResponseStatus(value = HttpStatus.OK)
	public String getReverse(@PathParam(value = "sentence") String sentence, HttpServletResponse response)
			throws BadRequest {
		if (sentence instanceof String && sentence != "") {
			response.setHeader("pragma", "no-cache");
			response.setHeader("expires", "-1");
			response.setContentLength(131);
			return restServiceEnd.getReverse(sentence);
		} else {
			throw new BadRequest("Bad Request");
		}
	}

	@GetMapping(value = "/TriangleType")
	@ResponseStatus(value = HttpStatus.OK)
	public String getTriangle(@PathParam(value = "a") int a, @PathParam(value = "b") int b,
			@PathParam(value = "c") int c, HttpServletResponse response) throws BadRequest {
		if (a <= 0 || b <= 0 || c <= 0) {
			throw new BadRequest("enter valied url");
		}
		response.setHeader("pragma", "no-cache");
		response.setHeader("expires", "-1");
		response.setContentLength(131);
		return restServiceEnd.getTriangle(a, b, c);
	}

	@PostMapping(value = "/makeonearray")
	@ResponseStatus(value = HttpStatus.OK)
	public Map<String, Integer[]> makeOneArray(@RequestBody Map<String, Integer[]> array, HttpServletResponse response)
			throws BadRequest {
		response.setHeader("pragma", "no-cache");
		response.setHeader("expires", "-1");
		response.setContentLength(131);
		
		return restServiceEnd.getArray(array);
	}

}
