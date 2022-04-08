package com.example.fleetmanagement.accounts.models;

@Entity
@Data
@EqualsAndHashCode(callSuper=false)
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")

public class TransactionStatus extends CommonObject {
}