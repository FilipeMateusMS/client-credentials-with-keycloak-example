📌# 🚀 Projeto: OAuth2 Client Credentials com Keycloak + Spring Boot

Este projeto demonstra a implementação do fluxo **Client Credentials** utilizando:

- Spring Boot
- OAuth2 Client
- Resource Server
- Keycloak
- Docker

O objetivo é simular comunicação entre serviços protegidos com autenticação baseada em token JWT.

---

## 🧱 Arquitetura

- **Client Service** → consome APIs protegidas
- **Resource Server** → expõe endpoints protegidos
- **Keycloak** → servidor de autenticação (OAuth2 / OpenID Connect)

---

## ⚙️ Tecnologias utilizadas

- Java 21+
- Spring Boot 4
- Spring Security
- OAuth2 Client / Resource Server
- Keycloak
- Docker / Docker Compose

---

## 🐳 Subindo o ambiente

Execute:

```bash
docker compose up -d
```

Acesse o endpoint http://localhost:9000/client/hello