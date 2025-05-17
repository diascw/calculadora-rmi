#  Calculadora Remota com Java RMI

Este projeto implementa uma aplicação simples de calculadora usando **Java RMI (Remote Method Invocation)**. A aplicação é composta por:

- Uma **interface remota** com as operações básicas: soma, subtração, multiplicação e divisão
- Uma **implementação da interface**
- Um **servidor RMI** que registra o serviço
- Um **cliente RMI** que consome o serviço remoto

---

##  Como executar o projeto

### Pré-requisitos

- Java JDK (ex: JDK 17, 21 ou 22)
- Variável de ambiente `JAVA_HOME` configurada
- Comando `rmiregistry` disponível ou executável diretamente

---

### 1. Compile todos os arquivos `.java`

```bash
cd src
javac *.java
```

---

### 2. Inicie o RMI Registry

Se o Java estiver no PATH:
```bash
start rmiregistry
```

Ou diretamente pelo caminho:

```bash
& "C:\Program Files\Java\jdk-22\bin\rmiregistry.exe"
```

---

### 3. Execute o servidor

```bash
java CalculadoraServer
```

Saída esperada:
```
Servidor RMI pronto e aguardando conexões...
```

---

### 4. Execute o cliente (em outro terminal)

```bash
java CalculadoraClient
```

Saída esperada:
```
5 + 3 = 8.0
10 - 2 = 8.0
4 * 6 = 24.0
8 / 2 = 4.0
```

---

##  Observações

- Se ocorrer o erro `Port already in use: 1099`, verifique com `netstat -aon | findstr :1099` e finalize o processo com `taskkill /PID <pid> /F`.
- A comunicação acontece via objetos distribuídos na porta `1099`.


 
