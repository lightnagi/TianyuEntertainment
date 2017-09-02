package com.tianyu.pojo;

import java.sql.Date;

public class PostReply {

	private int postReplyId;
	
	private int userId;
	
	private int postId;
	
	private Date postReplyTime;
	
	private String postReplyContent;

	public int getPostReplyId() {
		return postReplyId;
	}

	public void setPostReplyId(int postReplyId) {
		this.postReplyId = postReplyId;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public int getPostId() {
		return postId;
	}

	public void setPostId(int postId) {
		this.postId = postId;
	}

	public Date getPostReplyTime() {
		return postReplyTime;
	}

	public void setPostReplyTime(Date postReplyTime) {
		this.postReplyTime = postReplyTime;
	}

	public String getPostReplyContent() {
		return postReplyContent;
	}

	public void setPostReplyContent(String postReplyContent) {
		this.postReplyContent = postReplyContent;
	}
	
	
}
