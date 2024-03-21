package com.enigma.belajar_rest_template.controller;

import com.enigma.belajar_rest_template.dto.Todo;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/api/todos")
public class TodoController {

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> getTodos() {
        RestTemplate restTemplate = new RestTemplate();
        return  restTemplate.getForEntity("https://eea3-182-253-61-241.ngrok-free.app/api/todos", String.class);
    }

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> postTodos(@RequestBody Todo todo) {
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.postForEntity("https://eea3-182-253-61-241.ngrok-free.app/api/todos", todo, String.class);
    }

    @DeleteMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public void deleteTodo(@PathVariable String id) {
        RestTemplate restTemplate = new RestTemplate();
        restTemplate.delete("https://eea3-182-253-61-241.ngrok-free.app/api/todos/", id);
    }
}
