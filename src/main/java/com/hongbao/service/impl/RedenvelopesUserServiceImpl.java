package com.hongbao.service.impl;

import com.hongbao.entity.RedenvelopesUser;
import com.hongbao.dao.RedenvelopesUserDao;
import com.hongbao.service.RedenvelopesUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (RedenvelopesUser)表服务实现类
 *
 * @author makejava
 * @since 2020-12-23 09:32:22
 */
@Service("redenvelopesUserService")
public class RedenvelopesUserServiceImpl implements RedenvelopesUserService {
    @Resource
    private RedenvelopesUserDao redenvelopesUserDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public RedenvelopesUser queryById(int id) {
        return this.redenvelopesUserDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<RedenvelopesUser> queryAllByLimit(int offset, int limit) {
        return this.redenvelopesUserDao.queryAllByLimit(offset, limit);
    }

    @Override
    public RedenvelopesUser login(String name, String pwd) {
        return this.redenvelopesUserDao.login(name,pwd);
    }

    /**
     * 新增数据
     *
     * @param redenvelopesUser 实例对象
     * @return 实例对象
     */
    @Override
    public RedenvelopesUser insert(RedenvelopesUser redenvelopesUser) {
        this.redenvelopesUserDao.insert(redenvelopesUser);
        return redenvelopesUser;
    }



    /**
     * 修改数据
     *
     * @param redenvelopesUser 实例对象
     * @return 实例对象
     */
    @Override
    public RedenvelopesUser update(RedenvelopesUser redenvelopesUser) {
        this.redenvelopesUserDao.update(redenvelopesUser);
        return this.queryById(redenvelopesUser.getUserid());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(int id) {
        return this.redenvelopesUserDao.deleteById(id) > 0;
    }
}