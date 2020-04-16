package com.health.controller;



import com.alibaba.dubbo.config.annotation.Reference;
import com.health.pojo.CheckItem;
import com.health.response.Result;
import com.health.service.CheckItemService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("checkitem")
public class CheckItemController {

    //用来注入分布式远程服务对象,一般配合dubbo使用
    @Reference
    private CheckItemService checkItemService;

    @GetMapping
    public Result<List<CheckItem>> findAll(){
        return checkItemService.findAll();
    }
}
