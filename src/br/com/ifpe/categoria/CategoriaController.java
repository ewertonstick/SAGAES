package br.com.ifpe.categoria;



import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CategoriaController {
	
		@RequestMapping("/addCategoria") 
		public String addCategoria() { 
			
			return "AdcCategoria";
		}
			@RequestMapping("AdcCategoria") 
			 public String AdcCategoria(Categoria categoria, Model model ) { 
				
				CategoriaDao dao = new CategoriaDao();
				dao.salvar(categoria);
				model.addAttribute("mensagem", "Categoria Adicionada com Sucesso");
				return "AdcCategoria";

			}
			 @RequestMapping("listarCategoria")
				public String listarCategoria(Model model){
				CategoriaDao dao = new CategoriaDao();
				model.addAttribute("pesquisarCategoria", dao.getLista());
				return "pesquisarCategoria";
	}
			 @RequestMapping("mostraAlterar")
			   public String mostra(Integer idCategoria,Model model) {
					CategoriaDao dao = new CategoriaDao();
					model.addAttribute("alterarCategoria", dao.exibir(idCategoria));
					return "alterarCategoria";
				          }

				@RequestMapping("alterarCategoria")
				public String altera(Categoria categoria) {
					CategoriaDao dao = new CategoriaDao();
					dao.altera(categoria);
					return "redirect:listarCategoria";
				}

	                @RequestMapping("removerCategoria")
				    public String removerCategoria(Integer idCategoria, Model model) {
					CategoriaDao dao = new CategoriaDao();
					dao.remover(idCategoria);
					model.addAttribute("mensagem", "Categoria Removida com Sucesso");
					return "forward:listarCategoria";
	}
		}

	

