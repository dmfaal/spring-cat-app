package com.example.demo.controllers

import com.example.demo.services.CatStorageService
import com.example.demo.services.SystemService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod


@Controller
class CatPageController(
        @Autowired private val catStorageService: CatStorageService,
        @Autowired private val systemService: SystemService,
) {

    @RequestMapping(value = ["/", "/index"], method = [RequestMethod.GET])
    fun index(model: Model): String? {
        model.addAttribute("cats", catStorageService.getCats())
        model.addAttribute("time", systemService.getTime());

        return "cat_list"
    }
}