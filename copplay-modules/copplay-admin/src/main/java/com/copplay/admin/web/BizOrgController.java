package com.copplay.admin.web;

import cn.dev33.satoken.annotation.SaCheckPermission;
import cn.hutool.core.lang.tree.Tree;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.copplay.admin.param.*;
import com.copplay.admin.service.BizOrgService;
import com.copplay.admin.web.param.*;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.annotation.Resource;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotEmpty;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.copplay.admin.domain.BizOrg;
import vip.xiaonuo.biz.modular.org.param.*;
import com.copplay.admin.domain.BizUser;
import com.copplay.common.annotation.CommonLog;
import com.copplay.common.domain.CommonResult;

import java.util.List;

/**
 * 机构控制器
 *
 * @author xuyuxiang
 * @date 2022/4/24 19:55
 */
@Tag(name = "机构控制器")
@RestController
@Validated
public class BizOrgController {

    @Resource
    private BizOrgService bizOrgService;

    /**
     * 获取机构分页
     *
     * @author xuyuxiang
     * @date 2022/4/24 20:00
     */
    @Operation(summary = "获取机构分页")
    @SaCheckPermission("/biz/org/page")
    @GetMapping("/biz/org/page")
    public CommonResult<Page<BizOrg>> page(BizOrgPageParam bizOrgPageParam) {
        return CommonResult.data(bizOrgService.page(bizOrgPageParam));
    }

    /**
     * 获取机构树
     *
     * @author xuyuxiang
     * @date 2022/4/24 20:00
     */
    @Operation(summary = "获取机构树")
    @SaCheckPermission("/biz/org/tree")
    @GetMapping("/biz/org/tree")
    public CommonResult<List<Tree<String>>> tree() {
        return CommonResult.data(bizOrgService.tree());
    }

    /**
     * 添加机构
     *
     * @author xuyuxiang
     * @date 2022/4/24 20:47
     */
    @Operation(summary = "添加机构")
    @CommonLog("添加机构")
    @SaCheckPermission("/biz/org/add")
    @PostMapping("/biz/org/add")
    public CommonResult<String> add(@RequestBody @Valid BizOrgAddParam bizOrgAddParam) {
        bizOrgService.add(bizOrgAddParam);
        return CommonResult.ok();
    }

    /**
     * 编辑机构
     *
     * @author xuyuxiang
     * @date 2022/4/24 20:47
     */
    @Operation(summary = "编辑机构")
    @CommonLog("编辑机构")
    @SaCheckPermission("/biz/org/edit")
    @PostMapping("/biz/org/edit")
    public CommonResult<String> edit(@RequestBody @Valid BizOrgEditParam bizOrgEditParam) {
        bizOrgService.edit(bizOrgEditParam);
        return CommonResult.ok();
    }

    /**
     * 删除机构
     *
     * @author xuyuxiang
     * @date 2022/4/24 20:00
     */
    @Operation(summary = "删除机构")
    @CommonLog("删除机构")
    @SaCheckPermission("/biz/org/delete")
    @PostMapping("/biz/org/delete")
    public CommonResult<String> delete(@RequestBody @Valid @NotEmpty(message = "集合不能为空")
                                                   List<BizOrgIdParam> bizOrgIdParamList) {
        bizOrgService.delete(bizOrgIdParamList);
        return CommonResult.ok();
    }

    /**
     * 获取机构详情
     *
     * @author xuyuxiang
     * @date 2022/4/24 20:00
     */
    @Operation(summary = "获取机构详情")
    @SaCheckPermission("/biz/org/detail")
    @GetMapping("/biz/org/detail")
    public CommonResult<BizOrg> detail(@Valid BizOrgIdParam bizOrgIdParam) {
        return CommonResult.data(bizOrgService.detail(bizOrgIdParam));
    }

    /* ====机构部分所需要用到的选择器==== */

    /**
     * 获取机构树选择器
     *
     * @author xuyuxiang
     * @date 2022/4/24 20:00
     */
    @Operation(summary = "获取机构树选择器")
    @SaCheckPermission("/biz/org/orgTreeSelector")
    @GetMapping("/biz/org/orgTreeSelector")
    public CommonResult<List<Tree<String>>> orgTreeSelector() {
        return CommonResult.data(bizOrgService.orgTreeSelector());
    }

    /**
     * 获取人员选择器
     *
     * @author xuyuxiang
     * @date 2022/4/24 20:00
     */
    @Operation(summary = "获取人员选择器")
    @SaCheckPermission("/biz/org/userSelector")
    @GetMapping("/biz/org/userSelector")
    public CommonResult<Page<BizUser>> userSelector(BizOrgSelectorUserParam bizOrgSelectorUserParam) {
        return CommonResult.data(bizOrgService.userSelector(bizOrgSelectorUserParam));
    }
}
