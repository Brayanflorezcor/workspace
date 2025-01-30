package com.std.ec.service;

import com.std.ec.model.entity.Cliente;

import java.util.List;

public interface ICliente {

    //metodos
    //PARA GAUARDAR
    Cliente save(Cliente cliente);

    Cliente findById(Integer id);

    void delete (Cliente cliente);

    List<Cliente> findAll();

}
