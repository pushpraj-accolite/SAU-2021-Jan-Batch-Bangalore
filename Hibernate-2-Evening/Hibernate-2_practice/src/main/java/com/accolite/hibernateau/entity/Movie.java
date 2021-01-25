package com.accolite.hibernateau.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Set;

@Entity(name = "movie")
@Data
public class Movie {

    public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDirectorName() {
		return directorName;
	}

	public void setDirectorName(String directorName) {
		this.directorName = directorName;
	}

	public Double getImdbRating() {
		return imdbRating;
	}

	public void setImdbRating(Double imdbRating) {
		this.imdbRating = imdbRating;
	}

	public Integer getReleaseYear() {
		return releaseYear;
	}

	public void setReleaseYear(Integer releaseYear) {
		this.releaseYear = releaseYear;
	}

	public String getLang() {
		return lang;
	}

	public void setLang(String lang) {
		this.lang = lang;
	}

	public Certificate getCertificate() {
		return certificate;
	}

	public void setCertificate(Certificate certificate) {
		this.certificate = certificate;
	}

	public Set<Artist> getArtists() {
		return artists;
	}

	public void setArtists(Set<Artist> artists) {
		this.artists = artists;
	}

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column
    private String name;

    @Column
    private String directorName;

    @Column
    private Double imdbRating;

    @Column
    private Integer releaseYear;

    @Column
    private String lang;

    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    Certificate certificate;

    @ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    Set<Artist> artists;

}
