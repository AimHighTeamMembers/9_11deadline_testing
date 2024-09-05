package com.ohgiraffers.crud.menu.controller;

import com.ohgiraffers.crud.menu.model.dto.MenuDTO;
import com.ohgiraffers.crud.menu.model.service.MenuService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping("/menu")
public class MenuController {

    private static final Logger logger = LogManager.getLogger(MenuController.class);

    private final MenuService menuService;
    private final MessageSource messageSource;

    @Autowired
    public MenuController(MenuService menuService, MessageSource messageSource) {

        this.menuService = menuService;
        this.messageSource = messageSource;

    }

    @GetMapping("regist")
    public void registPage() {}

    @PostMapping("regist")
    public String registMenu(MenuDTO newMenu, RedirectAttributes rAttr) {
        menuService.registNewMenu(newMenu);

        rAttr.addFlashAttribute("successMessage", "신규 메뉴 등록에 성공하셨습니다.");

        return "redirect:/menu/list";
    }

}