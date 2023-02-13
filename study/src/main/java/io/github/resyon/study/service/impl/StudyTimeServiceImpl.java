package io.github.resyon.study.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import io.github.resyon.common.utils.PageUtils;
import io.github.resyon.common.utils.Query;

import io.github.resyon.study.dao.StudyTimeDao;
import io.github.resyon.study.entity.StudyTimeEntity;
import io.github.resyon.study.service.StudyTimeService;


@Service("studyTimeService")
public class StudyTimeServiceImpl extends ServiceImpl<StudyTimeDao, StudyTimeEntity> implements StudyTimeService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<StudyTimeEntity> page = this.page(
                new Query<StudyTimeEntity>().getPage(params),
                new QueryWrapper<StudyTimeEntity>()
        );

        return new PageUtils(page);
    }

}