package com.huy.controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.Buffer;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.huy.entity.Nhanvien;

@Controller
public class TrangChuController {
	@RequestMapping("/")
	public ModelAndView Trangchu() {
		ModelAndView viewtrangchu=new ModelAndView();
		viewtrangchu.setViewName("trangchu");
		String username ="Tran Duc Huy";
		String password="123456";
		
		viewtrangchu.addObject("tendangnhap",username);
		viewtrangchu.addObject("Matkhau",password);
		return viewtrangchu;
	}
}
 