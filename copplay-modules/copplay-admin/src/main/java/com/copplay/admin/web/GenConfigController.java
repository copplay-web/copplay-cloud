package com.copplay.admin.web;

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
import com.copplay.common.annotation.CommonLog;
import com.copplay.common.domain.CommonResult;
import com.copplay.admin.domain.GenConfig;
import com.copplay.admin.web.param.GenConfigEditParam;
import com.copplay.admin.web.param.GenConfigIdParam;
import com.copplay.admin.web.param.GenConfigListParam;
import com.copplay.admin.service.GenConfigService;

import java.util.List;


@Validated
@RestController
@Tag(name = "代码生成详细配置控制器")
public class GenConfigController {

    @Resource
    private GenConfigService genConfigService;

    @Operation(summary = "获取代码生成详细配置分页")
    @GetMapping("/gen/config/list")
    public CommonResult<List<GenConfig>> list(GenConfigListParam genConfigListParam) {
        return CommonResult.data(genConfigService.list(genConfigListParam));
    }

    @Operation(summary = "编辑代码生成详细配置")
    @CommonLog("编辑代码生成详细配置")
    @PostMapping("/gen/config/edit")
    public CommonResult<String> edit(@RequestBody @Valid GenConfigEditParam genConfigEditParam) {
        genConfigService.edit(genConfigEditParam);
        return CommonResult.ok();
    }

    @Operation(summary = "删除代码生成详细配置")
    @CommonLog("删除代码生成详细配置")
    @PostMapping("/gen/config/delete")
    public CommonResult<String> delete(@RequestBody @Valid @NotEmpty(message = "集合不能为空")
                                               List<GenConfigIdParam> genConfigIdParamList) {
        genConfigService.delete(genConfigIdParamList);
        return CommonResult.ok();
    }

    @Operation(summary = "获取代码生成详细配置详情")
    @GetMapping("/gen/config/detail")
    public CommonResult<GenConfig> detail(@Valid GenConfigIdParam genConfigIdParam) {
        return CommonResult.data(genConfigService.detail(genConfigIdParam));
    }

    @Operation(summary = "批量编辑代码生成详细配置")
    @CommonLog("批量编辑代码生成详细配置")
    @PostMapping("/gen/config/editBatch")
    public CommonResult<String> editBatch(@RequestBody @Valid @NotEmpty(message = "集合不能为空")
                                                      List<GenConfigEditParam> genConfigEditParamList) {
        genConfigService.editBatch(genConfigEditParamList);
        return CommonResult.ok();
    }
}
