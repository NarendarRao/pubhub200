package com.naren.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="users")
public class User {
	@Id
	@GeneratedValue
	@Column(name="id")
	private long id;
	@Column(name="name")
	private String name;
	@Column(name="email")
	private String email;
	@Column(name="password")
	private String password;
}
