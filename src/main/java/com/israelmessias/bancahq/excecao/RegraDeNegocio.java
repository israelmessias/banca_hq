package com.israelmessias.bancahq.excecao;

public class RegraDeNegocio extends RuntimeException{
    public RegraDeNegocio (String mensagem)
    {
        super(mensagem);
    }

}
