package com.hongbao.service.impl;

import com.hongbao.entity.Redenvelopes;
import com.hongbao.dao.RedenvelopesDao;
import com.hongbao.service.RedenvelopesService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Redenvelopes)表服务实现类
 *
 * @author makejava
 * @since 2020-12-23 09:32:20
 */
@Service("redenvelopesService")
public class RedenvelopesServiceImpl implements RedenvelopesService {
    @Resource
    private RedenvelopesDao redenvelopesDao;

    /**
     * 通过ID查询单条数据
     *
     * @param  id  主键
     * @return 实例对象
     */
    @Override
    public Redenvelopes queryById(int id) {
        return this.redenvelopesDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<Redenvelopes> queryAllByLimit(int offset, int limit) {
        return this.redenvelopesDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param redenvelopes 实例对象
     * @return 实例对象
     */
    @Override
    public Redenvelopes insert(Redenvelopes redenvelopes) {
        this.redenvelopesDao.insert(redenvelopes);
        return redenvelopes;
    }

    /**
     * 修改数据
     *
     * @param redenvelopes 实例对象
     * @return 实例对象
     */
    @Override
    public Redenvelopes update(Redenvelopes redenvelopes) {
        this.redenvelopesDao.update(redenvelopes);
        return this.queryById(redenvelopes.getRedenvelopesid());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(int id) {
        return this.redenvelopesDao.deleteById(id) > 0;
    }
}