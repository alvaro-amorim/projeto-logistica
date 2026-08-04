# ROADMAP — Central Inteligente de Operações Logísticas

> Documento mestre do projeto de aprendizado.
>
> Este arquivo define o escopo, a ordem dos estudos, a metodologia de ensino, o fluxo de desenvolvimento e os critérios para avançar.
>
> O progresso real será registrado separadamente em `docs/PROGRESSO.md`.

---

## 1. Visão geral

Este projeto será usado para aprender desenvolvimento de software do básico ao avançado por meio da construção completa de um sistema realista.

O sistema será inspirado em operações de transportadoras e centros logísticos. Ele começará como um programa simples executado no terminal e evoluirá gradualmente até se tornar uma aplicação web distribuída, com backend em Java e Spring Boot, frontend em JavaScript, banco de dados, mensageria, integração com Python e inteligência artificial, testes, observabilidade, containers, deploy e práticas de escalabilidade.

O objetivo não é apenas terminar um sistema.

O objetivo principal é compreender:

- como cada linha de código funciona;
- por que cada tecnologia existe;
- quando uma solução simples deixa de ser suficiente;
- como um projeto cresce de forma organizada;
- como as partes de um sistema se comunicam;
- como trabalhar com Git e GitHub;
- como aplicar práticas usadas no mercado;
- como relacionar os conteúdos do projeto aos conteúdos de concurso;
- como continuar aprendendo sem depender de copiar código pronto.

---

## 2. Nome provisório do projeto

**Central Inteligente de Operações Logísticas**

Nomes técnicos possíveis para o repositório:

```text
central-operacoes-logisticas
```

ou:

```text
logistics-control-platform
```

O nome poderá ser alterado futuramente sem modificar os objetivos educacionais.

---

## 3. Problema que o sistema pretende resolver

Em uma transportadora, existem coletas, notas fiscais, mercadorias, clientes, destinos, veículos, prazos e prioridades.

Em muitos cenários, essas informações chegam por planilhas, sistemas internos, documentos e comunicação verbal.

O operador precisa descobrir:

- quais coletas já chegaram;
- quais notas fiscais foram expedidas;
- quais mercadorias possuem prioridade;
- para qual setor de transferência cada mercadoria deve ir;
- quais cargas precisam embarcar no mesmo dia;
- quais itens estão atrasados;
- quais mercadorias ainda não foram localizadas;
- quais veículos estão aguardando;
- quais tarefas precisam ser executadas primeiro.

O sistema será criado para organizar essas informações e apoiar a tomada de decisão operacional.

---

## 4. Visão do produto final

Ao final do roadmap, o sistema poderá possuir:

- cadastro de clientes;
- cadastro de coletas;
- cadastro de notas fiscais;
- cadastro de mercadorias;
- cadastro de veículos;
- cadastro de rotas e destinos;
- definição de prioridades;
- controle de status;
- importação de planilhas;
- pesquisa e filtros;
- painel operacional;
- autenticação e autorização;
- histórico de alterações;
- alertas;
- processamento assíncrono;
- integração entre serviços;
- análise de documentos com IA;
- sugestão de setor de transferência;
- sugestão de prioridade;
- banco de dados relacional;
- banco de dados não relacional quando houver justificativa;
- cache;
- logs;
- métricas;
- testes automatizados;
- documentação da API;
- deploy;
- balanceamento de carga;
- escalabilidade horizontal;
- tolerância a falhas básica.

Nem todos esses recursos serão desenvolvidos desde o início.

Cada recurso será introduzido somente quando os conhecimentos necessários tiverem sido estudados.

---

## 5. Princípios do projeto

### 5.1 Aprender antes de abstrair

Não usaremos frameworks ou automações para esconder conceitos que ainda não foram compreendidos.

Exemplo:

Antes de usar Spring Data JPA, será necessário entender:

- objetos;
- classes;
- listas;
- persistência;
- SQL;
- relacionamentos;
- repositórios;
- responsabilidades de cada camada.

### 5.2 Começar simples e evoluir

A ordem será:

```text
Programa no terminal
    ↓
Código organizado
    ↓
Orientação a objetos
    ↓
Persistência em arquivos
    ↓
Banco de dados
    ↓
API REST
    ↓
Frontend
    ↓
Integrações
    ↓
Mensageria
    ↓
Concorrência
    ↓
Containers
    ↓
Deploy
    ↓
Escalabilidade
```

### 5.3 Digitar e compreender

O estudante deverá digitar o código.

Sempre que possível, cada trecho será explicado com:

- o que faz;
- por que existe;
- o que recebe;
- o que retorna;
- o que aconteceria sem ele;
- quais erros podem ocorrer;
- como testar;
- como modificar;
- como o conceito pode aparecer em prova;
- como é utilizado no mercado.

### 5.4 Não avançar com dúvidas fundamentais

Uma etapa só será considerada concluída quando o estudante conseguir explicar os principais conceitos com suas próprias palavras.

### 5.5 Práticas profissionais proporcionais

O projeto usará práticas reais de mercado, mas sem burocracia exagerada.

Usaremos:

- Git;
- GitHub;
- branches curtas;
- commits claros;
- Pull Requests;
- revisão de alterações;
- documentação;
- testes;
- integração contínua quando fizer sentido;
- issues quando forem úteis.

Não usaremos processos complexos apenas para parecer profissional.

### 5.6 Documentação como fonte da verdade

O repositório será a principal fonte de continuidade.

Os arquivos principais serão:

```text
README.md
docs/ROADMAP.md
docs/PROGRESSO.md
```

Em novos chats, o projeto deverá ser retomado a partir desses documentos.

---

## 6. Metodologia de ensino

Cada assunto seguirá, preferencialmente, este ciclo:

```text
1. Contexto
2. Explicação conceitual
3. Exemplo mínimo
4. Digitação do código
5. Execução
6. Análise do resultado
7. Alteração controlada
8. Exercício guiado
9. Exercício independente
10. Revisão
11. Perguntas de compreensão
12. Atualização do PROGRESSO.md
13. Commit
14. Pull Request
15. Merge
```

### 6.1 Contexto

Antes do código, será explicado qual problema está sendo resolvido.

### 6.2 Exemplo mínimo

O conceito será apresentado inicialmente com o menor exemplo útil possível.

### 6.3 Aplicação no projeto

Depois do exemplo, o conceito será aplicado ao sistema logístico.

### 6.4 Alteração controlada

O estudante modificará valores, condições ou estruturas para observar como o comportamento muda.

### 6.5 Exercício guiado

O primeiro exercício será construído com orientação.

### 6.6 Exercício independente

O estudante receberá uma tarefa pequena para resolver com menor ajuda.

### 6.7 Revisão por perguntas

Ao final da etapa, o estudante responderá perguntas como:

