package com.hongbao.service;

import com.hongbao.entity.RedenvelopesUser;
import java.util.List;

/**
 * (RedenvelopesUser)表服务接口
 *
 * @author makejava
 * @since 2020-12-23 09:32:22
 */
public interface RedenvelopesUserService {

    /**
     * 通过ID查询单条数据
     *
     * @param id  主键
     * @return 实例对象
     */
    RedenvelopesUser queryById(int id);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<RedenvelopesUser> queryAllByLimit(int offset, int limit);

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
     * @return 实例对象
     */
    RedenvelopesUser insert(RedenvelopesUser redenvelopesUser);

    /**
     * 修改数据
     *
     * @param redenvelopesUser 实例对象
     * @return 实例对象
     */
    RedenvelopesUser update(RedenvelopesUser redenvelopesUser);

    /**
     * 通过主键删除数据
     *
     * @param id  主键
     * @return 是否成功
     */
    boolean deleteById(int id);

}