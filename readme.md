# ⚡ Cadastro de Usuários

![Spring Boot](https://img.shields.io/badge/Spring%20Boot-4.0.1-brightgreen?style=for-the-badge&logo=springboot)
![Java](https://img.shields.io/badge/Java-25-orange?style=for-the-badge&logo=openjdk)
![H2](https://img.shields.io/badge/H2%20Database-In--Memory-blue?style=for-the-badge&logo=databricks)
![Lombok](https://img.shields.io/badge/Lombok-Automated-red?style=for-the-badge&logo=lombok)

> **Status do Sistema:** Operacional 🟢
> **Arquiteto de Software:** Guilherme Franco

Sistema de gerenciamento de dados de usuários de alta performance, construído sobre o ecossistema Spring Boot 4 e a vanguarda do Java 25.

---

## 🛰️ Visão Geral da Arquitetura

A aplicação segue o padrão de camadas moderno, garantindo desacoplamento entre a exposição da API e as regras de persistência.



### 🌌 Stack Tecnológica
* **Engine:** Java 25 (Loom-ready & Pattern Matching)
* **Framework:** Spring Boot 4.0.1
* **Persistência:** Spring Data JPA + Hibernate 7
* **Database:** H2 Engine (Runtime Isolation)
* **Sugar Code:** Project Lombok

---

## 📡 Protocolos de Comunicação (Endpoints)

Abaixo estão as rotas disponíveis no `UserController`. Todas as comunicações utilizam o contexto base: `/user`.

| Operação | Método | Endpoint | Parâmetros | Descrição |
| :--- | :--- | :--- | :--- | :--- |
| **CREATE** | `POST` | `/user` | `RequestBody (JSON)` | Registra uma nova entidade no sistema. |
| **READ** | `GET` | `/user` | `?email={email}` | Recupera dados via consulta de e-mail. |
| **UPDATE** | `PUT` | `/user` | `?id={id}`, `RequestBody` | Sincroniza e atualiza registros existentes. |
| **DELETE** | `DELETE` | `/user` | `?email={email}` | Remove permanentemente um registro. |

---

## 🛠️ Inicialização do Núcleo

Para replicar este ambiente em sua estação de trabalho:

### Requisitos Mínimos
- **JDK 25** (Obrigatório para compatibilidade de bytecode)
- **Maven 3.9+**

### Sequência de Boot
```bash
# Clone o repositório
git clone [https://github.com/ooguuiholiv/crud-usuarios-java-spring.git](https://github.com/ooguuiholiv/crud-usuarios-java-spring.git)

# Acesse o diretório
cd cadastro-usuario

# Compile e execute o kernel
mvn spring-boot:run