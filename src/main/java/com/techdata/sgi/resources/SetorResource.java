package com.techdata.sgi.resources;
	
import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.techdata.sgi.domain.Setor;

	

	@RestController
	@RequestMapping(value="/setor")
	public class SetorResource {
		
		@RequestMapping(method=RequestMethod.GET)
		public List<Setor> listar() {
			
			Setor cat1 = new Setor(1, "Recepção");
			Setor cat2 = new Setor(2, "Sala medico");
			
			List<Setor> lista = new ArrayList<>();
			lista.add(cat1);
			lista.add(cat2);
			
			
			return lista;
		}

}
