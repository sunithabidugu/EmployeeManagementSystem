package com.cg.ems.exception;

import java.time.LocalDateTime;

public class EMSErrorInfo {
	String msg;
	String uri;
	LocalDateTime timestamp;
	public EMSErrorInfo(String msg, String uri,LocalDateTime timestamp) {
		super();
		this.msg = msg;
		this.uri = uri;
		this.timestamp=timestamp;
	}
	public EMSErrorInfo() {
		super();
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public String getUri() {
		return uri;
	}
	public void setUri(String uri) {
		this.uri = uri;
	}
	public LocalDateTime getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(LocalDateTime timestamp) {
		this.timestamp = timestamp;
	}
	@Override
	public String toString() {
		return "EMSErrorInfo [msg=" + msg + ", uri=" + uri + ", timestamp=" + timestamp + "]";
	}
	
	
}
