package one.digitalinnovation.beerstock.repository;

import one.digitalinnovation.beerstock.entity.Beer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;
// Implementa o padrão arquitetural Data Acess Object
// Tem a responsabilidade de conversar com o banco de dados
public interface BeerRepository extends JpaRepository<Beer, Long> {
//Tipo optional verificacao segura, se e vazio se existe ou nao
    Optional<Beer> findByName(String name);
}
