package com.example.demo.service

import com.example.demo.request.ToDoListRequest
import com.example.demo.response.ToDoListResponse

interface ToDoService {
  fun getList(condition: ToDoListRequest): ToDoListResponse
}
