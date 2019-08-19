package com.huy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.huy.entity.Nhanvien;

@Controller
@RequestMapping("/chitiet")
public class ChiTietController {
	@GetMapping
	public String deFault() {
		return ("chitiet");
	}
	@PostMapping
	public String HienThiThongTinNguoiDung(@ModelAttribute Nhanvien nv, ModelMap modelmap) {
		modelmap.addAttribute("nv",nv);
		return "chitiet";
	}
	
}
