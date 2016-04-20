package com.project.demo.entity;

import java.io.Serializable;

public class Role implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column role.id
     *
     * @mbggenerated Wed Apr 20 13:40:29 CST 2016
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column role.role_name
     *
     * @mbggenerated Wed Apr 20 13:40:29 CST 2016
     */
    private String roleName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column role.allow_module
     *
     * @mbggenerated Wed Apr 20 13:40:29 CST 2016
     */
    private String allowModule;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table role
     *
     * @mbggenerated Wed Apr 20 13:40:29 CST 2016
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column role.id
     *
     * @return the value of role.id
     *
     * @mbggenerated Wed Apr 20 13:40:29 CST 2016
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column role.id
     *
     * @param id the value for role.id
     *
     * @mbggenerated Wed Apr 20 13:40:29 CST 2016
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column role.role_name
     *
     * @return the value of role.role_name
     *
     * @mbggenerated Wed Apr 20 13:40:29 CST 2016
     */
    public String getRoleName() {
        return roleName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column role.role_name
     *
     * @param roleName the value for role.role_name
     *
     * @mbggenerated Wed Apr 20 13:40:29 CST 2016
     */
    public void setRoleName(String roleName) {
        this.roleName = roleName == null ? null : roleName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column role.allow_module
     *
     * @return the value of role.allow_module
     *
     * @mbggenerated Wed Apr 20 13:40:29 CST 2016
     */
    public String getAllowModule() {
        return allowModule;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column role.allow_module
     *
     * @param allowModule the value for role.allow_module
     *
     * @mbggenerated Wed Apr 20 13:40:29 CST 2016
     */
    public void setAllowModule(String allowModule) {
        this.allowModule = allowModule == null ? null : allowModule.trim();
    }
}