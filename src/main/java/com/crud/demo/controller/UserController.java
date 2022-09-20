package com.crud.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.crud.demo.constants.UserEntityConstants;

@RestController
@RequestMapping(name = UserEntityConstants.CONTROLLER_URL)
public class UserController {

}
