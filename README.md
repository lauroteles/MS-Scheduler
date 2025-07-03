# 📅 MsScheduler

Projeto pessoal desenvolvido com o objetivo de aprender e testar um **microserviço de agendamento de notificações (scheduler)** usando **Spring Boot**, **JPA** e banco de dados relacional.

---

## 📌 Objetivo

Simular um sistema de envio de notificações, onde é possível:

- Registrar notificações com data e hora para envio futuro
- Associar notificações a diferentes canais de comunicação (`Email`, `SMS`, `Push`, `WhatsApp`)
- Controlar o status das notificações

---

## 🧱 Estrutura do Projeto

O projeto segue uma estrutura simples e modular:
```bash
src/
├── main/
│ ├── java/com/msscheduler/MSScheduler/
│ │ ├── MsSchedulerApplication.java
│ │ ├── entity/
│ │ │ ├── Notification.java
│ │ │ ├── Channel.java
│ │ │ ├── Status.java
```
## 🧩 Entidades

### 🔔 Notification

Representa uma notificação a ser enviada.

| Campo         | Tipo           | Descrição                     |
|---------------|----------------|-------------------------------|
| notificationId| `Long`         | ID da notificação             |
| dateTime      | `LocalDateTime`| Data e hora de envio          |
| destination   | `String`       | Destinatário                  |
| message       | `String`       | Conteúdo da mensagem          |
| channel       | `Channel`      | Canal de envio                |
| status        | `Status`       | Status da notificação         |

---

### 📡 Channel

Representa o canal de envio da notificação.

| Campo      | Tipo     | Descrição                     |
|------------|----------|-------------------------------|
| id         | `Long`   | ID do canal                   |
| description| `String` | Descrição (e.g., email, sms)  |

Canal também possui um `enum` embutido com os valores possíveis:

```java
EMAIL(1,"email"), SMS(2,"sms"), PUSH(3,"push"), WHATSAPP(4,"whatsapp")
🟢 Status
Representa o status atual da notificação (por exemplo: agendada, enviada, erro, etc.).

Campo	Tipo	Descrição
statusId	Long	ID do status
description	String	Descrição do status