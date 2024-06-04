package vip.xiaonuo.biz.core.context.sys;

import cn.hutool.json.JSONArray;
import cn.hutool.json.JSONObject;
import cn.hutool.json.JSONUtil;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.google.gson.JsonObject;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import vip.xiaonuo.sys.api.SysRoleApi;
import vip.xiaonuo.sys.feign.SysRoleFeign;

import java.util.List;

/**
 * 角色API上下文Bean
 *
 * @author dongxiayu
 * @date 2022/11/22 10:55
 */
@Slf4j
@RequiredArgsConstructor
@Component
public class SysRoleApiContextBean implements SysRoleApi {

    private final SysRoleFeign sysRoleFeign;

    /**
     * 判断组织下是否存在角色
     *
     * @param orgIdList
     * @author dongxiayu
     * @date 2022/8/2 11:16
     */
    @Override
    public boolean orgHasRole(List<String> orgIdList) {
        return sysRoleFeign.orgHasRole(orgIdList);
    }

    /**
     * 获取角色选择器
     *
     * @param orgId
     * @param category
     * @param searchKey
     * @author dongxiayu
     * @date 2022/7/22 14:49
     */
    @SuppressWarnings("ALL")
    @Override
    public Page<JSONObject> roleSelector(String orgId, String category, String searchKey, List<String> dataScopeList, boolean excludeSuperAdmin) {
        String feignResp = sysRoleFeign.roleSelector(orgId, category, searchKey, dataScopeList, excludeSuperAdmin);
        Page<JSONObject> resp =  (Page<JSONObject>)JSONUtil.toBean(feignResp,Page.class);
        return resp;
    }

    /**
     * 代码生成菜单按钮授权
     *
     * @param menuId
     * @author dongxiayu
     * @date 2022/11/1 15:58
     */
    @Override
    public void grantForGenMenuAndButton(String menuId) {
        sysRoleFeign.grantForGenMenuAndButton(menuId);
    }
}