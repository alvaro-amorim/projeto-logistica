# PROGRESSO — Central Inteligente de Operações Logísticas

> Registro compacto do estado atual do projeto.
>
> O escopo completo e a ordem dos estudos estão em `docs/ROADMAP.md`.
>
> Este arquivo deve responder rapidamente:
>
> - Onde paramos?
> - O que já foi aprendido?
> - O que ainda está pendente?
> - Qual é o próximo passo?

---

## Estado atual

- **Fase:** 1 — Fundamentos de programação com Java
- **Etapa:** Entrada numérica e tratamento de exceções
- **Status:** Em revisão
- **Branch atual:** `feat/entrada-numerica-excecoes`
- **Último commit de código:** `<7fd8814>` — `feat: adiciona entrada numérica e tratamento de exceções`
- **Último Pull Request concluído:** `#3`
- **Último merge:** `5e746fd`
- **Branch principal:** `main`
- **Repositório remoto:** `origin`
- **Bloqueios:** Nenhum

### Próximo passo

1. Registrar esta rodada no `PROGRESSO.md`.
2. Criar o commit da documentação.
3. Enviar a branch ao GitHub.
4. Abrir e revisar o Pull Request.
5. Fazer o merge e sincronizar a `main`.
6. Organizar o programa em métodos.

---

## Conhecimentos confirmados

### Git e GitHub

- Git e GitHub são ferramentas diferentes.
- O Git funciona localmente sem depender do GitHub.
- `git init` transforma uma pasta em um repositório Git.
- `git init -b main` inicializa o repositório definindo `main` como branch inicial.
- `git status` mostra o estado atual do repositório.
- Um arquivo pode estar não rastreado, preparado ou registrado.
- `git add` prepara a versão atual de uma alteração para o próximo commit.
- `git commit` registra as alterações preparadas no histórico local.
- `git push` envia commits locais ao repositório remoto.
- `git diff --cached` mostra o que está preparado para o próximo commit.
- `git diff --cached --stat` mostra um resumo das alterações preparadas.
- `origin` é o nome convencional do repositório remoto principal.
- Um repositório pode possuir mais de um remoto.
- `fetch` representa a busca de informações do repositório remoto.
- `push` representa o envio de commits ao repositório remoto.
- `git remote -v` mostra os remotos e seus endereços de fetch e push.
- A opção `-u` cria uma associação entre uma branch local e uma branch remota.
- Depois que o upstream é configurado, normalmente basta usar `git push` e `git pull`.
- Cada branch pode possuir seu próprio upstream.
- `git switch -c` cria uma branch e muda imediatamente para ela.
- Uma branch permite desenvolver uma entrega sem alterar imediatamente a `main`.

### Arquivos e segurança

- O `.gitignore` informa quais arquivos o Git deve ignorar.
- Arquivos compilados, configurações locais e arquivos `.env` não devem ser versionados.
- O `.gitignore` não remove arquivos que já tenham sido registrados anteriormente.
- Chaves e segredos não devem ser escritos diretamente no código ou enviados ao GitHub.
- Um segredo exposto deve ser revogado e substituído.

### Java — entrada e validação

- `Scanner` permite receber dados pela entrada padrão `System.in`.
- `nextLine()` lê toda a linha digitada pelo usuário.
- `trim()` remove espaços no início e no final do texto.
- `String` armazena valores textuais.
- `boolean` armazena apenas `true` ou `false`.
- `if`, `else if` e `else` controlam decisões em sequência.
- O primeiro bloco cuja condição for verdadeira é executado.
- `do-while` executa o bloco pelo menos uma vez e depois verifica se deve repeti-lo.
- O operador `!` nega um valor booleano.
- `isBlank()` verifica se um texto está vazio ou contém apenas espaços.
- `length()` informa a quantidade de caracteres.
- `matches()` verifica se o texto corresponde a uma expressão regular.
- A expressão `[\\p{L}\\p{M} ]+` aceita letras Unicode, marcas de acentuação e espaços.
- Validação de entrada impede valores que não seguem as regras do sistema.
- Validação de entrada é diferente de tratamento de exceções.
- `StandardCharsets.UTF_8` define explicitamente a codificação usada pelo `Scanner`.
- A entrada e a saída do terminal também precisam estar configuradas de forma compatível com UTF-8.

### Java — números e exceções

