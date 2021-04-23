package com.sippulse.pet;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.LongStream;

import javax.persistence.CascadeType;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateTimeDeserializer;
import com.sippulse.pet.entity.Cliente;
import com.sippulse.pet.entity.Consulta;
import com.sippulse.pet.entity.Funcionario;
import com.sippulse.pet.entity.Pet;
import com.sippulse.pet.repository.ConsultaRepository;

@SpringBootApplication
public class PetSchedule {
	public static void main(String[] args) {
		SpringApplication.run(PetSchedule.class, args);
	}

	@Bean
	CommandLineRunner init(ConsultaRepository repository) {
		return args -> {
			repository.deleteAll();
			LongStream.range(1, 11).mapToObj(i -> {

				Funcionario f = new Funcionario();
				f.setNome(" Elias Soares");
				f.setEmail("elias.soares@gmail.com");
				f.setCpf("11111111111");
				f.setUsuario("elias.soares");
				f.setSenha("admin");
				f.setEndereco("Minas Gerais");
				f.isVeterinario(Boolean.TRUE);

								
				Cliente cli = new Cliente();
				cli.setNome("Joaquim Silva");
				cli.setEmail("joaquim.silva@gmail.com";)
				cli.setCelular("31999999999");
				cli.setEndereco("Eldorado");
				cli.setCpf("12345678912");
				
				Pet p = new Pet();
				p.setNome("Bob");
				p.setDescricao("10 kg, 30cm altura");
				p.setCliente(cli);

				Consulta c = new Consulta();
				c.setDataHorario(LocalDateTime.now());
				c.setPet(p);
				c.setFuncionario(f);
				return c;
			}).map(v -> repository.save(v)).forEach(System.out::println);
		};
	}
}