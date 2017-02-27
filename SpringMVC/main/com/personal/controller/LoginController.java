package com.personal.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.HttpServerErrorException;

@Controller
@RequestMapping("/login")
public class LoginController {

	/**
	 * 跳转至登录页
	 * @return
	 */
	@RequestMapping("")
	public String toLogin(HttpServletRequest request){

		return "login";
	}
}
