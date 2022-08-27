package com.myhealth.Entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name = "step")
@NoArgsConstructor
public class Steps {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@Column(name = "quantity")
	private String quantity;

	@Temporal(TemporalType.DATE)
	@Column(name = "date")
	Date date;

	@ManyToOne
	@JoinColumn(name = "patient_id", nullable = false)
	private Patient patient;

}
