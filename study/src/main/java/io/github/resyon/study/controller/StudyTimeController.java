package io.github.resyon.study.controller;

import io.github.resyon.common.utils.PageUtils;
import io.github.resyon.common.utils.R;
import io.github.resyon.study.entity.StudyTimeEntity;
import io.github.resyon.study.service.StudyTimeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.Map;



/**
 * 学习-用户学习时常表
 *
 * @author resyon
 * @email hirosakae7@gmail.com
 * @date 2023-02-13 16:19:16
 */
@RestController
@RequestMapping("study/studytime")
public class StudyTimeController {
    @Autowired
    private StudyTimeService studyTimeService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    //@RequiresPermissions("study:studytime:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = studyTimeService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    //@RequiresPermissions("study:studytime:info")
    public R info(@PathVariable("id") Long id){
            StudyTimeEntity studyTime = studyTimeService.getById(id);

        return R.ok().put("studyTime", studyTime);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    //@RequiresPermissions("study:studytime:save")
    public R save(@RequestBody StudyTimeEntity studyTime){
            studyTimeService.save(studyTime);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    //@RequiresPermissions("study:studytime:update")
    public R update(@RequestBody StudyTimeEntity studyTime){
            studyTimeService.updateById(studyTime);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    //@RequiresPermissions("study:studytime:delete")
    public R delete(@RequestBody Long[] ids){
            studyTimeService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
