package io.github.resyon.content.controller;

import io.github.resyon.common.utils.PageUtils;
import io.github.resyon.common.utils.R;
import io.github.resyon.content.entity.NewEntity;
import io.github.resyon.content.service.NewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.Map;



/**
 * 内容-咨询表
 *
 * @author resyon
 * @email hirosakae7@gmail.com
 * @date 2023-02-13 15:45:33
 */
@RestController
@RequestMapping("content/new")
public class NewController {
    @Autowired
    private NewService newService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    //@RequiresPermissions("content:new:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = newService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    //@RequiresPermissions("content:new:info")
    public R info(@PathVariable("id") Long id){
            NewEntity ne = newService.getById(id);

        return R.ok().put("new", ne);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    //@RequiresPermissions("content:new:save")
    public R save(@RequestBody NewEntity ne){
            newService.save(ne);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    //@RequiresPermissions("content:new:update")
    public R update(@RequestBody NewEntity ne){
            newService.updateById(ne);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    //@RequiresPermissions("content:new:delete")
    public R delete(@RequestBody Long[] ids){
            newService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
