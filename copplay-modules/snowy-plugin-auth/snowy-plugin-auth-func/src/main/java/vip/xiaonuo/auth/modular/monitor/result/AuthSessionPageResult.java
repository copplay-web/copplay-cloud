package vip.xiaonuo.auth.modular.monitor.result;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.List;

/**
 * B端会话结果集
 *
 * @author xuyuxiang
 * @date 2022/7/28 14:46
 **/
@Getter
@Setter
public class AuthSessionPageResult {

    /** id */
    @Schema(description = "id")
    private String id;

    /** 头像 */
    @Schema(description = "头像")
    private String avatar;

    /** 账号 */
    @Schema(description = "账号")
    private String account;

    /** 姓名 */
    @Schema(description = "姓名")
    private String name;

    /** 上次登录ip */
    @Schema(description = "上次登录ip")
    private String lastLoginIp;

    /** 上次登录地点 */
    @Schema(description = "上次登录地点")
    private String lastLoginAddress;

    /** 上次登录时间 */
    @Schema(description = "上次登录时间")
    private Date lastLoginTime;

    /** 上次登录设备 */
    @Schema(description = "上次登录设备")
    private String lastLoginDevice;

    /** 最新登录ip */
    @Schema(description = "最新登录ip")
    private String latestLoginIp;

    /** 最新登录地点 */
    @Schema(description = "最新登录地点")
    private String latestLoginAddress;

    /** 最新登录时间 */
    @Schema(description = "最新登录时间")
    private Date latestLoginTime;

    /** 最新登录设备 */
    @Schema(description = "最新登录设备")
    private String latestLoginDevice;

    /** 会话id */
    @Schema(description = "会话id")
    private String sessionId;

    /** 会话创建时间 */
    @Schema(description = "会话创建时间")
    private Date sessionCreateTime;

    /** 会话剩余有效期 */
    @Schema(description = "会话剩余有效期")
    private String sessionTimeout;

    /** 令牌数量 */
    @Schema(description = "令牌数量")
    private Integer tokenCount;

    /** 令牌信息集合 */
    @Schema(description = "令牌信息集合")
    private List<TokenSignInfo> tokenSignList;

    /**
     * 令牌信息类
     *
     * @author xuyuxiang
     * @date 2022/7/28 15:04
     **/
    @Getter
    @Setter
    public static class TokenSignInfo {

        /** token值 */
        @Schema(description = "token值")
        private String tokenValue;

        /** 登录设备 */
        @Schema(description = "登录设备")
        private String tokenDevice;

        /** token剩余有效期 */
        @Schema(description = "token剩余有效期")
        private String tokenTimeout;

        /** token剩余有效期百分比 */
        @Schema(description = "token剩余有效期百分比")
        private Double tokenTimeoutPercent;
    }
}
