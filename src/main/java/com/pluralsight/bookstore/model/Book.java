package com.pluralsight.bookstore.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Book {

	@Id @GeneratedValue
	private Long id;
	@Column(length = 200)
	private String title;
	@Column(length = 1000)
	private String description;
	@Column(name = "unit_coast")
	private Float unitCoast;
	private String isbn;
	@Temporal(TemporalType.DATE)
	@Column(name = "publication_date")
	private Date publicationDate;
	@Column(name = "nb_of_pages")
	private Integer nbOfPages;
	@Column(name = "image_url")
	private String imageUrl;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Float getUnitCoast() {
		return unitCoast;
	}
	public void setUnitCoast(Float unitCoast) {
		this.unitCoast = unitCoast;
	}
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public Date getPublicationDate() {
		return publicationDate;
	}
	public void setPublicationDate(Date publicationDate) {
		this.publicationDate = publicationDate;
	}
	public Integer getNbOfPages() {
		return nbOfPages;
	}
	public void setNbOfPages(Integer nbOfPages) {
		this.nbOfPages = nbOfPages;
	}
	public String getImageUrl() {
		return imageUrl;
	}
	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}
	@Override
	public String toString() {
		return "Book [id=" + id + ", title=" + title + ", description=" + description + ", unitCoast=" + unitCoast
				+ ", isbn=" + isbn + ", publicationDate=" + publicationDate + ", nbOfPages=" + nbOfPages + ", imageUrl="
				+ imageUrl + "]";
	}
	
}
