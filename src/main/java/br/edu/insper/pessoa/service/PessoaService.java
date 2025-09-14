package br.edu.insper.pessoa.service;

import br.edu.insper.pessoa.model.Pessoa;
import br.edu.insper.pessoa.repoository.PessoaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class PessoaService {

    @Autowired
    private PessoaRepository pessoaRepository;

    public List<Pessoa> listPessoas() {
        return pessoaRepository.findAll();
    }

    public Pessoa savePessoa(Pessoa pessoa) {

        pessoa.setCreatedDate(LocalDate.now());
        pessoa = pessoaRepository.save(pessoa);
        return pessoa;

    }
}
