package br.edu.insper.pessoa.controller;

import br.edu.insper.pessoa.model.Pessoa;
import br.edu.insper.pessoa.service.PessoaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/pessoas")
public class PessoaController {

    @Autowired
    private PessoaService pessoaService;

    @GetMapping
    public List<Pessoa> listPessoas() {
        return pessoaService.listPessoas();
    }

    @PostMapping
    public Pessoa savePessoa(@RequestBody Pessoa pessoa) {
        return pessoaService.savePessoa(pessoa);
    }

}