1. O que foi implementado?
2. Qual problema essa implementação resolve?
3. Quais conceitos novos foram utilizados?
4. O que cada parte principal do código faz?
5. Qual erro apareceu?
6. Como o erro foi identificado?
7. Como o erro foi corrigido?
8. O que ainda não está totalmente claro?
9. Você conseguiria recriar a solução sem consultar?
10. Qual será o próximo passo?

### 6.8 Registro do progresso

As respostas serão registradas em `docs/PROGRESSO.md`.

---

## 7. Estratégia de Git e GitHub

Será usado um GitHub Flow simplificado.

### 7.1 Fluxo padrão

```text
1. Atualizar a main
2. Criar uma branch
3. Desenvolver uma pequena entrega
4. Executar e testar
5. Revisar as alterações
6. Criar commits claros
7. Enviar a branch
8. Abrir Pull Request
9. Revisar o diff
10. Fazer merge
11. Apagar a branch
12. Atualizar a main local
```

### 7.2 Comandos básicos

```bash
git switch main
git pull origin main
git switch -c feat/nome-da-tarefa
```

Depois das alterações:

```bash
git status
git diff
git add .
git commit -m "feat: descreve a entrega"
git push -u origin feat/nome-da-tarefa
```

Depois do merge:

```bash
git switch main
git pull origin main
git branch -d feat/nome-da-tarefa
```

### 7.3 Tipos de branch

```text
docs/
feat/
fix/
test/
refactor/
chore/
```

Exemplos:

```text
docs/estrutura-inicial
feat/cadastro-coleta-terminal
feat/listagem-coletas
fix/leitura-dados-scanner
test/calculo-prioridade
refactor/separar-menu
chore/configurar-maven
```

### 7.4 Padrão de commits

Será utilizado um modelo simples inspirado em Conventional Commits:

```text
feat: nova funcionalidade
fix: correção de erro
docs: documentação
test: testes
refactor: reorganização sem alterar comportamento
chore: configuração ou manutenção
style: formatação sem mudança de lógica
```

Exemplos:

```text
docs: cria roadmap inicial do projeto
feat: adiciona cadastro de coleta pelo terminal
fix: corrige leitura do nome do cliente
refactor: extrai cadastro para método separado
test: adiciona testes para regra de prioridade
chore: configura projeto Maven
```

### 7.5 Pull Requests

Cada Pull Request deverá informar:

```markdown
## O que foi implementado

## O que foi aprendido

## Como testar

## Decisões tomadas

## Pendências

## Checklist

- [ ] Código executado
- [ ] Comportamento conferido
- [ ] Documentação atualizada
- [ ] Sem arquivos desnecessários
```

### 7.6 Issues

Issues serão usadas quando ajudarem a organizar uma entrega ou registrar um problema.

Não será criada uma issue para cada modificação pequena.

### 7.7 Proteção da branch principal

A branch `main` deverá representar uma versão funcional do projeto.

Alterações importantes deverão chegar à `main` por Pull Request.

---

## 8. Estrutura progressiva do repositório

A estrutura inicial será simples:

```text
central-operacoes-logisticas/
├── .gitignore
├── README.md
└── docs/
    ├── ROADMAP.md
    └── PROGRESSO.md
```

Depois, poderá evoluir para:

```text
central-operacoes-logisticas/
├── backend-java/
├── frontend/
├── servico-ia-python/
├── infraestrutura/
├── docs/
├── scripts/
├── .github/
├── README.md
└── docker-compose.yml
```

As pastas só serão criadas quando houver necessidade real.

---

# PARTE I — FUNDAMENTOS

## 9. Fase 0 — Preparação do ambiente e do repositório

### Objetivos

- preparar o ambiente;
- entender o papel de cada ferramenta;
- criar o repositório;
- aprender o fluxo básico de Git e GitHub;
- estabelecer a documentação do projeto.

### Conteúdos

- diferença entre linguagem, compilador, JDK, JRE e JVM;
- instalação e verificação do Java;
- terminal;
- VS Code;
- extensões essenciais;
- Git;
- GitHub;
- repositório local e remoto;
- `git init`;
- `git clone`;
- `git status`;
- `git add`;
- `git commit`;
- `git push`;
- `git pull`;
- `.gitignore`;
- arquivos Markdown;
- README;
- branches;
- Pull Requests;
- merge.

### Entregáveis

- repositório criado;
- `README.md`;
- `docs/ROADMAP.md`;
- `docs/PROGRESSO.md`;
- `.gitignore`;
- primeiro Pull Request;
- primeiro merge.

### Branch sugerida

```text
docs/estrutura-inicial
```

### Commits sugeridos

```text
chore: cria estrutura inicial do repositório
docs: adiciona roadmap do projeto
docs: adiciona registro inicial de progresso
```

### Critérios para concluir

O estudante deve conseguir explicar:

- o que é um repositório;
- diferença entre Git e GitHub;
- o que é commit;
- o que é branch;
- o que é Pull Request;
- o que é merge;
- por que a `main` deve permanecer funcional.

---

## 10. Fase 1 — Fundamentos de programação com Java

### Objetivo do projeto

Criar a primeira versão do sistema no terminal.

### Funcionalidades iniciais

- mostrar mensagens;
- receber dados do usuário;
- cadastrar uma coleta;
- calcular prioridade simples;
- exibir um resumo.

### Conteúdos

#### 10.1 Estrutura de um programa Java

- arquivos `.java`;
- arquivos `.class`;
- compilação;
- execução;
- classe;
- método `main`;
- blocos;
- instruções;
- ponto e vírgula;
- comentários;
- convenções de nomes.

#### 10.2 Saída de dados

- `System.out.print`;
- `System.out.println`;
- concatenação;
- caracteres especiais;
- quebra de linha;
- formatação básica.

#### 10.3 Variáveis e tipos

- declaração;
- inicialização;
- atribuição;
- `String`;
- `char`;
- `byte`;
- `short`;
- `int`;
- `long`;
- `float`;
- `double`;
- `boolean`;
- tipos primitivos;
- tipos por referência;
- constantes com `final`;
- conversão de tipos;
- casting.

#### 10.4 Entrada de dados

- `Scanner`;
- `System.in`;
- `nextLine`;
- `nextInt`;
- `nextDouble`;
- `nextBoolean`;
- diferença entre leitura de texto e número;
- problema da quebra de linha;
- validação inicial;
- argumentos em `String[] args`;
- visão geral de outras formas de entrada.

#### 10.5 Operadores

- aritméticos;
- atribuição;
- comparação;
- lógicos;
- incremento;
- decremento;
- precedência;
- expressões;
- operador ternário.

#### 10.6 Condicionais

- `if`;
- `else`;
- `else if`;
- condições compostas;
- `switch`;
- regras de prioridade;
- validação de estados.

#### 10.7 Repetições

- `while`;
- `do while`;
- `for`;
- controle de menu;
- repetição de cadastro;
- `break`;
- `continue`;
- loops aninhados.

#### 10.8 Métodos

- responsabilidade;
- assinatura;
- parâmetros;
- argumentos;
- retorno;
- `void`;
- escopo;
- variáveis locais;
- sobrecarga;
- decomposição de problemas.

