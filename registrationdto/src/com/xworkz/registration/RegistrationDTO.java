package com.xworkz.registration;

import javax.persistence.Entity;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Table(name="registration")
@Entity

public class RegistrationDTO
{
private String name;
}
 