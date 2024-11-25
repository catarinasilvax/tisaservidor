package com.example.tisa_servidor.Controller;

import com.example.tisa_servidor.dtos.ProdutoRecorde;
import com.example.tisa_servidor.models.ProdutoModel;
import com.example.tisa_servidor.repositorios.ProdutoRepositorio;
import jakarta.validation.Valid;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ProdutoController {

    @Autowired
    ProdutoRepositorio produtoRepositorio;

    @PostMapping("/produtos")
    public ResponseEntity<ProdutoModel> inserirProduto(
            @RequestBody @Valid ProdutoRecorde produtoRecorde
    ){
        ProdutoModel produtoModel = new ProdutoModel();
        BeanUtils.copyProperties(produtoRecorde, produtoModel);
    produtoModel.setNome(produtoRecorde.nome());
    produtoModel.setValor(produtoRecorde.valor());

        return ResponseEntity.status(HttpStatus.CREATED).body(produtoRepositorio.save(produtoModel));
    }

    @GetMapping("/produtos")
    public ResponseEntity<List<ProdutoModel>>getAllProdutos(){
        return ResponseEntity.status(HttpStatus.CREATED).body(produtoRepositorio.findAll());
    }
}
