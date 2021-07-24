
# __Projeto - Estudando Spring Framework__
- _Projeto prático usando Spring Framework._

## _Tecnologias usadas_

> __Base de dados MySQL__
- Foi definido como base de dados o __MySQL v8.0.22__.

> __Docker__
- Será o responsável por manter a base de dados, em _container_, disponível para acesso da aplicação durante o processo de desenvolvimento.

> __Postman__
- O Postman será usado para testar as rotas do sistema.

## _Dependências Spring Boot_
- Spring Web
- Thymeleaf
- Spring Data JPA
- MySQL Driver
- Spring Boot DevTools

## _Arquitetura do projeto_

- Foi aplicado o Model View Controller

### src/main/java:

    com.spring.estudando
    com.spring.estudando.config
    com.spring.estudando.controllers
    com.spring.estudando.models
    com.spring.estudando.repositories

## _Anotações do Spring aplicadas no projeto_
- ## Diferença entre __@Controller__ e __@RestController__

> @Controller

A anotação __@Controller__ é atribuída a uma classe quando o sistema tem a capacidade de responder ao cliente arquivos estáticos como HTML, CSS e JS.

> @RestController

Para o uso da anotação __@RestController__ o aplicação terá como resposta das requisições dados em formato representacional, JSON ou XML, por exemplo.

- ## Mapeamento de rotas

> @RequestMapping

`A anotação __@RequestMapping__ é usada tanto com __@Controller__ ou com __@RestController__.`

Com a anotação __@RequestMapping__ podemos definir uma rota de acesso em uma classe ou em um método.

Nas _classes_ essa anotação define uma rota raíz de acesso para todos os métodos existentes na classe em questão, por exemplo, você pode definir que a rota raíz seja __"/categoria"__.

_Exemplo:_
``` java
@RestController
@RequestMapping("/categoria")
public class ClasseTeste {

    // Métodos/Funcionalidades omitidas

    // Link de acesso: nome.do.site/categoria

}
```

Para definir uma URI nos métodos, basta utilizar as mesmas regras, colocando a anotação sobre o método desejado.

_Exemplo:_
``` java
@Controller
@RequestMapping("/categoria")
public class ClasseTeste {

    @RequestMapping("/livros")
    public String paginaInicial() {
        return "index";
    }

    // Link de acesso: nome.do.site/categoria/livros

}
```

- ## Métodos HTTP

> __@GetMapping__

O método _get_ recebe parâmetros passados no cabeçalho da requisição e podem ser vistos pela URI. Os parâmetros server para fazer buscas em base de dados, por exemplo, trazendo um dados específico ou uma massa de dados.

> __@PostMapping__

O método _post_ serve para inserir informação nova em base de dados, muito usando em formulário.

> __@PutMapping__ & __@PatchMapping__

Para atualização parcial, quando não temos a necessidade de criar novas informações, como é feito pelo método _post_.

> __@DeleteMapping__

Com o método _delete_ podemos apagar registros em base de dados.


- ## Diferença entre __@ResponseBody__ e __@RequestBody__

> __@ResponseBody__

> __@RequestMapping__
