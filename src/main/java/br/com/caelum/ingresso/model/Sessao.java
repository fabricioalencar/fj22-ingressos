package br.com.caelum.ingresso.model;

import java.time.LocalTime;

import javax.persistence.GeneratedValue;



public class Sessao {
	
	@id
	@GeneratedValue
	private Integer id;
	private LocalTime horario;
	
	@ManytoOne
	private Sala sala;
	
	@ManytoOne
	private Filme filme;
	
	public Sessao(LocalTime horario, Filme filme, Sala sala){
		this.horario = horario;
		this.filme = filme;
		this.setSala(sala);
	}
	
	public LocalTime getHorarioTermino(){
		return this.horario.plusMinutes(filme.getDuracao().toMinutes());
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Sala getSala() {
		return sala;
	}

	public void setSala(Sala sala) {
		this.sala = sala;
	}

	//criar getters e setters
	
}
