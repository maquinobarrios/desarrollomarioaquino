package com.jp.clases.jp.entity.repositorio;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jp.clases.jp.entity.tecnico;

public interface jparepositori extends JpaRepository<tecnico, Integer> {

	public Optional<tecnico>	findBynombre(String Nombre);
}
