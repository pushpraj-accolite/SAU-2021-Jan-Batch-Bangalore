package com.accolite.hibernateau.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Set;

@Entity
@Data
public class Artist {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

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

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	@Column(name = "name")
    private String name;

    @Column(name  = "age")
    private Integer age;

    @ManyToMany()
    Set<Movie> movies;

	public Set<Movie> getMovies() {
		return movies;
	}

	public void setMovies(Set<Movie> movies) {
		this.movies = movies;
	}

}
