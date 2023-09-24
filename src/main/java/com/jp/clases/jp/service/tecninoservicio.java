package com.jp.clases.jp.service;



import java.util.List;

import com.jp.clases.jp.entity.tecnico;

public interface tecninoservicio {

	public tecnico insertartecnico(Integer Nombre);
		public List<tecnico> listadoTecnicos();
		public tecnico obtenertecnico(int id);
		public tecnico obtenertecnico(String Nombre);
}

