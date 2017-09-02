package com.tianyu.pojo;

import java.sql.Date;

public class Post {

	private int postId;
	
	private String postTitle;
	
	private String postType;
	
	private Date postTime;
	
	private int postCount;
	
	private String postStatus;
	
	private String postPriority;

	public int getPostId() {
		return postId;
	}

	public void setPostId(int postId) {
		this.postId = postId;
	}

	public String getPostTitle() {
		return postTitle;
	}

	public void setPostTitle(String postTitle) {
		this.postTitle = postTitle;
	}

	public String getPostType() {
		return postType;
	}

	public void setPostType(String postType) {
		this.postType = postType;
	}

	public Date getPostTime() {
		return postTime;
	}

	public void setPostTime(Date postTime) {
		this.postTime = postTime;
	}

	public int getPostCount() {
		return postCount;
	}

	public void setPostCount(int postCount) {
		this.postCount = postCount;
	}

	public String getPostStatus() {
		return postStatus;
	}

	public void setPostStatus(String postStatus) {
		this.postStatus = postStatus;
	}

	public String getPostPriority() {
		return postPriority;
	}

	public void setPostPriority(String postPriority) {
		this.postPriority = postPriority;
	}
	
	
}
