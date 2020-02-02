package com.oldman.manage.common.modelbase;

import io.jboot.db.model.JbootModel;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by Jboot, do not modify this file.
 */
@SuppressWarnings("serial")
public abstract class BaseSystemUser<M extends BaseSystemUser<M>> extends JbootModel<M> implements IBean {

	public void setId(java.lang.Integer id) {
		set("id", id);
	}

	public java.lang.Integer getId() {
		return getInt("id");
	}

	public void setUser(java.lang.String user) {
		set("user", user);
	}

	public java.lang.String getUser() {
		return getStr("user");
	}

	public void setPass(java.lang.String pass) {
		set("pass", pass);
	}

	public java.lang.String getPass() {
		return getStr("pass");
	}

	/**
	 * 头像
	 */
	public void setFace(java.lang.String face) {
		set("face", face);
	}

    /**
     * 头像
     */
	public java.lang.String getFace() {
		return getStr("face");
	}

	/**
	 * 手机号
	 */
	public void setPhone(java.lang.String phone) {
		set("phone", phone);
	}

    /**
     * 手机号
     */
	public java.lang.String getPhone() {
		return getStr("phone");
	}

	/**
	 * 呢称
	 */
	public void setNickname(java.lang.String nickname) {
		set("nickname", nickname);
	}

    /**
     * 呢称
     */
	public java.lang.String getNickname() {
		return getStr("nickname");
	}

	public void setSalt(java.lang.String salt) {
		set("salt", salt);
	}

	public java.lang.String getSalt() {
		return getStr("salt");
	}

	public void setLoginDate(java.util.Date loginDate) {
		set("login_date", loginDate);
	}

	public java.util.Date getLoginDate() {
		return get("login_date");
	}

	public void setCreateDate(java.util.Date createDate) {
		set("create_date", createDate);
	}

	public java.util.Date getCreateDate() {
		return get("create_date");
	}

	public void setLoginIp(java.lang.String loginIp) {
		set("login_ip", loginIp);
	}

	public java.lang.String getLoginIp() {
		return getStr("login_ip");
	}

	/**
	 * 状态:0=停用,1=启用
	 */
	public void setStatus(java.lang.Integer status) {
		set("status", status);
	}

    /**
     * 状态:0=停用,1=启用
     */
	public java.lang.Integer getStatus() {
		return getInt("status");
	}

}
