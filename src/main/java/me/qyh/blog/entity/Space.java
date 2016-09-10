package me.qyh.blog.entity;

import java.sql.Timestamp;

import me.qyh.blog.message.Message;

public class Space extends BaseLockResource {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * 
	 */
	private String name;// 空间名
	private String alias;
	private Timestamp createDate;// 创建时间
	private Boolean isPrivate;

	public String getAlias() {
		return alias;
	}

	public void setAlias(String alias) {
		this.alias = alias;
	}

	public Timestamp getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Timestamp createDate) {
		this.createDate = createDate;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Space() {
		super();
	}

	public Space(Integer id) {
		super(id);
	}

	@Override
	public String getResourceId() {
		return "Space-" + alias;
	}

	@Override
	public Message getLockTip() {
		return new Message("lock.space.tip", "该空间访问受密码保护，请解锁后访问");
	}

	public Boolean getIsPrivate() {
		return isPrivate;
	}

	public void setIsPrivate(Boolean isPrivate) {
		this.isPrivate = isPrivate;
	}
}
