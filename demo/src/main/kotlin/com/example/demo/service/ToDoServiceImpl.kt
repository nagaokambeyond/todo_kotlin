package com.example.demo.service

import com.example.demo.request.ToDoListRequest
import com.example.demo.response.ToDoListResponse
import org.springframework.stereotype.Service

@Service
class ToDoServiceImpl : ToDoService {
  override fun getList(condition: ToDoListRequest): ToDoListResponse {
    TODO("Not yet implemented")
  }
}
