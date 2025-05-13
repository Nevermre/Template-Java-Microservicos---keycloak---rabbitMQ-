
# 🧰 Projeto Template - Microserviços com Spring Boot

Este repositório é um **template base para novos projetos** com arquitetura de microserviços utilizando **Spring Boot**. Ele oferece uma estrutura inicial robusta e escalável, com foco em boas práticas de desenvolvimento, autenticação centralizada e comunicação assíncrona entre serviços.

## 🚀 Tecnologias Utilizadas

- **Spring Boot** – Framework principal para os microserviços  
- **RabbitMQ** – Broker de mensagens para comunicação assíncrona entre serviços  
- **Keycloak** – Provedor de identidade e autenticação baseado em OAuth2/OpenID  
- **Docker** – Empacotamento e orquestração dos serviços em contêineres  
- **Docker Compose** – Facilita o build e o up de todos os serviços integrados  

## 📦 Estrutura do Projeto
O projeto está dividido em a solução em formato de modulo e também com os microserviços separadamente

## 🔐 Autenticação
A autenticação e autorização são centralizadas com o Keycloak, já configurado para fornecer tokens JWT para os serviços.

##📬 Comunicação entre serviços
Os serviços se comunicam de forma assíncrona via RabbitMQ, permitindo desacoplamento e melhor escalabilidade.

## 🐳 Como Rodar o Projeto
Pré-requisitos
- Docker e Docker Compose instalados

- Porta 8080 (e outras necessárias) liberadas

## ✅ Funcionalidades Implementadas
- Autenticação com Keycloak

- Exemplo de microserviço com CRUD

- Comunicação via RabbitMQ

- Dockerização completa

- Integração com banco de dados

- Monitoramento e logs centralizados (em breve)

## 📚 Próximos Passos
Adicionar Prometheus e Grafana para monitoramento

Implementar logging centralizado com ELK stack

CI/CD com GitHub Actions
