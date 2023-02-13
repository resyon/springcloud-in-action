package io.github.resyon.content.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import io.github.resyon.common.utils.PageUtils;
import io.github.resyon.common.utils.Query;

import io.github.resyon.content.dao.NewDao;
import io.github.resyon.content.entity.NewEntity;
import io.github.resyon.content.service.NewService;


@Service("newService")
public class NewServiceImpl extends ServiceImpl<NewDao, NewEntity> implements NewService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<NewEntity> page = this.page(
                new Query<NewEntity>().getPage(params),
                new QueryWrapper<NewEntity>()
        );

        return new PageUtils(page);
    }

}