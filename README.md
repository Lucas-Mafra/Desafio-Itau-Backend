# Desafio-Itau-Backend
Resolução do desafio para a vaga de Backend Junior do Itau. Este é as instruções para o [desafio](https://github.com/feltex/desafio-itau-backend).

## Índice

- [Sobre o Projeto](#sobre-o-projeto)
- [Tecnologias Utilizadas](#tecnologias-utilizadas)
- [Como Executar](#como-executar)
- [Contato](#contato)

## Sobre o Projeto

Este repositório contém a solução para o desafio de Backend Junior proposto pelo Itaú. O objetivo é demonstrar habilidades em desenvolvimento backend, seguindo boas práticas de código, arquitetura e testes.

## Tecnologias Utilizadas

- Java 17
- Spring Boot
- Maven

## Como Executar

1. Clone o repositório:
    ```bash
    git clone https://github.com/seu-usuario/desafio-itau-backend.git
    cd desafio-itau-backend
    ```

2. Compile e execute o projeto:
    ```bash
    mvn clean install
    mvn spring-boot:run
    ```

3. Acesse a aplicação em [http://localhost:8080](http://localhost:8080).

## Endpoints

A API expõe os seguintes endpoints:

### `POST /transacao`
Este é o endpoint que receberá as transações. Cada transação consiste em um valor e a data e hora em que ocorreu.
```bash
{
    "valor": 125.00,
    "dataHora": "2025-01-01T12:34:56.789-03:00"
}
```

### `GET /estatistica`
O endpoint tem como função apresentar estatísticas das transações realizadas nos últimos 60 segundos.
```bash
{
    "count": 20,
    "sum": 1234.56,
    "avg": 123.456,
    "min": 12.34,
    "max": 123.56
}
```

### `DELETE /transacao`
O endpoint tem a função de apagar todos os dados de transações que estão salvos.

> Todos os endpoints retornam respostas no formato JSON.

## Contato

- Nome: Lucas de Lima Mafra
- Email: lucas.lima.nave@gmail.com
- LinkedIn: [Lucas Mafra](https://linkedin.com/in/lucasmafra)