package com.israelmessias.bancahq.service;

import com.israelmessias.bancahq.model.entity.Hq;

import java.util.List;
import java.util.Optional;

public interface HqService {

    Hq salvarHq(Hq hq);

    void excluirHq(Hq hq);

    List<Hq> buscarHq(Hq Hq);

    Optional<Hq> obterPorId(Long id);
}