#### 10.9 Arrays e matrizes

- declaração;
- criação;
- índices;
- percorrer arrays;
- limitações;
- matrizes;
- aplicação em exercícios.

#### 10.10 Strings

- comparação com `equals`;
- `equalsIgnoreCase`;
- tamanho;
- busca;
- substituição;
- divisão;
- conversão;
- imutabilidade;
- `StringBuilder`.

### Entregáveis

- menu no terminal;
- cadastro de coleta;
- classificação simples de prioridade;
- listagem;
- busca por número;
- atualização de status;
- encerramento seguro do programa.

### Branches possíveis

```text
feat/primeiro-programa-java
feat/entrada-dados-coleta
feat/menu-terminal
feat/regra-prioridade
feat/listagem-coletas
fix/leitura-scanner
refactor/extrair-metodos
```

### Critérios para concluir

O estudante deverá conseguir:

- criar um programa Java sem copiar;
- compilar e executar;
- receber entradas;
- usar condições;
- usar repetições;
- criar métodos;
- explicar o fluxo do programa;
- identificar erros de sintaxe básicos;
- resolver exercícios simples.

---

## 11. Fase 2 — Orientação a objetos

### Objetivo do projeto

Transformar as informações do sistema em modelos organizados.

### Entidades iniciais

- `Coleta`;
- `Cliente`;
- `NotaFiscal`;
- `Mercadoria`;
- `Veiculo`;
- `Destino`;
- `Usuario`.

### Conteúdos

- paradigma orientado a objetos;
- classe;
- objeto;
- instância;
- estado;
- comportamento;
- atributos;
- métodos;
- construtores;
- palavra-chave `this`;
- encapsulamento;
- modificadores de acesso;
- getters;
- setters;
- validação dentro dos objetos;
- métodos estáticos;
- membros de instância;
- composição;
- associação;
- agregação;
- herança;
- classe abstrata;
- interfaces;
- implementação;
- polimorfismo;
- sobrescrita;
- sobrecarga;
- `Object`;
- `toString`;
- `equals`;
- `hashCode`;
- enums;
- records;
- imutabilidade;
- responsabilidade única;
- coesão;
- acoplamento.

### Aplicações no projeto

- criar objeto `Coleta`;
- criar objeto `Cliente`;
- relacionar coleta e cliente;
- representar status com `enum`;
- representar prioridade com `enum`;
- validar transições de status;
- separar menu, regras e dados.

### Entregáveis

- modelo de domínio;
- classes organizadas;
- menu usando objetos;
- lista de objetos;
- busca e atualização;
- regras encapsuladas.

### Critérios para concluir

O estudante deverá conseguir:

- explicar classe e objeto;
- criar construtores;
- proteger atributos;
- justificar encapsulamento;
- modelar relacionamentos;
- usar interface;
- explicar polimorfismo;
- escolher entre herança e composição em exemplos simples.

---

## 12. Fase 3 — Coleções, generics, datas, exceções e arquivos

### Objetivo do projeto

Permitir que o sistema manipule diversos registros com segurança e persista dados temporariamente.

### Conteúdos

#### 12.1 Coleções

- `List`;
- `ArrayList`;
- `Set`;
- `HashSet`;
- `Map`;
- `HashMap`;
- filas;
- pilhas;
- iteração;
- busca;
- ordenação;
- comparadores;
- remoção;
- duplicidade;
- complexidade básica.

#### 12.2 Generics

- tipos genéricos;
- segurança de tipos;
- classes genéricas;
- métodos genéricos;
- wildcards em nível introdutório.

#### 12.3 Datas e horários

- `LocalDate`;
- `LocalTime`;
- `LocalDateTime`;
- duração;
- períodos;
- formatação;
- fusos horários em nível introdutório.

#### 12.4 Exceções

- erros de compilação;
- erros de execução;
- exceções verificadas;
- exceções não verificadas;
- `try`;
- `catch`;
- `finally`;
- `throw`;
- `throws`;
- exceções personalizadas;
- mensagens de erro;
- validação de entrada.

#### 12.5 Arquivos

- leitura;
- escrita;
- caminhos;
- `Path`;
- `Files`;
- CSV;
- serialização simples;
- persistência provisória;
- importação de planilhas em formato CSV.

#### 12.6 Programação funcional básica

- lambdas;
- streams;
- `filter`;
- `map`;
- `sorted`;
- `collect`;
- `Optional`;
- uso consciente;
- diferença entre código imperativo e declarativo.

### Entregáveis

- múltiplas coletas;
- filtros;
- ordenação por prioridade;
- importação de CSV;
- exportação de relatório;
- tratamento de erros;
- persistência em arquivo.

### Critérios para concluir

O estudante deverá conseguir:

- escolher uma coleção apropriada;
- evitar duplicidades;
- buscar registros;
- ordenar;
- tratar exceções;
- ler e escrever arquivos;
- explicar uma stream simples.

---

## 13. Fase 4 — Organização de projeto e boas práticas

### Objetivo do projeto

Sair de um programa concentrado em poucas classes e criar uma estrutura sustentável.

### Conteúdos

- pacotes;
- separação de responsabilidades;
- arquitetura em camadas;
- domínio;
- aplicação;
- infraestrutura;
- apresentação;
- `model`;
- `service`;
- `repository`;
- `controller`;
- `dto`;
- `exception`;
- `util`;
- dependências entre camadas;
- Clean Code;
- nomes claros;
- métodos pequenos;
- eliminação de duplicação;
- comentários úteis;
- refatoração;
- SOLID;
- padrões de projeto introdutórios;
- `Factory`;
- `Strategy`;
- `Repository`;
- `Builder` quando houver necessidade;
- dívida técnica;
- revisão de código.

### Ferramentas

- Maven;
- estrutura padrão Maven;
- `pom.xml`;
- dependências;
- plugins;
- build;
- testes;
- empacotamento.

### Entregáveis

- projeto Maven;
- pacotes organizados;
- camadas iniciais;
- código refatorado;
- regras de negócio isoladas;
- documentação técnica básica.

### Critérios para concluir

O estudante deverá conseguir:

- explicar por que não colocar tudo no `main`;
- identificar responsabilidades;
- criar uma classe de serviço;
- criar um repositório em memória;
- reconhecer duplicação;
- realizar uma refatoração segura.

---

# PARTE II — QUALIDADE, DADOS E BACKEND

## 14. Fase 5 — Testes automatizados

### Objetivo do projeto

Aprender a comprovar automaticamente que as regras continuam funcionando.

### Conteúdos

- importância dos testes;
- teste manual;
- teste automatizado;
- teste unitário;
- teste de integração;
- pirâmide de testes;
- JUnit;
- assertions;
- preparação, execução e verificação;
- Arrange, Act, Assert;
- nomes de teste;
- casos felizes;
- casos de erro;
- testes parametrizados;
- Mockito;
- mocks;
- stubs;
- dependências;
- cobertura;
- limite da cobertura;
- TDD como prática opcional;
- regressão.

