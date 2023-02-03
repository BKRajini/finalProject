package com.xworkz.entity;

import java.time.LocalDate;
import java.time.LocalTime;

import javax.persistence.MappedSuperclass;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@MappedSuperclass

public class AnimatorEntity
{
public String createdBy;
public LocalDate createdDate;
public String updatedBy;
public LocalTime updatedDate;
}
