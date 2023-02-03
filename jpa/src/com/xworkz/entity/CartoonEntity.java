package com.xworkz.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@ToString
@Table(name="CartoonCharacters")

@NamedQueries({
	@NamedQuery(name = "findByName",query = "select cartoon from CartoonEntity cartoon where cartoonName = :nm"),
	@NamedQuery(name = "getCount", query = "select count(*) from CartoonEntity"),
	@NamedQuery(name = "getAll", query = "select max(createdDate),cartoon from CartoonEntity cartoon"),
	@NamedQuery(name = "findAll", query = "select cartoon from CartoonEntity cartoon where cartoonName = :nm and country = :cc and gender = :ge and author = :at"),
	@NamedQuery(name = "findAuthor",query = "select cartoon.author from CartoonEntity cartoon where cartoon.cartoonName = :nm"),
	@NamedQuery(name = "findCreatedDate",query = "select cartoon.createdDate from CartoonEntity cartoon where cartoon.author = :date"),
	@NamedQuery(name = "findNameAndCountry",query = "select cartoon.cartoonName,cartoon.country from CartoonEntity cartoon where cartoon.author = :date"),
	@NamedQuery(name = "updateAuthor",query = "update CartoonEntity cartoon set cartoon.author = :at where cartoon.cartoonName =:nm"),
	@NamedQuery(name = "updateType", query = "update CartoonEntity cartoon set cartoon.type =:type where cartoon.cartoonName = :name"),
	@NamedQuery(name = "deleteByName", query = "delete from CartoonEntity cartoon where cartoon.cartoonName = :dname"),
	@NamedQuery(name = "findAllByList",query = "select cartoon from CartoonEntity cartoon"),
	@NamedQuery(name = "findAllByAuthor", query = "select cartoon from CartoonEntity cartoon where cartoon.author = :aut"),
	@NamedQuery(name = "findAllByAuthorAndGender",query = "select cartoon from CartoonEntity cartoon where cartoon.author =:aut and cartoon.gender=:gen"),
	@NamedQuery(name = "findAllName",query = "select cartoon.cartoonName from CartoonEntity cartoon"),
	@NamedQuery(name = "findAllCountry", query = "select cartoon.country from CartoonEntity cartoon"),
//	@NamedQuery(name = "findAllNameAndCountry", query = "select cartoon.cartoonName,cartoon.country from CartoonEntity cartoon"),
	@NamedQuery(name = "findAllNameAndCountryAndAuthor", query = "select cartoon.cartoonName,cartoon.country,cartoon.author from CartoonEntity cartoon")

})


public class CartoonEntity extends AnimatorEntity
{

 @GenericGenerator(name="animation",strategy="increment")
@GeneratedValue(Generator="animation")
 @Id
 {
	 
 }
}
