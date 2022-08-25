package com.myhealth.Entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "user")
public class Usuario {
	@Id
	private Long id;

	@Column(name = "email")
	private String email;

	@Column(name = "password")
	private String password;

	@OneToOne(mappedBy = "user")
	private Profile profile;
}