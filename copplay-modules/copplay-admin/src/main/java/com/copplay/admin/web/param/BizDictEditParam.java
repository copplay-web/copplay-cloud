package com.copplay.admin.web.param;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

/**
 * 业务字典编辑参数
 *
 * @author xuyuxiang
 * @date 2022/7/30 21:48
 */
@Getter
@Setter
public class BizDictEditParam {

    /** id */
    @Schema(description = "id", requiredMode = Schema.RequiredMode.REQUIRED)
    @NotBlank(message = "id不能为空")
    private String id;

    /** 字典文字 */
    @Schema(description = "字典文字", requiredMode = Schema.RequiredMode.REQUIRED)
    @NotBlank(message = "dictLabel不能为空")
    private String dictLabel;

    /** 排序码 */
    @Schema(description = "排序码", requiredMode = Schema.RequiredMode.REQUIRED)
    @NotNull(message = "sortCode不能为空")
    private Integer sortCode;

    /** 扩展信息 */
    @Schema(description = "扩展信息")
    private String extJson;
}