### Regras que deverão ser testadas

- cálculo de prioridade;
- criação de coleta;
- transição de status;
- validação de campos;
- busca;
- ordenação;
- importação;
- duplicidade.

### Entregáveis

- suíte inicial de testes;
- testes unitários;
- testes de integração quando aplicável;
- execução dos testes pelo Maven.

### Branches possíveis

```text
test/regra-prioridade
test/coleta-service
test/importacao-csv
```

### Critérios para concluir

O estudante deverá conseguir:

- escrever um teste simples;
- explicar o que está sendo testado;
- interpretar falha;
- corrigir regressão;
- diferenciar teste unitário de integração.

---

## 15. Fase 6 — Banco de dados relacional e SQL

### Objetivo do projeto

Substituir a persistência em memória ou arquivos por um banco de dados relacional.

### Banco sugerido

**PostgreSQL**

### Conteúdos de banco de dados

- dado;
- informação;
- banco de dados;
- SGBD;
- tabela;
- linha;
- coluna;
- esquema;
- tipos;
- chave primária;
- chave estrangeira;
- restrições;
- nulidade;
- unicidade;
- relacionamento;
- cardinalidade;
- modelo entidade-relacionamento;
- normalização;
- primeira, segunda e terceira formas normais;
- integridade;
- transação;
- ACID;
- índice;
- plano de execução em nível introdutório;
- backup básico;
- migração.

### Conteúdos SQL

- `CREATE`;
- `ALTER`;
- `DROP`;
- `INSERT`;
- `SELECT`;
- `UPDATE`;
- `DELETE`;
- `WHERE`;
- `ORDER BY`;
- `GROUP BY`;
- `HAVING`;
- agregações;
- `JOIN`;
- subconsultas;
- views;
- constraints;
- índices;
- transações;
- commit;
- rollback.

### Integração com Java

- JDBC;
- conexão;
- statements;
- prepared statements;
- SQL injection;
- mapeamento manual;
- transações;
- pool de conexões em nível conceitual.

### Modelo inicial

```text
Cliente
Coleta
NotaFiscal
Mercadoria
Veiculo
Destino
HistoricoStatus
Usuario
```

### Entregáveis

- diagrama do banco;
- scripts SQL;
- integração Java e PostgreSQL;
- operações de CRUD;
- consultas com relacionamentos;
- transações básicas.

### Critérios para concluir

O estudante deverá conseguir:

- criar tabelas;
- modelar relacionamentos;
- escrever CRUD em SQL;
- usar JOIN;
- explicar chave primária e estrangeira;
- explicar transação;
- conectar Java ao PostgreSQL.

---

## 16. Fase 7 — HTTP, internet e APIs REST

### Objetivo do projeto

Entender como sistemas se comunicam e preparar o sistema para funcionar como backend.

### Conteúdos de redes e web

- cliente e servidor;
- IP;
- porta;
- DNS;
- domínio;
- URL;
- TCP;
- HTTP;
- HTTPS;
- requisição;
- resposta;
- headers;
- body;
- JSON;
- serialização;
- latência;
- timeout;
- conexão;
- protocolo;
- stateless;
- cookies;
- sessões;
- CORS.

### Métodos HTTP

- `GET`;
- `POST`;
- `PUT`;
- `PATCH`;
- `DELETE`.

### Status HTTP

- `200`;
- `201`;
- `204`;
- `400`;
- `401`;
- `403`;
- `404`;
- `409`;
- `422`;
- `500`;
- `503`.

### REST

- recursos;
- endpoints;
- representação;
- idempotência;
- versionamento;
- paginação;
- filtros;
- ordenação;
- boas práticas;
- limites do REST.

### Ferramentas

- navegador;
- DevTools;
- `curl`;
- Postman ou Insomnia;
- JSON;
- documentação.

### Entregáveis

- desenho inicial da API;
- contratos de requisição e resposta;
- testes manuais de HTTP;
- documentação inicial dos endpoints.

### Critérios para concluir

O estudante deverá conseguir:

- explicar uma requisição HTTP;
- diferenciar método e status;
- enviar JSON;
- explicar cliente e servidor;
- desenhar endpoints básicos.

---

## 17. Fase 8 — Spring Boot

### Objetivo do projeto

Transformar o sistema em uma API REST profissional.

### Conteúdos

- Spring Framework;
- Spring Boot;
- inversão de controle;
- injeção de dependência;
- beans;
- configuração;
- auto-configuração;
- starters;
- propriedades;
- profiles;
- controllers;
- services;
- repositories;
- DTOs;
- entidades;
- mapeamento;
- validação;
- tratamento global de exceções;
- logs;
- configuração por ambiente;
- dependências;
- inicialização da aplicação.

### Spring Web

- `@RestController`;
- `@RequestMapping`;
- `@GetMapping`;
- `@PostMapping`;
- `@PutMapping`;
- `@PatchMapping`;
- `@DeleteMapping`;
- `@PathVariable`;
- `@RequestParam`;
- `@RequestBody`;
- `ResponseEntity`.

### Spring Data JPA

- ORM;
- JPA;
- Hibernate;
- entidade;
- identidade;
- relacionamentos;
- lazy loading;
- eager loading;
- repositories;
- consultas derivadas;
- JPQL;
- paginação;
- transações;
- problemas N+1;
- migrações.

### Validação

- Bean Validation;
- campos obrigatórios;
- tamanhos;
- formatos;
- validação customizada;
- mensagens de erro.

### Documentação

- OpenAPI;
- Swagger UI;
- contratos;
- exemplos.

### Migrações

- Flyway ou Liquibase;
- versionamento do banco;
- scripts reproduzíveis.

### Entregáveis

- API Spring Boot;
- CRUD de coletas;
- CRUD de clientes;
- relacionamento com notas fiscais;
- filtros;
- paginação;
- validação;
- tratamento de erros;
- Swagger;
- migrações;
- testes.

### Critérios para concluir

O estudante deverá conseguir:

- criar um endpoint;
- explicar injeção de dependência;
- separar controller, service e repository;
- persistir entidade;
- criar DTO;
- tratar erros;
- testar a API.

---

## 18. Fase 9 — Segurança de aplicações

### Objetivo do projeto

Controlar quem pode acessar e modificar dados.

### Conteúdos

- autenticação;
- autorização;
- identidade;
- credenciais;
- senha;
- hash;
- salt;
- sessão;
- token;
- JWT;
- roles;
- permissões;
- princípio do menor privilégio;
- Spring Security;
- filtros;
- CORS;
- CSRF;
- SQL injection;
- XSS;
- validação de entrada;
- exposição de dados;
- secrets;
- variáveis de ambiente;
- OWASP Top 10 em nível introdutório;
- auditoria;
- logs sem dados sensíveis.

### Perfis possíveis

```text
OPERADOR
SUPERVISOR
ADMINISTRADOR
```

