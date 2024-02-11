package com.xworkz.fire.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@Table(name = "fire")
@NamedQuery(name = "findByStationName", query = "select ent from FireStationEntity ent where ent.stationName=:stationName")
public class FireStationEntity {

	@Id
	@Column(name = "id")
	private int id;
	@Column(name = "f_stationName")
	private String stationName;
	@Column(name = "f_location")
	private String location;
	@Column(name = "f_fireStationNo")
	private Integer fireStationNo;
	@Column(name = "f_noOfVehicles")
	private Integer noOfVehicles;

}
