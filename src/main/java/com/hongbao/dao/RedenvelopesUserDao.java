package com.hongbao.dao;

import com.hongbao.entity.RedenvelopesUser;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * (RedenvelopesUser)表数据库访问层
 *
 * @author makejava
 * @since 2020-12-23 09:32:22
 */

@Mapper
@Component
public interface RedenvelopesUserDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    RedenvelopesUser queryById(int id);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<RedenvelopesUser> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param redenvelopesUser 实例对象
     * @return 对象列表
     */
    List<RedenvelopesUser> queryAll(RedenvelopesUser redenvelopesUser);

    /**
     * 登录
     * @param name
     * @param pwd
     * @return
     */
    RedenvelopesUser login(String name,String pwd);

    /**
     * 新增数据
     *
     * @param redenvelopesUser 实例对象
     * @return 影响行数
     */
    int insert(RedenvelopesUser redenvelopesUser);

    /**
     * 修改数据
     *
     * @param redenvelopesUser 实例对象
     * @return 影响行数
     */
    int update(RedenvelopesUser redenvelopesUser);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(int id);

}