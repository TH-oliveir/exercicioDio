# Projeto Spring Boot com Persistência de Dados

Este projeto desafio de codigo exercício de uma aplicação Java desenvolvida com o framework Spring Boot, utilizando um banco de dados relacional para armazenamento e gerenciamento de dados.

## Tecnologias Utilizadas
- **Java 17**
- **Spring Boot 3.x**
- **Spring Data JPA**
- **Hibernate**
- **Banco de Dados (H2)**
- **Maven**
- **Spring Web** (para exposição de APIs REST)

## Configuração do Ambiente

### Pré-requisitos
Certifique-se de ter instalado:
- JDK 17 ou superior
- Maven 3.x
- Docker (opcional, para executar o banco de dados em container)

### Configuração do Banco de Dados
O projeto utiliza o Spring Data JPA para interação com o banco de dados. Para configurar a conexão, edite o arquivo `application.properties` ou `application.yml` localizado em `src/main/resources/`.

O H2 Database para testes, configure:
```properties
spring.datasource.url=jdbc:h2:mem:testdb
spring.datasource.driver-class-name=org.h2.Driver
spring.datasource.username=sa
spring.datasource.password=

spring.h2.console.enabled=true
spring.jpa.database-platform=org.hibernate.dialect.H2Dialect
spring.jpa.hibernate.ddl-auto=update
```

## Estrutura do Projeto
```
├── src/main/java/com/exemplo/projeto
│   ├── controller  # Controladores REST
│   ├── model       # Entidades JPA
│   ├── repository  # Interfaces de repositórios
│   ├── service     # Lógica de negócios
│   ├── config      # Configurações personalizadas
│   ├── ProjetoApplication.java  # Classe principal
├── src/main/resources
│   ├── application.properties  # Configuração do Spring Boot
├── pom.xml  # Arquivo de dependências do Maven
```

## Executando o Projeto

### Via Maven
Dentro do diretório raiz do projeto, execute:
```sh
mvn spring-boot:run
```

### Via JAR
Caso deseje gerar um JAR executável:
```sh
mvn clean package
java -jar target/seu-projeto-0.0.1-SNAPSHOT.jar
```

## Testando a API

Utilize o Postman, cURL ou outra ferramenta para testar as requisições REST.

Exemplo de requisição para listar recursos:
```sh
GET http://localhost:8080/api/entidade
```

## Docker (Opcional)
Para executar o banco de dados em container:
```sh
docker run --name mysql-container -e MYSQL_ROOT_PASSWORD=senha -e MYSQL_DATABASE=seu_banco_de_dados -p 3306:3306 -d mysql:latest
```

## Contribuição
Pull requests são bem-vindos. Para grandes mudanças, abra uma issue primeiro para discutir o que gostaria de alterar.

## Licença
Este projeto está sob a licença MIT. Veja o arquivo `LICENSE` para mais detalhes.

