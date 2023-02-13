package io.github.resyon.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import io.github.resyon.common.utils.PageUtils;
import io.github.resyon.member.entity.GrowthChangeHistoryEntity;

import java.util.Map;

/**
 * 用户-积分值变化历史
 *
 * @author resyon
 * @email hirosakae7@gmail.com
 * @date 2023-02-13 16:02:31
 */
public interface GrowthChangeHistoryService extends IService<GrowthChangeHistoryEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

