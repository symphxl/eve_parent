package com.health.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.health.mapper.CheckItemMapper;
import com.health.pojo.CheckItem;
import com.health.response.Result;
import com.health.response.constant.MessageConstant;
import com.health.service.CheckItemService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Service(interfaceClass = CheckItemService.class)/*注意:1.@Service注解是dubbo包下的;2.涉及到事务,需要添加当前接口的class(interfaceClass = CheckItemService.class)*/
public class CheckItemServiceImpl implements CheckItemService {

    @Autowired
    private CheckItemMapper checkItemMapper;

    /**
     * 查询所有检查项
     *
     * @return
     */
    @Override
    public Result<List<CheckItem>> findAll() {
        List<CheckItem> checkItems = checkItemMapper.findAll();
        if (checkItems == null || checkItems.size() == 0)//校验返回结果是否有值
            return new Result<>("对不起,无相关信息");
        //返回封装结果
        return new Result<>(true, MessageConstant.QUERY_CHECKITEM_SUCCESS, checkItems);
    }
}
