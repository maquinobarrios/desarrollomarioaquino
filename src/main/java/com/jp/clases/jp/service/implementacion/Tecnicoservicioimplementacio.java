package com.jp.clases.jp.service.implementacion;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;

import com.jp.clases.jp.entity.tecnico;
import com.jp.clases.jp.service.tecninoservicio;

public class Tecnicoservicioimplementacio implements tecninoservicio {

	private static final String String = null;
	@Autowired
	private JpaRepository jparepositori;
	@Override
	public tecnico insertartecnico(Integer nombre) {
		tecnico tec= new tecnico();
		tec.setNombre(null)
		return null;
	}

	@Override
	public List<tecnico> listadoTecnicos() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public tecnico obtenertecnico(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public tecnico obtenertecnico(String Nombre) {
		// TODO Auto-generated method stub
		return null;
	}

}