### Entregáveis

- cadastro de usuário;
- login;
- autenticação;
- autorização por perfil;
- proteção de endpoints;
- histórico de alterações;
- configuração segura de secrets.

### Critérios para concluir

O estudante deverá conseguir:

- explicar autenticação e autorização;
- proteger um endpoint;
- explicar hash de senha;
- usar variáveis de ambiente;
- identificar riscos comuns.

---

# PARTE III — FRONTEND E INTEGRAÇÃO

## 19. Fase 10 — Fundamentos de frontend

### Objetivo do projeto

Criar uma interface para utilizar a API.

### Conteúdos HTML

- estrutura;
- elementos;
- formulários;
- inputs;
- labels;
- tabelas;
- semântica;
- acessibilidade básica.

### Conteúdos CSS

- seletores;
- box model;
- display;
- flexbox;
- grid;
- responsividade;
- estados;
- organização.

### Conteúdos JavaScript

- variáveis;
- tipos;
- funções;
- objetos;
- arrays;
- condições;
- repetições;
- módulos;
- DOM;
- eventos;
- formulários;
- validação;
- `fetch`;
- Promises;
- `async`;
- `await`;
- tratamento de erros;
- JSON;
- armazenamento local;
- módulos;
- escopo;
- closures em nível introdutório.

### Integração

- chamar API;
- enviar dados;
- listar coletas;
- atualizar status;
- filtrar;
- mostrar erros;
- loading;
- autenticação;
- token.

### Entregáveis

- tela de login;
- cadastro de coleta;
- listagem;
- detalhes;
- filtros;
- atualização de status;
- painel de prioridades.

### Critérios para concluir

O estudante deverá conseguir:

- criar formulário;
- capturar evento;
- enviar requisição;
- tratar resposta;
- atualizar DOM;
- explicar comunicação frontend-backend.

---

## 20. Fase 11 — Framework frontend

### Framework sugerido

**React**, depois que JavaScript puro estiver compreendido.

### Conteúdos

- componentes;
- propriedades;
- estado;
- eventos;
- hooks;
- efeitos;
- formulários;
- roteamento;
- consumo de API;
- componentes reutilizáveis;
- organização;
- gerenciamento de estado;
- autenticação;
- testes;
- build;
- variáveis de ambiente.

### Observação

O framework poderá ser substituído se houver uma justificativa educacional ou profissional.

### Entregáveis

- frontend reorganizado em componentes;
- rotas;
- painel;
- formulários;
- autenticação;
- experiência de uso consistente.

---

# PARTE IV — PYTHON E INTELIGÊNCIA ARTIFICIAL

## 21. Fase 12 — Serviço Python

### Objetivo do projeto

Integrar os conhecimentos da pós-graduação em IA ao sistema.

### Conteúdos Python aplicados

- ambiente virtual;
- dependências;
- módulos;
- funções;
- classes;
- tipagem;
- tratamento de erros;
- leitura de arquivos;
- testes;
- API com FastAPI;
- validação com modelos;
- documentação automática;
- logs;
- configuração;
- Docker.

### Possíveis responsabilidades do serviço

- leitura de nota fiscal;
- extração de campos;
- classificação de prioridade;
- sugestão de destino;
- sugestão de setor;
- resumo operacional;
- detecção de inconsistências;
- análise de texto;
- OCR;
- regras híbridas;
- uso de LLM como fallback.

### Comunicação inicial

```text
Spring Boot → HTTP → FastAPI
```

### Entregáveis

- API Python;
- endpoint de análise;
- contrato JSON;
- integração Java-Python;
- tratamento de indisponibilidade;
- testes.

### Critérios para concluir

O estudante deverá conseguir:

- executar serviço Python;
- criar endpoint;
- enviar dados do Java;
- receber resposta;
- tratar erro;
- explicar limites da IA.

---

## 22. Fase 13 — Fundamentos de IA aplicados ao projeto

### Conteúdos

- dado de treinamento;
- dado de validação;
- dado de teste;
- features;
- labels;
- classificação;
- regressão;
- clustering;
- métricas;
- precisão;
- recall;
- F1;
- matriz de confusão;
- overfitting;
- underfitting;
- baseline;
- regras;
- modelos;
- embeddings;
- LLM;
- prompt;
- contexto;
- custo;
- latência;
- alucinação;
- avaliação;
- observabilidade;
- privacidade;
- segurança;
- human in the loop.

### Estratégia educacional

Começar por regras determinísticas.

Depois comparar:

```text
Regra fixa
Modelo clássico
LLM
Pipeline híbrido
```

### Entregáveis

- baseline;
- conjunto de exemplos;
- avaliação;
- classificação inicial;
- integração;
- relatório de erros;
- decisão de fallback.

---

# PARTE V — MENSAGERIA, CONCORRÊNCIA E SISTEMAS DISTRIBUÍDOS

## 23. Fase 14 — Processamento assíncrono e mensageria

### Objetivo do projeto

Executar tarefas sem bloquear o fluxo principal.

### Tecnologia inicial sugerida

**RabbitMQ**

Kafka poderá ser estudado posteriormente.

### Conteúdos

- síncrono;
- assíncrono;
- fila;
- mensagem;
- evento;
- produtor;
- consumidor;
- exchange;
- routing key;
- acknowledgement;
- retry;
- dead letter queue;
- ordenação;
- entrega;
- duplicidade;
- idempotência;
- consistência eventual;
- observabilidade;
- falha de consumidor;
- poison message.

### Casos de uso

- análise de nota fiscal;
- envio de alerta;
- geração de relatório;
- processamento de planilha;
- atualização de prioridade;
- registro de auditoria.

### Fluxo exemplo

```text
API recebe nota
    ↓
Publica mensagem
    ↓
Consumidor processa
    ↓
Atualiza resultado
    ↓
Operador recebe status
```

### Entregáveis

- RabbitMQ local;
- produtor;
- consumidor;
- retry;
- dead letter queue;
- registro de falhas;
- teste de duplicidade.

### Critérios para concluir

O estudante deverá conseguir:

- explicar por que usar fila;
- publicar mensagem;
- consumir;
- tratar falha;
- explicar idempotência;
- diferenciar processamento síncrono e assíncrono.

---

## 24. Fase 15 — Concorrência e paralelismo

### Objetivo do projeto

Entender o que acontece quando várias tarefas ou usuários operam simultaneamente.

### Conteúdos

- processo;
- thread;
- concorrência;
- paralelismo;
- escalonamento;
- estado compartilhado;
- condição de corrida;
- seção crítica;
- sincronização;
- lock;
- deadlock;
- starvation;
- thread safety;
- imutabilidade;
- atomicidade;
- `Thread`;
- `Runnable`;
- `Callable`;
- `Future`;
- `ExecutorService`;
- pools;
- concorrência no banco;
- isolamento;
- optimistic locking;
- pessimistic locking;
- transações;
- filas como estratégia de controle.

### Cenários do projeto

