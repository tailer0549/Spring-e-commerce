# API de E-commerce (Backend)

API REST desenvolvida com Java e Spring Boot para simular um sistema básico de e-commerce, com gerenciamento de usuários, pedidos, produtos, categorias e pagamentos.

## Tecnologias

- Java
- Spring Boot
- Spring Data JPA
- Hibernate
- H2 Database
- Maven

## Funcionalidades

- CRUD de usuários, produtos, pedidos e categorias
- Relacionamentos entre entidades (N:N, 1:N, 1:1)
- Registro de pedidos com itens e controle de preço no momento da compra
- Associação de pagamento ao pedido
- Tratamento básico de exceções

## Endpoints principais

### Usuários
```
GET    /users
GET    /users/{id}
POST   /users
PUT    /users/{id}
DELETE /users/{id}
```

### Produtos
```
GET    /products
GET    /products/{id}
```

### Pedidos
```
GET    /orders
GET    /orders/{id}
```

## Como rodar o projeto

### Clonar o repositório
```bash
git clone https://github.com/tailer0549/Spring-e-commerce.git
```

### Entrar na pasta
```bash
cd Spring-e-commerce
```

### Rodar o projeto
```bash
./mvnw spring-boot:run
```

## Acesso

A aplicação estará disponível em:

```
http://localhost:8080
```

Console do H2:

```
http://localhost:8080/h2-console
```

## Observações

Projeto focado no desenvolvimento de backend com Spring Boot, com ênfase em modelagem de dados e construção de APIs REST.
