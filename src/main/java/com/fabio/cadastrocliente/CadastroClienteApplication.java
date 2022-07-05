package com.fabio.cadastrocliente;

import com.fabio.cadastrocliente.domain.Cliente;
import com.fabio.cadastrocliente.domain.Endereco;
import com.fabio.cadastrocliente.domain.Telefone;
import com.fabio.cadastrocliente.domain.enums.TipoCliente;
import com.fabio.cadastrocliente.repositories.ClienteRepository;
import com.fabio.cadastrocliente.repositories.EnderecoRepository;
import com.fabio.cadastrocliente.repositories.TelefoneRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class CadastroClienteApplication implements CommandLineRunner {

    @Autowired
    private ClienteRepository clienteRepository;

    @Autowired
    private EnderecoRepository enderecoRepository;

    @Autowired
    private TelefoneRepository telefoneRepository;

    public static void main(String[] args) {

        SpringApplication.run(CadastroClienteApplication.class, args);

    }


    @Override
    public void run(String... args) throws Exception {

        Endereco e1 = new Endereco(null,"Rua Doutor Pedro Ruela","4444","Letícia",
                "Casa A","31570-200","MG","Belo Horizonte","3106200");

        Endereco e2 = new Endereco(null,"Rua Jovina Gomes de Souza","3333","Letícia",
                "Apto 304","31570-100","MG","Belo Horizonte","3106200");

        Endereco e3 = new Endereco(null,"Rua José Benevides da Silveira","5555","Letícia",
                "Apto 608","31570-050","MG","Belo Horizonte","3106200");


        Cliente c1 = new Cliente(null,"Patricia Caroline",
                TipoCliente.PESSOAFISICA,"34086636026","pati@gmail.com","4A4A4A4A4A",e1);

        Cliente c2 = new Cliente(null, "Fábio Leandro",
                TipoCliente.PESSOAFISICA,"40924413042","fabio@gmail.com","4B4B4B4B4B",e2);

        Cliente c3 = new Cliente(null,"Sarah Oliveira",
                TipoCliente.PESSOAFISICA,"74359575009","sarah@hotmail.com","6C6C6C6C6C",e3);

        List<Telefone> telefones1 = List.of(new Telefone(null,"3144445555"), new Telefone(null,"3199997777"));
        List<Telefone> telefones2 = List.of(new Telefone(null,"3133336666"), new Telefone(null,"3188886666"));
        List<Telefone> telefones3 = List.of(new Telefone(null,"3144449999"), new Telefone(null,"3177773333"));

        c1.getTelefones().addAll(telefones1);
        c2.getTelefones().addAll(telefones2);
        c3.getTelefones().addAll(telefones3);

        clienteRepository.saveAll(List.of(c1,c2,c3));


    }
}