- dois operadores atualizando a mesma coleta;
- múltiplas notas sendo processadas;
- concorrência em estoque ou pátio;
- tarefas paralelas;
- geração simultânea de relatórios.

### Entregáveis

- simulação de condição de corrida;
- correção;
- processamento com executor;
- controle de versão de entidade;
- testes concorrentes básicos.

### Critérios para concluir

O estudante deverá conseguir:

- explicar concorrência;
- identificar estado compartilhado;
- reproduzir uma condição de corrida;
- aplicar uma solução;
- explicar riscos de locks.

---

## 25. Fase 16 — Bancos não relacionais e cache

### Objetivo do projeto

Entender quando um banco relacional não é a única ferramenta necessária.

### Tecnologias possíveis

- Redis;
- MongoDB.

### Conteúdos

- SQL e NoSQL;
- documento;
- chave-valor;
- consistência;
- disponibilidade;
- modelagem orientada a acesso;
- cache;
- TTL;
- invalidação;
- cache hit;
- cache miss;
- dados temporários;
- sessões;
- rate limiting;
- filas simples;
- riscos de inconsistência;
- CAP em nível introdutório.

### Uso recomendado no projeto

Redis poderá ser utilizado para:

- cache de consultas;
- rate limiting;
- dados temporários;
- status de processamento;
- sessões, se aplicável.

MongoDB só deverá ser adicionado se existir um caso de uso justificável.

### Critérios para concluir

O estudante deverá conseguir:

- diferenciar relacional e não relacional;
- explicar cache;
- escolher dados adequados;
- evitar usar NoSQL apenas por moda.

---

# PARTE VI — INFRAESTRUTURA, DEVOPS E ESCALABILIDADE

## 26. Fase 17 — Linux, processos e infraestrutura básica

### Conteúdos

- sistema operacional;
- processos;
- memória;
- CPU;
- disco;
- rede;
- portas;
- permissões;
- usuários;
- variáveis de ambiente;
- terminal Linux;
- arquivos;
- diretórios;
- serviços;
- logs;
- sinais;
- gerenciamento de processos;
- SSH;
- firewall básico.

### Entregáveis

- execução do projeto em Linux;
- configuração por ambiente;
- logs acessíveis;
- documentação de execução.

---

## 27. Fase 18 — Docker e containers

### Conteúdos

- máquina virtual e container;
- imagem;
- container;
- Dockerfile;
- camada;
- build;
- registry;
- volume;
- rede;
- porta;
- variável de ambiente;
- health check;
- Docker Compose;
- persistência;
- dependências entre serviços.

### Serviços possíveis

```text
backend-java
frontend
postgres
rabbitmq
redis
servico-ia-python
```

### Entregáveis

- Dockerfile do backend;
- Dockerfile do serviço Python;
- Dockerfile do frontend;
- Docker Compose;
- ambiente local reproduzível;
- health checks.

### Critérios para concluir

O estudante deverá conseguir:

- criar imagem;
- executar container;
- mapear porta;
- configurar volume;
- subir múltiplos serviços;
- explicar rede entre containers.

---

## 28. Fase 19 — CI/CD com GitHub Actions

### Objetivo do projeto

Automatizar verificações e entregas repetitivas.

### Conteúdos

- integração contínua;
- entrega contínua;
- deploy contínuo;
- workflow;
- job;
- step;
- runner;
- triggers;
- secrets;
- artefatos;
- cache de dependências;
- ambientes;
- aprovação;
- rollback.

### Pipeline inicial

Ao abrir Pull Request:

```text
Checkout
    ↓
Instalar Java
    ↓
Compilar
    ↓
Executar testes
    ↓
Validar build
```

Depois:

- testes do frontend;
- testes do Python;
- build de imagens;
- análise estática;
- deploy.

### Entregáveis

- workflow de CI;
- badge no README;
- bloqueio conceitual de merge quando testes falham;
- pipeline de deploy quando aplicável.

### Critérios para concluir

O estudante deverá conseguir:

- interpretar um workflow;
- identificar falha;
- corrigir pipeline;
- explicar por que CI protege a `main`.

---

## 29. Fase 20 — Deploy

### Conteúdos

- ambiente local;
- desenvolvimento;
- homologação;
- produção;
- domínio;
- DNS;
- HTTPS;
- certificado;
- reverse proxy;
- Nginx;
- configuração;
- logs;
- banco gerenciado;
- backup;
- secrets;
- custo;
- disponibilidade;
- rollback;
- migração.

### Entregáveis

- backend publicado;
- frontend publicado;
- banco configurado;
- HTTPS;
- documentação;
- procedimento de rollback;
- checklist de produção.

---

## 30. Fase 21 — Escalabilidade e load balancer

### Objetivo do projeto

Entender como o sistema atende mais usuários e continua disponível.

### Conteúdos

- gargalo;
- latência;
- throughput;
- disponibilidade;
- escalabilidade vertical;
- escalabilidade horizontal;
- balanceador de carga;
- round robin;
- health check;
- aplicação stateless;
- sessão;
- afinidade;
- cache;
- pool de conexão;
- filas;
- replicação;
- particionamento;
- limites;
- backpressure;
- rate limiting;
- timeout;
- retry;
- circuit breaker;
- bulkhead;
- degradação graciosa;
- tolerância a falhas.

### Arquitetura exemplo

```text
                    ┌── Backend 1
Cliente → Nginx ────┼── Backend 2
                    └── Backend 3
                           ↓
                       PostgreSQL
```

### Entregáveis

- duas ou mais instâncias do backend;
- load balancer;
- health checks;
- teste de distribuição;
- simulação de falha;
- documentação de gargalos.

### Critérios para concluir

O estudante deverá conseguir:

- explicar load balancer;
- diferenciar escalabilidade vertical e horizontal;
- explicar stateless;
- identificar gargalo;
- propor uma estratégia simples de escala.

---

## 31. Fase 22 — Observabilidade

### Conteúdos

- logs;
- métricas;
- traces;
- correlação;
- níveis de log;
- logs estruturados;
- indicadores;
- dashboards;
- alertas;
- saúde;
- disponibilidade;
- latência;
- erros;
- throughput;
- Prometheus;
- Grafana;
- OpenTelemetry em nível introdutório;
- auditoria;
- monitoramento da IA.

### Entregáveis

- logs estruturados;
- métricas;
- dashboard;
- alertas básicos;
- rastreamento de requisição;
- painel de processamento.

---

## 32. Fase 23 — Arquitetura de software

### Conteúdos

- arquitetura em camadas;
- modularização;
- monólito;
- monólito modular;
- microsserviços;
- arquitetura hexagonal;
- clean architecture;
- event-driven architecture;
- integração;
- contratos;
- acoplamento;
- coesão;
- limites de contexto;
- trade-offs;
- ADR;
- dívida técnica;
- evolução arquitetural.

### Estratégia do projeto

O sistema começará como um monólito organizado.

Depois poderá evoluir para um monólito modular.

