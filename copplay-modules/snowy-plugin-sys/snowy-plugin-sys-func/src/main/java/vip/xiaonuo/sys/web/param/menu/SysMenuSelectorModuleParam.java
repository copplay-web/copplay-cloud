package vip.xiaonuo.sys.web.param.menu;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.Setter;

/**
 * 模块选择器参数
 *
 * @author xuyuxiang
 * @date 2022/7/27 18:40
 **/
@Getter
@Setter
public class SysMenuSelectorModuleParam {

    /** 名称关键词 */
    @Schema(description = "名称关键词")
    private String searchKey;
}
