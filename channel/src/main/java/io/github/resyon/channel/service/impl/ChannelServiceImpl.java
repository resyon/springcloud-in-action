package io.github.resyon.channel.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import io.github.resyon.common.utils.PageUtils;
import io.github.resyon.common.utils.Query;

import io.github.resyon.channel.dao.ChannelDao;
import io.github.resyon.channel.entity.ChannelEntity;
import io.github.resyon.channel.service.ChannelService;


@Service("channelService")
public class ChannelServiceImpl extends ServiceImpl<ChannelDao, ChannelEntity> implements ChannelService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<ChannelEntity> page = this.page(
                new Query<ChannelEntity>().getPage(params),
                new QueryWrapper<ChannelEntity>()
        );

        return new PageUtils(page);
    }

}