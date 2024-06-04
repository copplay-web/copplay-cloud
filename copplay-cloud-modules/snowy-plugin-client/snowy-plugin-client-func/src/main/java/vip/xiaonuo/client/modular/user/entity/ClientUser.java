/*
 * Copyright [2022] [https://www.xiaonuo.vip]
 *
 * Snowy采用APACHE LICENSE 2.0开源协议，您在使用过程中，需要注意以下几点：
 *
 * 1.请不要删除和修改根目录下的LICENSE文件。
 * 2.请不要删除和修改Snowy源码头部的版权声明。
 * 3.本项目代码可免费商业使用，商业使用请保留源码和相关描述文件的项目出处，作者声明等。
 * 4.分发源码时候，请注明软件出处 https://www.xiaonuo.vip
 * 5.不可二次分发开源参与同类竞品，如有想法可联系团队xiaonuobase@qq.com商议合作。
 * 6.若您的项目无法满足以上几点，需要更多功能代码，获取Snowy商业授权许可，请在官网购买授权，地址为 https://www.xiaonuo.vip
 */
package vip.xiaonuo.client.modular.user.entity;

import com.baomidou.mybatisplus.annotation.FieldStrategy;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fhs.core.trans.anno.Trans;
import com.fhs.core.trans.constant.TransType;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.Setter;
import vip.xiaonuo.common.CommonSm4CbcTypeHandler;
import vip.xiaonuo.common.domain.CommonEntity;

import java.util.Date;

/**
 * C端用户实体
 *
 * @author xuyuxiang
 * @date 2022/4/21 16:13
 **/
@Getter
@Setter
@TableName(value = "CLIENT_USER", autoResultMap = true)
public class ClientUser extends CommonEntity {

    /** id */
    @Schema(description = "id")
    private String id;

    /** 头像 */
    @Schema(description = "头像，图片base64")
    @TableField(insertStrategy = FieldStrategy.IGNORED, updateStrategy = FieldStrategy.IGNORED)
    private String avatar;

    /** 签名 */
    @Schema(description = "签名，图片base64")
    @TableField(insertStrategy = FieldStrategy.IGNORED, updateStrategy = FieldStrategy.IGNORED)
    private String signature;

    /** 账号 */
    @Schema(description = "账号")
    private String account;

    /** 密码 */
    @JsonIgnore
    @Schema(description = "密码")
    private String password;

    /** 姓名 */
    @Schema(description = "姓名")
    private String name;

    /** 昵称 */
    @Schema(description = "昵称")
    @TableField(insertStrategy = FieldStrategy.IGNORED, updateStrategy = FieldStrategy.IGNORED)
    private String nickname;

    /** 性别 */
    @Schema(description = "性别")
    @TableField(insertStrategy = FieldStrategy.IGNORED, updateStrategy = FieldStrategy.IGNORED)
    @Trans(type = TransType.DICTIONARY, key = "GENDER")
    private String gender;

    /** 年龄 */
    @Schema(description = "年龄")
    @TableField(insertStrategy = FieldStrategy.IGNORED, updateStrategy = FieldStrategy.IGNORED)
    private String age;

    /** 出生日期 */
    @Schema(description = "出生日期")
    @TableField(insertStrategy = FieldStrategy.IGNORED, updateStrategy = FieldStrategy.IGNORED)
    private String birthday;

    /** 民族 */
    @Schema(description = "民族")
    @TableField(insertStrategy = FieldStrategy.IGNORED, updateStrategy = FieldStrategy.IGNORED)
    private String nation;

    /** 籍贯 */
    @Schema(description = "籍贯")
    @TableField(insertStrategy = FieldStrategy.IGNORED, updateStrategy = FieldStrategy.IGNORED)
    private String nativePlace;

    /** 家庭住址 */
    @Schema(description = "家庭住址")
    @TableField(insertStrategy = FieldStrategy.IGNORED, updateStrategy = FieldStrategy.IGNORED)
    private String homeAddress;

