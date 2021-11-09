package com.israelmessias.bancahq.service.impl;

import com.israelmessias.bancahq.excecao.ErroAutenticar;
import com.israelmessias.bancahq.model.entity.Usuario;
import com.israelmessias.bancahq.model.repository.UsuarioRepository;
import com.israelmessias.bancahq.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Optional;

public class UsuarioServiceImpl implements UsuarioService {

    @Autowired
    private UsuarioRepository repository;

    @Override
    public Usuario autenticar(String email, String senha) {
        Optional<Usuario> usuario = repository.findByEmail(email);
        //Se não for encontrado email
        if(!usuario.isPresent())
        {
            throw new ErroAutenticar("Email do usuario não encotrado ou inexistente");
        }

        if(!usuario.get().getSenha().equals(senha))
        {
            throw new ErroAutenticar("Senha invalida");
        }
        return usuario.get();
    }

    @Override
    public Usuario salvarUsuario(Usuario usuario) {
        return null;
    }

    @Override
    public void validarEmail(String email) {

    }

    @Override
    public Optional<Usuario> obterPorId(Long id) {
        return Optional.empty();
    }
}
