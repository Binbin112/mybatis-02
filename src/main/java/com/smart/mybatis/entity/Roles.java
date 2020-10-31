package com.smart.mybatis.entity;

import java.util.List;

/**
 * 角色表
 */
public class Roles {
    private Integer roleId;

    /**
     * 角色的名字
     */
    private String roleName;

    /**
     * 角色的说明
     */
    private String dec;

    /**
     * 0表示未删除，1表示删除
     */
    private Integer isDel;

    private List<Privilege> privileges;

    public List<Privilege> getPrivileges() {
        return privileges;
    }

    public void setPrivileges(List<Privilege> privileges) {
        this.privileges = privileges;
    }

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public String getDec() {
        return dec;
    }

    public void setDec(String dec) {
        this.dec = dec;
    }

    public Integer getIsDel() {
        return isDel;
    }

    public void setIsDel(Integer isDel) {
        this.isDel = isDel;
    }
}