package com.accolite.hibernateau.entity;

import lombok.Data;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Data
public class Certificate {

    public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Date getIssuedDate() {
		return issuedDate;
	}

	public void setIssuedDate(Date issuedDate) {
		this.issuedDate = issuedDate;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Movie getMovie() {
		return movie;
	}

	public void setMovie(Movie movie) {
		this.movie = movie;
	}

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column
    private Date issuedDate;

    @Column
    private String description;

    @OneToOne
    private Movie movie;

}