- `Integer.parseInt()` converte uma `String` para um valor `int`.
- O valor retornado pela conversão precisa ser armazenado em uma variável.
- Uma conversão numérica inválida pode gerar `NumberFormatException`.
- O bloco `try` contém uma operação que pode lançar uma exceção.
- O bloco `catch` captura uma exceção compatível e define como o programa deve reagir.
- Quando uma exceção acontece dentro do `try`, as instruções restantes desse bloco são ignoradas.
- Depois do `catch`, o programa continua na próxima instrução após o `try-catch`.
- O `try-catch` não repete uma operação automaticamente.
- O `do-while` controla a repetição das tentativas.
- Uma variável `boolean` pode registrar se a última tentativa foi válida.
- `try-catch`, `do-while` e `if-else` possuem responsabilidades diferentes.
- O `try-catch` verifica se a conversão pode ser realizada.
- O `if-else` aplica regras de negócio depois da conversão.
- Números negativos podem ser inteiros válidos para o Java e inválidos para o sistema.
- Um valor decimal não pode ser convertido com `Integer.parseInt()`.
- Um número grande demais para o tipo `int` também gera `NumberFormatException`.

---

## Conhecimentos em desenvolvimento

- Criação e utilização de métodos.
- Parâmetros e argumentos.
- Valores de retorno.
- Escopo de variáveis.
- Separação de responsabilidades.
- Outros tipos numéricos, como `double`.
- Expressões regulares mais avançadas.
- Configuração permanente do terminal em UTF-8.
- Variáveis de ambiente em produção.
- Diferença entre configurações públicas e segredos no frontend.
- Uso seguro de segredos no backend.

---

## Dúvidas pendentes

### Segurança de variáveis no frontend

Estudar futuramente:

- por que valores usados pelo frontend podem ficar acessíveis no navegador;
- quais variáveis podem ser públicas;
- quais valores devem existir somente no backend;
- como armazenar secrets no ambiente de produção;
- como o frontend deve chamar serviços externos por meio do backend.

Essa dúvida será aprofundada nas fases de API, segurança e deploy.

---

## Histórico de rodadas

### Rodada 001 — Estrutura inicial e configuração do Git

- **Data:** 04/08/2026
- **Status:** Concluída
- **Branch:** `docs/registrar-fase-zero`
- **Commits:** `e0dedd8` e `cf0315a`
- **Pull Request:** `#1`
- **Merge:** `63e75ff`

#### Implementado

- Criada a pasta local do projeto.
- Criada a pasta `docs`.
- Adicionado o `ROADMAP.md`.
- Adicionado o `PROGRESSO.md`.
- Criado o `README.md`.
- Criado o `.gitignore`.
- Confirmada a instalação do Git.
- Confirmada a instalação do Java 21.
- Confirmada a instalação do compilador `javac`.
- Inicializado o repositório Git com a branch `main`.
- Arquivos adicionados à área de preparação.
- Alterações preparadas revisadas com `git diff`.
- Primeiro commit criado.
- Repositório criado no GitHub.
- Remoto `origin` configurado.
- Branch `main` enviada ao GitHub.
- Upstream entre `main` e `origin/main` configurado.
- Criada a primeira branch de trabalho.

#### Aprendido e confirmado

- Diferença entre Git e GitHub.
- Diferença entre `git add`, `git commit` e `git push`.
- Funcionamento da área de preparação.
- Função do `git status`.
- Leitura básica de um diff.
- Função de `origin`, fetch e push.
- Função da opção `-u`.
- Funcionamento básico de branches.
- Importância de manter a `main` estável.
- Função do `.gitignore`.

#### Avisos encontrados

O Git exibiu um aviso sobre conversão de quebras de linha de `LF` para `CRLF`.

Esse aviso não impediu o funcionamento do Git e está relacionado aos diferentes padrões de quebra de linha utilizados por Linux e Windows.

#### Próximo passo da rodada

- Registrar esta versão simplificada do `PROGRESSO.md`.
- Criar o primeiro Pull Request.
- Fazer o primeiro merge.
- Atualizar a `main`.
- Encerrar a Fase 0.
- Iniciar o primeiro programa Java.

### Rodada 002 — Primeiro programa Java

- **Data:** 04/08/2026
- **Status:** Concluída
- **Branch:** `feat/primeiro-programa-java`
- **Commit de código:** `238bfe4`
- **Commit de documentação:** `8a98f8c`
- **Pull Request:** `#2`
- **Merge:** `51bd3dd`

#### Implementado

- Criado o arquivo `Main.java`.
- Criada a classe pública `Main`.
- Criado o método de entrada `main`.
- Exibido o nome do sistema no terminal.
- Código compilado e executado com sucesso.
- `Main.class` corretamente ignorado pelo Git.

#### Aprendido e confirmado

- `Main.java` contém o código-fonte.
- `javac Main.java` compila o código.
- A compilação gera o arquivo `Main.class`.
- `java Main` executa a classe compilada na JVM.
- `System.out.println` imprime uma mensagem e quebra a linha.
- O nome do arquivo deve corresponder ao nome da classe pública.
- Arquivos `.class` são gerados automaticamente e não devem ser versionados.
- Um arquivo de código deve terminar com uma quebra de linha.

#### Próximo passo

- Abrir e concluir o Pull Request desta entrega.
- Começar a receber dados do usuário com `Scanner`.

