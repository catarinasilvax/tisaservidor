package com.example.tisa_servidor.repositorios;

import com.example.tisa_servidor.models.ProdutoModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface ProdutoRepositorio  extends JpaRepository<ProdutoModel, UUID> {

}