    /** 通信地址 */
    @Schema(description = "通信地址")
    @TableField(insertStrategy = FieldStrategy.IGNORED, updateStrategy = FieldStrategy.IGNORED)
    private String mailingAddress;

    /** 证件类型 */
    @Schema(description = "证件类型")
    @TableField(insertStrategy = FieldStrategy.IGNORED, updateStrategy = FieldStrategy.IGNORED)
    private String idCardType;

    /** 证件号码 */
    @Schema(description = "证件号码")
    @TableField(insertStrategy = FieldStrategy.IGNORED, updateStrategy = FieldStrategy.IGNORED, typeHandler = CommonSm4CbcTypeHandler.class)
    private String idCardNumber;

    /** 文化程度 */
    @Schema(description = "文化程度")
    @TableField(insertStrategy = FieldStrategy.IGNORED, updateStrategy = FieldStrategy.IGNORED)
    private String cultureLevel;

    /** 政治面貌 */
    @Schema(description = "政治面貌")
    @TableField(insertStrategy = FieldStrategy.IGNORED, updateStrategy = FieldStrategy.IGNORED)
    private String politicalOutlook;

    /** 毕业院校 */
    @Schema(description = "毕业院校")
    @TableField(insertStrategy = FieldStrategy.IGNORED, updateStrategy = FieldStrategy.IGNORED)
    private String college;

    /** 学历 */
    @Schema(description = "学历")
    @TableField(insertStrategy = FieldStrategy.IGNORED, updateStrategy = FieldStrategy.IGNORED)
    private String education;

    /** 学制 */
    @Schema(description = "学制")
    @TableField(insertStrategy = FieldStrategy.IGNORED, updateStrategy = FieldStrategy.IGNORED)
    private String eduLength;

    /** 学位 */
    @Schema(description = "学位")
    @TableField(insertStrategy = FieldStrategy.IGNORED, updateStrategy = FieldStrategy.IGNORED)
    private String degree;

    /** 手机 */
    @Schema(description = "手机")
    @TableField(insertStrategy = FieldStrategy.IGNORED, updateStrategy = FieldStrategy.IGNORED, typeHandler = CommonSm4CbcTypeHandler.class)
    private String phone;

    /** 邮箱 */
    @Schema(description = "邮箱")
    @TableField(insertStrategy = FieldStrategy.IGNORED, updateStrategy = FieldStrategy.IGNORED)
    private String email;

    /** 家庭电话 */
    @Schema(description = "家庭电话")
    @TableField(insertStrategy = FieldStrategy.IGNORED, updateStrategy = FieldStrategy.IGNORED)
    private String homeTel;

    /** 办公电话 */
    @Schema(description = "办公电话")
    @TableField(insertStrategy = FieldStrategy.IGNORED, updateStrategy = FieldStrategy.IGNORED)
    private String officeTel;

    /** 紧急联系人 */
    @Schema(description = "紧急联系人")
    @TableField(insertStrategy = FieldStrategy.IGNORED, updateStrategy = FieldStrategy.IGNORED)
    private String emergencyContact;

    /** 紧急联系人电话 */
    @Schema(description = "紧急联系人电话")
    @TableField(insertStrategy = FieldStrategy.IGNORED, updateStrategy = FieldStrategy.IGNORED, typeHandler = CommonSm4CbcTypeHandler.class)
    private String emergencyPhone;

    /** 紧急联系人地址 */
    @Schema(description = "紧急联系人地址")
    @TableField(insertStrategy = FieldStrategy.IGNORED, updateStrategy = FieldStrategy.IGNORED)
    private String emergencyAddress;

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

    /** 用户状态 */
    @Schema(description = "用户状态")
    private String userStatus;

    /** 排序码 */
    @Schema(description = "排序码")
    private Integer sortCode;

    /** 扩展信息 */
    @Schema(description = "扩展信息")
    @TableField(insertStrategy = FieldStrategy.IGNORED, updateStrategy = FieldStrategy.IGNORED)
    private String extJson;
}
