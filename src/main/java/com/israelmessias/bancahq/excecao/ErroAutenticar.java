package com.israelmessias.bancahq.excecao;

public class ErroAutenticar extends RuntimeException{
    public ErroAutenticar(String mensagem)
    {
        super(mensagem);
    }
}
