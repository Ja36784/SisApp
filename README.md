# SisApp - Sistema de Gestão de Funcionários

SisApp é uma aplicação Spring Boot que fornece funcionalidades para o gerenciamento de funcionários, incluindo cadastro, listagem, atualização e exclusão de dados de funcionários.

## Tecnologias Utilizadas

- Java 17
- Spring Boot 3
- Spring Data JPA
- Thymeleaf
- Jakarta Persistence API
- Banco de dados relacional (ex.: H2, MySQL, PostgreSQL)
  
## Estrutura do Projeto

- `com.ibm.sisapp`: Contém a classe principal que inicia a aplicação.
- `controller.FuncionarioController`: Controlador responsável por manipular as requisições HTTP relacionadas aos funcionários.
- `model.Funcionario`: Modelo de entidade de funcionário mapeado para a tabela `funcionarios`.
- `repository.FuncionarioRepository`: Interface de repositório que estende `JpaRepository` para realizar operações de CRUD.
- `templates`: Contém templates Thymeleaf para exibição do formulário de cadastro e listagem de funcionários.

## Endpoints Principais

  | Método HTTP | Endpoint                    | Descrição                                  |
|-------------|-------------------------------|--------------------------------------------|
| GET         | `/funcionario`                | Exibe o formulário de cadastro de funcionário. |
| GET         | `/funcionario/listagem`       | Exibe a lista de funcionários cadastrados. |
| POST        | `/funcionario`                | Cadastra um novo funcionário ou atualiza um existente. |
| GET         | `/funcionario/cadFuncionario` | Carrega o formulário para editar um funcionário existente. |
| DELETE      | `/funcionario`                | Remove um funcionário pelo ID. |

## Configuração do Banco de Dados

No arquivo `application.properties`, configure a conexão com o banco de dados:

```properties
spring.datasource.url=jdbc:h2:mem:sisapp
spring.datasource.driver-class-name=org.h2.Driver
spring.datasource.username=
spring.datasource.password=p
spring.h2.console.enabled=true
spring.jpa.hibernate.ddl-auto=update

Executando o Projeto
Clone o repositório:

bash
Copy code
git clone https://github.com/seu-usuario/sisapp.git
cd sisapp
Compile e execute o projeto usando Maven:

bash
Copy code
mvn spring-boot:run
Acesse a aplicação em http://localhost:8080/funcionario.

Estrutura das Páginas
Cadastro de Funcionário (/funcionario): Formulário para adicionar um novo funcionário ou editar um existente.
Listagem de Funcionários (/funcionario/listagem): Exibe todos os funcionários cadastrados com opções para editar e excluir.
Estrutura das Classes
Funcionario: Representa a entidade Funcionario, com atributos como nome, funcao, dtadm (data de admissão) e salario.
DadosCadastroFuncionario: Record para transporte de dados de funcionário.
FuncionarioController: Gerencia o fluxo da aplicação, manipulando as requisições HTTP e as respostas.
FuncionarioRepository: Interface que estende JpaRepository, fornecendo métodos para manipulação de dados no banco de dados.
Exemplo de Templates Thymeleaf
cadFuncionario.html: Formulário para cadastro e edição de funcionários.
listagem.html: Exibe a listagem de funcionários com opções de ação.

Contribuindo
Para contribuir com o projeto:
1.Faça um fork do repositório.
2.Crie um branch com sua feature (git checkout -b feature/sua-feature).
3.Faça commit de suas alterações (git commit -m 'Adiciona nova feature').
4.Envie para o branch (git push origin feature/sua-feature).
5.Abra um Pull Request.

Licença
Este projeto está licenciado sob a licença MIT - veja o arquivo LICENSE para mais detalhes.
Esse `README.md` fornece uma visão geral do projeto, tecnologias utilizadas, endpoints principais, configuração do banco de dados, e instruções de uso e contribuição.

