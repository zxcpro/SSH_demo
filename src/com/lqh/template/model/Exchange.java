package com.lqh.template.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.lqh.common.model.AbstractBaseModel;

@Entity
@Table(name="t_exchange")
public class Exchange extends AbstractBaseModel {
	
	private static final long serialVersionUID = -5081378459936997503L;

	private Integer id;
	
	private String title;
	private String name;
	private String mobile;
	
	private String image;
	private String description;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", unique = true, nullable = false, insertable = true, updatable = true)
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	public Exchange(Integer id, String title, String name, String mobile, String image,
			String description) {
		super();
		this.id = id;
		this.title = title;
		this.name = name;
		this.mobile = mobile;
		this.image = image;
		this.description = description;
	}
	
	public Exchange(String title, String name, String mobile, String description) {
		super();
		this.title = title;
		this.name = name;
		this.mobile = mobile;
		this.description = description;
	}
	
	public Exchange() {
		super();
	}
	
}
