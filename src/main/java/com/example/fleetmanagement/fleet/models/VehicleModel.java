package com.example.fleetmanagement.fleet.models;

import javax.persistence.Entity;

import com.example.fleetmanagement.parameters.models.CommonObject;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Entity
@Data
@EqualsAndHashCode(callSuper=false)
public class VehicleModel extends CommonObject {

}
