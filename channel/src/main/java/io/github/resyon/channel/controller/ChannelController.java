package io.github.resyon.channel.controller;

import io.github.resyon.channel.entity.ChannelEntity;
import io.github.resyon.channel.service.ChannelService;
import io.github.resyon.common.utils.PageUtils;
import io.github.resyon.common.utils.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.Map;



/**
 * 渠道-渠道表
 *
 * @author resyon
 * @email hirosakae7@gmail.com
 * @date 2023-02-13 16:11:15
 */
@RestController
@RequestMapping("channel/channel")
public class ChannelController {
    @Autowired
    private ChannelService channelService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    //@RequiresPermissions("channel:channel:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = channelService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    //@RequiresPermissions("channel:channel:info")
    public R info(@PathVariable("id") Long id){
            ChannelEntity channel = channelService.getById(id);

        return R.ok().put("channel", channel);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    //@RequiresPermissions("channel:channel:save")
    public R save(@RequestBody ChannelEntity channel){
            channelService.save(channel);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    //@RequiresPermissions("channel:channel:update")
    public R update(@RequestBody ChannelEntity channel){
            channelService.updateById(channel);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    //@RequiresPermissions("channel:channel:delete")
    public R delete(@RequestBody Long[] ids){
            channelService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
