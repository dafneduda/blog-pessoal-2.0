package com.dafneduda.blogpessoal.repository;

import com.dafneduda.blogpessoal.model.Postagem;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PostagemRepository extends JpaRepository<Postagem, Long> {

}
