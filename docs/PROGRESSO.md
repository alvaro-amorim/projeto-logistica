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
- **Etapa:** Primeiro programa Java
- **Status:** Em revisão
- **Branch atual:** `feat/primeiro-programa-java`
- **Último commit:** `238bfe4` — `feat: adiciona primeiro programa Java`
- **Último Pull Request:** `#1` — concluído
- **Último merge:** `63e75ff`
- **Branch principal:** `main`
- **Repositório remoto:** `origin`
- **Bloqueios:** Nenhum

### Próximo passo

1. Registrar esta rodada no `PROGRESSO.md`.
2. Criar o commit da documentação.
3. Enviar a atualização ao GitHub.
4. Abrir o Pull Request do primeiro programa Java.
5. Revisar e fazer o merge.
6. Iniciar entrada de dados com `Scanner`.

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

---

## Conhecimentos em desenvolvimento

- Pull Requests.
- Revisão de alterações no GitHub.
- Merge.
- Exclusão de branches após o merge.
- Sincronização da `main` local com a remota.
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
- **Status:** Em andamento
- **Branch inicial:** `main`
- **Branch atual:** `docs/registrar-fase-zero`
- **Commit:** `e0dedd8`
- **Pull Request:** Pendente

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
- **Status:** Em revisão
- **Branch:** `feat/primeiro-programa-java`
- **Commit de código:** `238bfe4`
- **Pull Request:** Pendente

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