Serviços separados só serão criados quando houver uma justificativa clara.

### Critérios para separar um serviço

- responsabilidade isolada;
- necessidade de escala independente;
- tecnologia diferente;
- ciclo de deploy diferente;
- falhas precisam ser isoladas;
- equipe ou domínio independente;
- custo da separação justificável.

### Entregáveis

- diagrama atual;
- decisões arquiteturais;
- ADRs;
- comparação entre alternativas;
- separação de pelo menos um serviço quando justificada.

---

# PARTE VII — CONHECIMENTOS TRANSVERSAIS

## 33. Algoritmos e estruturas de dados

Estes conteúdos serão estudados ao longo do projeto e também com exercícios específicos para concurso.

### Conteúdos

- análise de problemas;
- pseudocódigo;
- fluxograma;
- complexidade;
- Big O;
- busca linear;
- busca binária;
- ordenação;
- recursão;
- pilha;
- fila;
- lista;
- conjunto;
- mapa;
- árvore;
- grafo em nível progressivo;
- hash;
- algoritmos de percurso;
- comparação de soluções.

### Aplicação

- ordenar prioridades;
- buscar coleta;
- agrupar destinos;
- organizar fila de processamento;
- calcular rotas simplificadas;
- detectar dependências.

---

## 34. Engenharia de software

### Conteúdos

- requisitos funcionais;
- requisitos não funcionais;
- regra de negócio;
- caso de uso;
- história de usuário;
- critérios de aceitação;
- modelagem;
- UML em nível útil;
- diagrama de classes;
- diagrama de sequência;
- documentação;
- manutenção;
- qualidade;
- dívida técnica;
- revisão;
- refatoração;
- estimativas;
- riscos;
- decisões.

---

## 35. Metodologias de trabalho

### GitHub Flow

Será o fluxo principal de código.

### Kanban

Poderá ser usado no GitHub Projects com colunas simples:

```text
Backlog
Pronto
Em andamento
Em revisão
Concluído
```

### Scrum

Será estudado conceitualmente:

- papéis;
- eventos;
- artefatos;
- sprint;
- backlog;
- retrospectiva;
- review;
- planning.

Não será necessário simular uma equipe inteira artificialmente.

### Prática individual

Para o projeto individual, serão usados:

- tarefas pequenas;
- objetivo claro;
- critérios de aceitação;
- revisão;
- retrospectiva curta;
- registro de aprendizado.

---

## 36. Comunicação técnica

O projeto também deverá desenvolver a capacidade de:

- explicar código;
- escrever README;
- escrever descrição de PR;
- registrar bug;
- escrever issue;
- documentar API;
- apresentar arquitetura;
- justificar decisão;
- comunicar limitação;
- pedir ajuda com contexto;
- escrever mensagem técnica clara;
- realizar code review.

---

## 37. Conteúdos relacionados a concursos

Os tópicos do projeto deverão ser relacionados, quando aplicável, a questões de concurso.

### Áreas

- lógica de programação;
- Java;
- orientação a objetos;
- estruturas de dados;
- algoritmos;
- banco de dados;
- SQL;
- sistemas operacionais;
- redes;
- HTTP;
- segurança;
- engenharia de software;
- testes;
- arquitetura;
- padrões de projeto;
- metodologias ágeis;
- concorrência;
- sistemas distribuídos;
- computação em nuvem;
- DevOps;
- inteligência artificial.

### Método de revisão para concurso

Ao final de cada módulo:

- resumo teórico;
- perguntas conceituais;
- exercícios;
- questões de provas;
- identificação de pegadinhas;
- revisão espaçada;
- registro de erros.

---

# PARTE VIII — CONTROLE DO APRENDIZADO

## 38. Critérios gerais para avançar

Uma etapa não será concluída apenas porque o código funcionou.

O estudante deverá demonstrar:

### Compreensão

- explicar os conceitos;
- explicar o código;
- identificar entradas e saídas;
- explicar o fluxo;
- explicar decisões.

### Aplicação

- alterar o código;
- criar exemplo parecido;
- corrigir erro;
- resolver exercício.

### Registro

- atualizar `PROGRESSO.md`;
- registrar dúvidas;
- registrar decisões;
- registrar próximos passos.

### Versionamento

- branch adequada;
- commits claros;
- Pull Request;
- revisão;
- merge.

---

## 39. Níveis de domínio

Cada tópico poderá ser marcado como:

```text
0 — Não estudado
1 — Reconheço o conceito
2 — Entendo com ajuda
3 — Consigo aplicar com consulta
4 — Consigo aplicar sozinho
5 — Consigo explicar e adaptar
```

O objetivo não será atingir nível 5 em tudo imediatamente.

---

## 40. Formato sugerido de uma aula

```markdown
# Aula

## Objetivo

## Problema que será resolvido

## Conceitos novos

## Explicação

## Exemplo mínimo

## Aplicação no projeto

## Código digitado

## Como executar

## Resultado esperado

## Alterações para experimentar

## Erros comuns

## Exercício guiado

## Exercício independente

## Perguntas de compreensão

## Atualização do PROGRESSO.md

## Branch

## Commits

## Critério para Pull Request
```

---

## 41. Formato sugerido para o PROGRESSO.md

O arquivo `docs/PROGRESSO.md` deverá começar com:

```markdown
# PROGRESSO

## Estado atual

- Fase:
- Módulo:
- Aula:
- Branch atual:
- Último commit:
- Último Pull Request:
- Status do projeto:
- Bloqueios:
- Próximo passo:

## Conhecimentos consolidados

## Conhecimentos em desenvolvimento

## Dúvidas abertas

## Decisões tomadas

## Histórico de etapas
```

Para cada etapa:

```markdown
## Etapa — Nome

- Data:
- Branch:
- Pull Request:
- Commits:
- Status:

### O que foi implementado

### O que aprendi

### Explicação com minhas palavras

### Erros encontrados

### Como resolvi

### Dúvidas restantes

### Perguntas de revisão

### Minhas respostas

### Próximo passo
```

---

## 42. Continuidade entre chats

Ao iniciar uma nova conversa, o contexto mínimo deverá incluir:

```text
Leia o ROADMAP.md e o PROGRESSO.md do repositório.
Considere esses arquivos como a fonte oficial do projeto.
Continue exatamente da etapa registrada em "Estado atual".
Não pule conteúdos e não repita etapas já concluídas, salvo quando uma revisão for necessária.
```

Se houver divergência entre a conversa e os arquivos:

1. verificar o commit mais recente;
2. verificar o `PROGRESSO.md`;
3. confirmar o estado real do código;
4. corrigir a documentação;
5. continuar.

---

## 43. Política de atualização da documentação

O `ROADMAP.md` será alterado quando:

- o escopo mudar;
- uma tecnologia for substituída;
- uma fase for reorganizada;
- surgir uma decisão estrutural;
- um novo objetivo importante for adicionado.

O `PROGRESSO.md` será alterado:

