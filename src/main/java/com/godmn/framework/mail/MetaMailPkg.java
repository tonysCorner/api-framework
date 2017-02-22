package com.godmn.framework.mail;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

/**
 * 简单的值类，用于存放邮件相关配置
 * @author dujingjing
 *
 */
@Scope("singleton")
@Component
public final class MetaMailPkg {

	@Value("${mail.smtp.host}")
	private String smtp;
	@Value("${mail.username}")
	private String username;
	@Value("${mail.password}")
	private String password;
	@Value("${mail.mailSubject}")
	private String mailSubject;
	@Value("${mail.content}")
	private String content;
	@Value("${mail.mailAddr}")
	private String mailAddr;

    boolean auth = true;

	public void setSmtp(String smtp) {
		this.smtp = smtp;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void setMailSubject(String mailSubject) {
		this.mailSubject = mailSubject;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public void setMailAddr(String mailAddr) {
		this.mailAddr = mailAddr;
	}

	public void setAuth(boolean auth) {
		this.auth = auth;
	}

	public String getSmtp() {
		return smtp;
	}

	public String getUsername() {
		return username;
	}

	public String getPassword() {
		return password;
	}

	public String getMailSubject() {
		return mailSubject;
	}

	public String getContent() {
		return content;
	}

	public String getMailAddr() {
		return mailAddr;
	}

	public boolean isAuth() {
		return auth;
	}
}
