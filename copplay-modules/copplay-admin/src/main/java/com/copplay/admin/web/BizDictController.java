package com.copplay.admin.web;

import cn.dev33.satoken.annotation.SaCheckPermission;
import cn.hutool.core.lang.tree.Tree;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.annotation.Resource;
import jakarta.validation.Valid;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.copplay.admin.domain.BizDict;
import com.copplay.admin.web.param.BizDictEditParam;
import com.copplay.admin.web.param.BizDictPageParam;
import com.copplay.admin.service.BizDictService;
import com.copplay.common.annotation.CommonLog;
import com.copplay.common.domain.CommonResult;

import java.util.List;

/**
 * 业务字典控制器
 *
 * @author xuyuxiang
 * @date 2022/6/21 14:58
 **/
@Tag(name = "业务字典控制器")
@RestController
@Validated
public class BizDictController {

    @Resource
    private BizDictService bizDictService;

    /**
     * 获取业务字典分页
     *
     * @author xuyuxiang
     * @date 2022/4/24 20:00
     */
    @Operation(summary = "获取业务字典分页")
    @SaCheckPermission("/biz/dict/page")
    @GetMapping("/biz/dict/page")
    public CommonResult<Page<BizDict>> page(BizDictPageParam bizDictPageParam) {
        return CommonResult.data(bizDictService.page(bizDictPageParam));
    }

    /**
     * 获取业务字典树
     *
     * @author xuyuxiang
     * @date 2022/4/24 20:00
     */
    @Operation(summary = "获取业务字典树")
    @SaCheckPermission("/biz/dict/tree")
    @GetMapping("/biz/dict/tree")
    public CommonResult<List<Tree<String>>> tree() {
        return CommonResult.data(bizDictService.tree());
    }

    /**
     * 获取所有字典树
     *
     * @author xuyuxiang
     * @date 2022/4/24 20:00
     */
    @Operation(summary = "获取所有字典树")
    @GetMapping("/biz/dict/treeAll")
    public CommonResult<List<Tree<String>>> treeAll() {
        return CommonResult.data(bizDictService.treeAll());
    }

    /**
     * 编辑业务字典
     *
     * @author xuyuxiang
     * @date 2022/4/24 20:47
     */
    @Operation(summary = "编辑业务字典")
    @CommonLog("编辑业务字典")
    @SaCheckPermission("/biz/dict/edit")
    @PostMapping("/biz/dict/edit")
    public CommonResult<String> edit(@RequestBody @Valid BizDictEditParam bizDictEditParam) {
        bizDictService.edit(bizDictEditParam);
        return CommonResult.ok();
    }
}
