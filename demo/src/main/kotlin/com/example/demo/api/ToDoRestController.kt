package com.example.demo.api

import com.example.demo.request.ToDoListRequest
import com.example.demo.response.ToDoListResponse
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping("/api/v1/todos")
class ToDoRestController {

  fun getToDoList(condition: ToDoListRequest): ResponseEntity<ToDoListResponse> {


  }
}
