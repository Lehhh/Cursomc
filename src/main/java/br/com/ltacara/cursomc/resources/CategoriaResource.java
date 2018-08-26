package br.com.ltacara.cursomc.resources;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.ltacara.cursomc.domain.Categoria;

@RestController
@RequestMapping(value = "/categorias")
public class CategoriaResource {

	@RequestMapping(method = RequestMethod.GET)
	public ArrayList<Categoria> listar() {

		Categoria cat1 = new Categoria(1, "Informática");
		Categoria cat2 = new Categoria(2, "Escritório");

		ArrayList<Categoria> lista = new ArrayList<Categoria>();
		lista.add(cat1);
		lista.add(cat2);

		
		return lista;
	}

}
