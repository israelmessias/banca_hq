package com.israelmessias.bancahq.service.impl;

import com.israelmessias.bancahq.excecao.RegraDeNegocio;
import com.israelmessias.bancahq.model.entity.Hq;
import com.israelmessias.bancahq.model.repository.HqRepository;
import com.israelmessias.bancahq.service.HqService;
import org.springframework.data.domain.Example;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.ExampleMatcher;

import javax.transaction.Transactional;
import java.math.BigDecimal;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

public class HqServiceImpl implements HqService {

    @Autowired
    private HqRepository repository;

    @Override
    @Transactional
    public Hq salvarHq(Hq hq) {
        validar(hq);
        return repository.save(hq);
    }

    @Override
    @Transactional
    public void excluirHq(Hq hq) {
        Objects.requireNonNull(hq.getId());
        repository.delete(hq);
    }

    @Override
    @Transactional()
    public List<Hq> buscarHq(Hq hq) {
        Example<Hq> example = Example.of(hq, ExampleMatcher.matching()
                .withIgnoreCase().withStringMatcher(ExampleMatcher.StringMatcher.CONTAINING));
        return repository.findAll(example);
    }

    @Override
    public Optional<Hq> obterPorId(Long id) {
        return repository.findById(id);
    }

    private void validar(Hq hq)
    {
        if(hq.getNome() == null|| hq.getNome().trim().equals(" "))
        {
            throw new RegraDeNegocio("Informe nome valido!");
        }
        if(hq.getGenero() == null || hq.getGenero().trim().equals(" "))
        {
            throw new RegraDeNegocio("Informe genero valido!");
        }
        if(hq.getEditora() == null)
        {
            throw new RegraDeNegocio("Informe a Editora!");
        }
        if(hq.getPreco() == null|| hq.getPreco().compareTo(BigDecimal.ZERO.doubleValue()) < 1)
        {
            throw new RegraDeNegocio("Informe o valor!");
        }
    }
}
