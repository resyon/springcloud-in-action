package io.github.resyon.question.controller;

import java.util.Arrays;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import io.github.resyon.question.entity.TypeEntity;
import io.github.resyon.question.service.TypeService;
import io.github.resyon.common.utils.PageUtils;
import io.github.resyon.common.utils.R;



/**
 * 题库-题目类型
 *
 * @author resyon
 * @email hirosakae7@gmail.com
 * @date 2023-02-13 15:39:17
 */
@RestController
@RequestMapping("question/type")
public class TypeController {
    @Autowired
    private TypeService typeService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    //@RequiresPermissions("question:type:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = typeService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    //@RequiresPermissions("question:type:info")
    public R info(@PathVariable("id") Long id){
            TypeEntity type = typeService.getById(id);

        return R.ok().put("type", type);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    //@RequiresPermissions("question:type:save")
    public R save(@RequestBody TypeEntity type){
            typeService.save(type);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    //@RequiresPermissions("question:type:update")
    public R update(@RequestBody TypeEntity type){
            typeService.updateById(type);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    //@RequiresPermissions("question:type:delete")
    public R delete(@RequestBody Long[] ids){
            typeService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
