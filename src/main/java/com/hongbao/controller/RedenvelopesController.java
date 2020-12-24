package com.hongbao.controller;

import com.hongbao.entity.Redenvelopes;
import com.hongbao.service.RedenvelopesService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (Redenvelopes)表控制层
 *
 * @author makejava
 * @since 2020-12-23 09:32:20
 */
@RestController
@RequestMapping("redenvelopes")
public class RedenvelopesController {
    /**
     * 服务对象
     */
    @Resource
    private RedenvelopesService redenvelopesService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public Redenvelopes selectOne(int id) {
        return this.redenvelopesService.queryById(id);
    }

}