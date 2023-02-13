package io.github.resyon.channel.service;

import com.baomidou.mybatisplus.extension.service.IService;
import io.github.resyon.common.utils.PageUtils;
import io.github.resyon.channel.entity.AccessTokenEntity;

import java.util.Map;

/**
 * 渠道-认证表
 *
 * @author resyon
 * @email hirosakae7@gmail.com
 * @date 2023-02-13 16:11:15
 */
public interface AccessTokenService extends IService<AccessTokenEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

