# E-Commerce CRUD

## Introdução
Este projeto proporciona um conjunto básico de operações CRUD (Create, Read, Update, Delete) para a gestão de um e-commerce, utilizando o Java 17, o Framework Spring e o Banco de Dados relacional PostgreSQL. O objetivo do sistema é permitir a gestão de produtos, categorias, clientes e pedidos de uma loja online.


## Tecnologias Utilizadas

- **Java 17**
- **Spring Framework**
- **PostgreSQL**
## Arquitetura do Projeto

O projeto segue uma arquitetura baseada no padrão Service Pattern e Repository Pattern, com a divisão clara de responsabilidades entre as camadas e entidades.

### Estrutura do Projeto

``Entities``: Contém classes responsáveis por definir as entidades do sistema.

``enums``: Contém os tipos enumerados do sistema.

``Repositories``: Contém a interface do repositório e os métodos para inserir, ler, deletar e alterar os dados.

``Resources``: Contém classes responsáveis por receber as requisições HTTP e chamar os métodos apropriados nos serviços.

``Services``: Lógica de negócios reside aqui, onde os serviços manipulam as entidades.

## Endpoints da API
