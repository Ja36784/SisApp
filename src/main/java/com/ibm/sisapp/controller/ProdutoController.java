package com.ibm.sisapp.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ibm.sisapp.model.DadosCadastroProduto;
import com.ibm.sisapp.model.Produto;

@Controller
@RequestMapping("/produto")
public class ProdutoController {
	private List<Produto> produtos = new ArrayList<>();
	
	@GetMapping
	public String carregarFormProduto() {
		return "produto/cadProduto"; // template formCadFuncionario.html
		
	}
	
	@GetMapping("/listagemProd")
		public String carregarPaginaListagem(Model model) {
		model.addAttribute("lista", produtos);
			return "produto/listagemProd";
	}
	
	
	@PostMapping
	public String cadastrarProduto(DadosCadastroProduto dados) {		
		var produto = new Produto(dados);
		produtos.add(produto);
		System.out.println(produtos);	
		return "redirect:/produto/listagemProd";
	}

}
