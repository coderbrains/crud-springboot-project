package com.crud.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.crud.demo.constants.StudentEntityConstant;

@RestController
@RequestMapping(name = StudentEntityConstant.CONTROLLER_URL)
public class StudentController {

}
