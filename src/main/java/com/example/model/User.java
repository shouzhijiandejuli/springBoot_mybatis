package com.example.model;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

/**
 * 
 * @ClassName: User 
 * @Description: 用户实体类
 * @author: guoconglin
 * @date: 2017年5月10日 下午2:38:53
 */
public class User {

    
    private Long usersId; //用户ID（主键）
    private String userName; //用户名
    private String userStatus;//用户状态(1:有效)
    private String loginPassWord; //登陆密码
    private String email; //用户邮箱
    private String mobile;  //用户手机号
    private String categoryId;  //用户类型（1:买家2:卖家
    private String qq;  //qq号
    private String weixin;  //微信号
    private String source;  //来源(1:PC2:APP3:微信)
    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date expireTime;  //过期时间
    private String picPath;  //用户头像路径
    private String nickName;  //用户昵称
    private String realName;  //真实姓名
    private String sex;  //性别
    private String birthYear;  //生日年
    private String birthMon;  //生日月
    private String birthDay;  //生日日
    private String liveCounty;  //居住地县区
    private String liveProvince;  //居住地省
    private String liveCity;  //居住地市
    private String homeProvince;  //家乡地省
    private String homeCity;  //家乡地市
    private String homeCounty;  //家乡地县区
    private String delFlag;  //删除标记
    private String addUser;  //添加人
    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date addTime;  //添加时间
    private String modifyUser;  //修改人
    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date modifyTime;  //修改时间
    public Long getUsersId() {
        return usersId;
    }
    public void setUsersId(Long usersId) {
        this.usersId = usersId;
    }
    public String getUserName() {
        return userName;
    }
    public void setUserName(String userName) {
        this.userName = userName;
    }
    public String getUserStatus() {
        return userStatus;
    }
    public void setUserStatus(String userStatus) {
        this.userStatus = userStatus;
    }
    public String getLoginPassWord() {
        return loginPassWord;
    }
    public void setLoginPassWord(String loginPassWord) {
        this.loginPassWord = loginPassWord;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getMobile() {
        return mobile;
    }
    public void setMobile(String mobile) {
        this.mobile = mobile;
    }
    public String getCategoryId() {
        return categoryId;
    }
    public void setCategoryId(String categoryId) {
        this.categoryId = categoryId;
    }
    public String getQq() {
        return qq;
    }
    public void setQq(String qq) {
        this.qq = qq;
    }
    public String getWeixin() {
        return weixin;
    }
    public void setWeixin(String weixin) {
        this.weixin = weixin;
    }
    public String getSource() {
        return source;
    }
    public void setSource(String source) {
        this.source = source;
    }
    public Date getExpireTime() {
        return expireTime;
    }
    public void setExpireTime(Date expireTime) {
        this.expireTime = expireTime;
    }
    public String getPicPath() {
        return picPath;
    }
    public void setPicPath(String picPath) {
        this.picPath = picPath;
    }
    public String getNickName() {
        return nickName;
    }
    public void setNickName(String nickName) {
        this.nickName = nickName;
    }
    public String getRealName() {
        return realName;
    }
    public void setRealName(String realName) {
        this.realName = realName;
    }
    public String getSex() {
        return sex;
    }
    public void setSex(String sex) {
        this.sex = sex;
    }
    public String getBirthYear() {
        return birthYear;
    }
    public void setBirthYear(String birthYear) {
        this.birthYear = birthYear;
    }
    public String getBirthMon() {
        return birthMon;
    }
    public void setBirthMon(String birthMon) {
        this.birthMon = birthMon;
    }
    public String getBirthDay() {
        return birthDay;
    }
    public void setBirthDay(String birthDay) {
        this.birthDay = birthDay;
    }
    public String getLiveCounty() {
        return liveCounty;
    }
    public void setLiveCounty(String liveCounty) {
        this.liveCounty = liveCounty;
    }
    public String getLiveProvince() {
        return liveProvince;
    }
    public void setLiveProvince(String liveProvince) {
        this.liveProvince = liveProvince;
    }
    public String getLiveCity() {
        return liveCity;
    }
    public void setLiveCity(String liveCity) {
        this.liveCity = liveCity;
    }
    public String getHomeProvince() {
        return homeProvince;
    }
    public void setHomeProvince(String homeProvince) {
        this.homeProvince = homeProvince;
    }
    public String getHomeCity() {
        return homeCity;
    }
    public void setHomeCity(String homeCity) {
        this.homeCity = homeCity;
    }
    public String getHomeCounty() {
        return homeCounty;
    }
    public void setHomeCounty(String homeCounty) {
        this.homeCounty = homeCounty;
    }
    public String getDelFlag() {
        return delFlag;
    }
    public void setDelFlag(String delFlag) {
        this.delFlag = delFlag;
    }
    public String getAddUser() {
        return addUser;
    }
    public void setAddUser(String addUser) {
        this.addUser = addUser;
    }
    public Date getAddTime() {
        return addTime;
    }
    public void setAddTime(Date addTime) {
        this.addTime = addTime;
    }
    public String getModifyUser() {
        return modifyUser;
    }
    public void setModifyUser(String modifyUser) {
        this.modifyUser = modifyUser;
    }
    public Date getModifyTime() {
        return modifyTime;
    }
    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }
    
    
}
