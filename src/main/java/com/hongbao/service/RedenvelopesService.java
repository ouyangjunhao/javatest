package com.hongbao.service;

import com.hongbao.entity.Redenvelopes;
import java.util.List;

/**
 * (Redenvelopes)表服务接口
 *
 * @author makejava
 * @since 2020-12-23 09:32:19
 */
public interface RedenvelopesService {

    /**
     * 通过ID查询单条数据
     *
     * @param  id 主键
     * @return 实例对象
     */
    Redenvelopes queryById(int id);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<Redenvelopes> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param redenvelopes 实例对象
     * @return 实例对象
     */
    Redenvelopes insert(Redenvelopes redenvelopes);

    /**
     * 修改数据
     *
     * @param redenvelopes 实例对象
     * @return 实例对象
     */
    Redenvelopes update(Redenvelopes redenvelopes);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(int id);

}