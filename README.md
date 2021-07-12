
# __Projeto - Estudando Spring Framework__
- _Projeto prático usando Spring Framework._

## _Tecnologias usadas_

> __Base de dados MySQL__
- Foi definido como base de dados o MySQL v8.0.22.

> __Docker__
- Será o responsável por manter a base de dados, em container, disponível para acesso da aplicação durante o processo de desenvolvimento.

> __Postman__
- O Postman será usado para testar as requisições durante o desenvolvimento do projeto.

## _Dependências Spring Boot_
- Spring Web
- Thymeleaf
- Spring Data JPA
- MySQL Driver
- Spring Boot DevTools

# _Anotações do Spring Framework_
- ## Diferença entre __@Controller__ e __@RestController__

> @Controller

A anotação __@Controller__ é atribuída a uma classe quando o sistema tem a capacidade de responder ao cliente arquivos estáticos como HTML, CSS e JS.

> @RestController

Para o uso da anotação __@RestController__ o aplicação terá como resposta das requisições dados na forma JSON ou XML.

- ## Mapeamento de rotas

> @RequestMapping

Com a anotação __@RequestMapping__ podemos definir uma rota de acesso em uma classe ou em um método. Nas _classes_ essa anotação define uma rota raíz de acesso para os métodos existentes na classe em questão, por exemplo, você pode definir que a rota raíz seja __"/categoria"__.

_Exemplo:_
``` java

@RestController
@RequestMapping("/categoria")
public class ClasseTeste {

    // Métodos/Funcionalidades omitidas

    // Link de acesso: nome.do.site/categoria

}
```

Para definir uma URI para um método, basta utilizar as mesmas regras. Podemos usar __@RequestMapping__ tando em classes com __@Controller__ ou __@RestController__.

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