### Rodada 003 — Entrada e validação de nome com Scanner

- **Data:** 04/08/2026
- **Status:** Concluída
- **Branch:** `feat/entrada-dados-scanner`
- **Commit de código:** `7765edb`
- **Commit de documentação:** `4c2479e`
- **Pull Request:** `#3`
- **Merge:** `5e746fd`

#### Implementado

- Entrada do nome do usuário pelo terminal.
- Leitura da linha completa com `nextLine()`.
- Remoção de espaços externos com `trim()`.
- Validação de campo vazio.
- Validação de tamanho mínimo de 3 caracteres.
- Validação de tamanho máximo de 50 caracteres.
- Rejeição de números e caracteres especiais.
- Aceitação de nomes compostos e letras acentuadas.
- Repetição da pergunta enquanto o nome for inválido.
- Uso explícito de UTF-8 no `Scanner`.
- Configuração da entrada e da saída do PowerShell para UTF-8.
- Testes manuais com entradas válidas e inválidas.

#### Aprendido e confirmado

- Criação e utilização de um objeto `Scanner`.
- Diferença entre `System.in` e `System.out`.
- Uso de variáveis `String` e `boolean`.
- Funcionamento de `if`, `else if` e `else`.
- Funcionamento do laço `do-while`.
- Uso do operador de negação `!`.
- Uso de `trim()`, `isBlank()`, `length()` e `matches()`.
- Validação com expressão regular.
- Funcionamento básico da codificação UTF-8.
- Diferença entre validação de entrada e tratamento de exceções.

#### Dificuldades encontradas

- Confusão inicial com a sintaxe do `if`, `else if`, `else` e `do-while`.
- Sugestões automáticas do VS Code atrapalhando a digitação.
- Incompatibilidade de codificação entre Java e PowerShell.
- Necessidade de salvar e recompilar o arquivo após cada alteração.

#### Próximo passo

- Concluir o Pull Request desta entrega.
- Aprender entrada de dados numéricos.
- Entender situações que realmente geram exceções em Java.

### Rodada 004 — Entrada numérica e tratamento de exceções

- **Data:** 05/08/2026
- **Status:** Em revisão
- **Branch:** `feat/entrada-numerica-excecoes`
- **Commit de código:** `7fd8814`
- **Pull Request:** Pendente

#### Implementado

- Entrada da quantidade de coletas prioritárias pelo terminal.
- Leitura do valor inicialmente como `String`.
- Conversão do texto para `int` com `Integer.parseInt()`.
- Tratamento de `NumberFormatException`.
- Exibição de mensagem controlada para entradas inválidas.
- Repetição da pergunta enquanto a quantidade for inválida.
- Rejeição de valores decimais.
- Rejeição de textos e valores alfanuméricos.
- Rejeição de números negativos.
- Aceitação do valor zero.
- Aceitação de números inteiros positivos.
- Exibição da quantidade convertida na mensagem final.
- Testes manuais com diferentes entradas.

#### Aprendido e confirmado

- Diferença entre validação e tratamento de exceções.
- Diferença entre `String` e `int`.
- Funcionamento de `Integer.parseInt()`.
- Funcionamento básico de `try` e `catch`.
- Fluxo de execução quando uma exceção acontece.
- Função do `do-while` na repetição das tentativas.
- Função do `boolean` no controle do laço.
- Uso de `if-else` para aplicar regras de negócio.
- Diferença entre um número tecnicamente válido e um valor permitido pelo sistema.
- Combinação de `try-catch`, `if-else` e `do-while`.

#### Dificuldades encontradas

- Entender por que o `catch` não repete a pergunta sozinho.
- Entender por que o programa continuava depois do `catch`.
- Diferenciar uma falha de conversão de uma regra de negócio.
- Perceber que o retorno de `Integer.parseInt()` precisava ser armazenado.
- Compreender a responsabilidade individual de cada estrutura.

#### Próximo passo

- Concluir o Pull Request desta entrega.
- Separar a leitura e a validação do nome em um método.
- Separar a leitura e a validação da quantidade em outro método.
- Estudar parâmetros, retornos e escopo de variáveis.

---

## Regra para atualizar este arquivo

Atualizar o `PROGRESSO.md` somente ao final de uma rodada completa.

Cada nova rodada deve registrar apenas:

- objetivo;
- branch;
- commit;
- Pull Request;
- o que foi implementado;
- o que foi realmente compreendido;
- dúvidas pendentes;
- próximo passo.

Não registrar explicações extensas, todos os comandos executados ou informações que já estejam claramente disponíveis no GitHub.

---

## Retomada em uma nova conversa

Ao continuar este projeto em outro chat:

> Leia o `ROADMAP.md` e o `PROGRESSO.md` do repositório. Considere esses documentos como a fonte oficial do projeto. Verifique o estado atual, a rodada mais recente e o próximo passo registrado antes de continuar.