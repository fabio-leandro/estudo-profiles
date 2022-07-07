package com.fabio.cadastrocliente.services;

import com.fabio.cadastrocliente.domain.Cliente;
import com.fabio.cadastrocliente.dtos.ClienteDto;
import com.fabio.cadastrocliente.dtos.ClienteNewDto;
import com.fabio.cadastrocliente.exceptions.ObjectNotFoundException;
import com.fabio.cadastrocliente.repositories.ClienteRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ClienteService {

    @Autowired
    private ClienteRepository clienteRepository;
    @Autowired
    private ModelMapper modelMapper;

    @Transactional
    public ClienteDto getById(Long id){
        Cliente cliente = clienteRepository.findById(id).orElseThrow(()-> new ObjectNotFoundException("Cliente não encontrado com id -> "+id));
        return modelMapper.map(cliente,ClienteDto.class);
    }

    @Transactional
    public ClienteDto saveCliente(ClienteNewDto clienteNewDto){
        Cliente cliente = clienteRepository.save(modelMapper.map(clienteNewDto,Cliente.class));
        return modelMapper.map(clienteRepository.save(cliente),ClienteDto.class);
    }

    @Transactional
    public List<ClienteDto> getAllClientes(){
        List<Cliente> list = clienteRepository.findAll();
        return  list.stream().map(cliente -> modelMapper.map(cliente,ClienteDto.class)).collect(Collectors.toList());
    }
    @Transactional
    public ClienteDto updateById(Long id, Cliente cliente){
        clienteRepository.findById(id).orElseThrow(()-> new ObjectNotFoundException("Cliente não encontrado com o id ->"+id));
        return modelMapper.map(clienteRepository.save(cliente),ClienteDto.class);
    }
    @Transactional
    public void deleteById(Long id){
        clienteRepository.findById(id).orElseThrow(()-> new ObjectNotFoundException("Cliente não encontrado com o id ->"+id));
        clienteRepository.deleteById(id);
    }

}
