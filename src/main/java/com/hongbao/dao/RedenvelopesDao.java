package com.hongbao.dao;

import com.hongbao.entity.Redenvelopes;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * (Redenvelopes)表数据库访问层
 *
 * @author makejava
 * @since 2020-12-23 09:32:18
 */

@Mapper
@Component
public interface RedenvelopesDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id  主键
     * @return 实例对象
     */
    Redenvelopes queryById(int id);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<Redenvelopes> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param redenvelopes 实例对象
     * @return 对象列表
     */
    List<Redenvelopes> queryAll(Redenvelopes redenvelopes);

    /**
     * 新增数据
     *
     * @param redenvelopes 实例对象
     * @return 影响行数
     */
    int insert(Redenvelopes redenvelopes);

    /**
     * 修改数据
     *
     * @param redenvelopes 实例对象
     * @return 影响行数
     */
    int update(Redenvelopes redenvelopes);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(int id);

}