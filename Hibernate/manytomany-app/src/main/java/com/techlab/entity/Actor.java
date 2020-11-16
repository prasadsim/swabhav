package com.techlab.entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Actor {
	@Id
	private String id;
	private String actorName;
	@ManyToMany(mappedBy = "actors", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	private Set<Movie> movies = new HashSet<Movie>();

	@Override
	public String toString() {
		return "Actors [id=" + id + ", actorName=" + actorName + "]";
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getActorName() {
		return actorName;
	}

	public void setActorName(String actorName) {
		this.actorName = actorName;
	}

	public Set<Movie> getMovies() {
		return movies;
	}

	public void setMovies(Set<Movie> movies) {
		this.movies = movies;
	}
}