- ao final de cada aula;
- ao concluir uma funcionalidade;
- ao realizar um Pull Request;
- ao encontrar um bloqueio;
- ao tomar uma decisão;
- antes de mudar de chat;
- antes de uma pausa longa.

---

## 44. Definição de pronto de uma tarefa

Uma tarefa será considerada pronta quando:

- o objetivo estiver atendido;
- o código compilar;
- o comportamento tiver sido testado;
- erros conhecidos estiverem registrados;
- os testes automatizados passarem, quando existirem;
- a documentação estiver atualizada;
- o diff tiver sido revisado;
- o Pull Request estiver claro;
- o merge tiver sido concluído;
- a `main` estiver funcional.

---

## 45. Definição de pronto do projeto educacional

O projeto educacional será considerado concluído quando o estudante conseguir:

- compreender e escrever Java;
- usar orientação a objetos;
- criar testes;
- modelar banco relacional;
- escrever SQL;
- criar API REST;
- desenvolver com Spring Boot;
- proteger uma aplicação;
- criar frontend em JavaScript;
- integrar Java e Python;
- aplicar IA de forma avaliada;
- usar mensageria;
- compreender concorrência;
- utilizar cache;
- trabalhar com Docker;
- criar pipeline de CI/CD;
- realizar deploy;
- compreender load balancer;
- explicar escalabilidade;
- monitorar uma aplicação;
- justificar decisões arquiteturais;
- usar Git e GitHub com segurança;
- documentar o trabalho;
- continuar evoluindo o sistema de forma independente.

Isso não significa dominar profundamente todas as áreas.

Significa possuir uma base integrada, prática e consciente.

---

# PARTE IX — ORDEM INICIAL DE EXECUÇÃO

## 46. Primeiras entregas

### Entrega 1 — Estrutura documental

Branch:

```text
docs/estrutura-inicial
```

Arquivos:

```text
README.md
docs/ROADMAP.md
docs/PROGRESSO.md
.gitignore
```

### Entrega 2 — Primeiro programa Java

Branch:

```text
feat/primeiro-programa-java
```

Objetivo:

- criar `Main.java`;
- imprimir uma mensagem;
- compilar;
- executar;
- entender `.java` e `.class`.

### Entrega 3 — Entrada de dados

Branch:

```text
feat/entrada-dados-coleta
```

Objetivo:

- usar `Scanner`;
- receber número da coleta;
- receber cliente;
- receber destino;
- receber prioridade;
- exibir resumo.

### Entrega 4 — Condições

Branch:

```text
feat/classificacao-prioridade
```

Objetivo:

- aplicar `if`;
- classificar prioridade;
- explicar operadores lógicos.

### Entrega 5 — Menu e repetição

Branch:

```text
feat/menu-terminal
```

Objetivo:

- criar menu;
- usar repetição;
- cadastrar várias coletas;
- encerrar o programa.

### Entrega 6 — Métodos

Branch:

```text
refactor/separar-operacoes-menu
```

Objetivo:

- dividir responsabilidades;
- criar métodos;
- reduzir código dentro do `main`.

### Entrega 7 — Objetos

Branch:

```text
refactor/modelar-coleta
```

Objetivo:

- criar classe `Coleta`;
- criar objetos;
- usar construtor;
- encapsular dados.

---

## 47. Tecnologias previstas

### Linguagens

- Java;
- SQL;
- JavaScript;
- Python;
- Bash em nível básico;
- YAML para configurações.

### Backend

- Java;
- Spring Boot;
- Maven;
- Spring Web;
- Spring Data JPA;
- Spring Security.

### Banco de dados

- PostgreSQL;
- Redis;
- MongoDB apenas se houver caso de uso.

### Frontend

- HTML;
- CSS;
- JavaScript;
- React em fase posterior.

### IA

- Python;
- FastAPI;
- bibliotecas adequadas ao problema;
- modelos clássicos;
- OCR;
- LLM quando houver justificativa.

### Mensageria

- RabbitMQ;
- Kafka em estudo posterior.

### Infraestrutura

- Git;
- GitHub;
- GitHub Actions;
- Docker;
- Docker Compose;
- Linux;
- Nginx;
- plataforma de deploy a definir.

### Observabilidade

- logs estruturados;
- métricas;
- Prometheus;
- Grafana;
- OpenTelemetry em nível introdutório.

---

## 48. Tecnologias que não serão antecipadas

Não começaremos com:

- Kubernetes;
- microsserviços completos;
- Kafka sem compreender filas;
- React sem JavaScript;
- Spring Boot sem orientação a objetos;
- JPA sem SQL;
- arquitetura excessivamente abstrata;
- múltiplos bancos sem necessidade;
- automação que esconda o aprendizado;
- ferramentas corporativas sem utilidade para a etapa.

Esses assuntos poderão ser estudados quando a base estiver preparada.

---

## 49. Riscos do projeto

### Risco: tentar aprender tudo ao mesmo tempo

Mitigação:

- seguir a ordem;
- limitar a tarefa atual;
- registrar próximos assuntos sem antecipá-los.

### Risco: copiar sem compreender

Mitigação:

- digitar;
- explicar;
- alterar;
- responder perguntas;
- fazer exercício independente.

### Risco: projeto crescer demais

Mitigação:

- entregas pequenas;
- escopo por fase;
- backlog separado;
- evitar funcionalidades fora do objetivo educacional.

### Risco: perder contexto

Mitigação:

- atualizar `PROGRESSO.md`;
- commits frequentes e coerentes;
- Pull Requests;
- documentação;
- estado atual no topo do arquivo.

### Risco: burocracia

Mitigação:

- fluxo GitHub simples;
- issues apenas quando úteis;
- documentação objetiva;
- ferramentas introduzidas conforme necessidade.

### Risco: estudar apenas para o projeto e esquecer a prova

Mitigação:

- relacionar cada fase ao conteúdo do concurso;
- resolver questões;
- revisar teoria;
- manter trilha de erros.

---

## 50. Regra principal

> O projeto deve crescer na mesma velocidade em que a compreensão cresce.

Uma funcionalidade pequena, completamente compreendida, vale mais do que uma arquitetura grande copiada sem entendimento.

---

## 51. Próxima etapa oficial

Após adicionar este arquivo ao repositório:

1. criar `docs/PROGRESSO.md`;
2. criar ou revisar `README.md`;
3. criar `.gitignore`;
4. revisar o diff;
5. fazer os commits;
6. abrir o primeiro Pull Request;
7. fazer o merge;
8. atualizar a `main`;
9. iniciar o primeiro programa Java.

---

## 52. Estado deste documento

- Tipo: roadmap mestre;
- Status: versão inicial;
- Projeto: Central Inteligente de Operações Logísticas;
- Metodologia: aprendizado progressivo baseado em projeto;
- Fluxo: GitHub Flow simplificado;
- Fonte de progresso: `docs/PROGRESSO.md`;
- Revisão: sempre que o escopo ou a estratégia mudar.
