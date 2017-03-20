package com.raojay.controller;

import com.raojay.domain.Items;
import com.raojay.service.ItemsService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by 隽 on 2017/3/18.
 */
@RequestMapping("/items")
@Controller
public class ItemsController
{
    @Resource
    private ItemsService itemsService;

    @RequestMapping("list")
    public String list(Model model)
    {
        List<Items> list=itemsService.findAll();
        model.addAttribute("itemsList",list);
        return "itemsList";
    }
}
