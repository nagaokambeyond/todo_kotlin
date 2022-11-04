package com.example.demo.request

data class ToDoListRequest(
  val page: Int,
  var statusId: Long
)
