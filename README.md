# Gerenciador de Tarefas

Boas-vindas ao repositório do exercício Gerenciador de Tarefas

Para realizar o exercício, atente-se a cada passo descrito a seguir e se tiver **qualquer dúvida**, nos envie no _Slack_ da turma! #vqv 🚀

Aqui, você vai encontrar os detalhes de como estruturar o desenvolvimento do seu exercício a partir desse repositório, utilizando uma branch específica e um _Pull Request_ para colocar seus códigos.

## Termos e acordos
Ao iniciar este exercício, você concorda com as diretrizes do [Código de Conduta e do Manual da Pessoa Estudante da Trybe](https://app.betrybe.com/learn/student-manual/codigo-de-conduta-da-pessoa-estudante).

## Entregáveis

<details>
  <summary>🤷🏽‍♀️ Como entregar</summary><br />

Para entregar o seu exercício, você deverá criar um _Pull Request_ neste repositório.

Lembre-se que você pode consultar nosso conteúdo sobre [Git & GitHub](https://app.betrybe.com/learn/course/5e938f69-6e32-43b3-9685-c936530fd326/module/fc998c60-386e-46bc-83ca-4269beb17e17/section/fe827a71-3222-4b4d-a66f-ed98e09961af/day/1a530297-e176-4c79-8ed9-291ae2950540/lesson/2b2edce7-9c49-4907-92a2-aa571f823b79) e nosso [Blog - Git & GitHub](https://blog.betrybe.com/tecnologia/git-e-github/) sempre que precisar!
</details>

<details>
  <summary>👨‍💻 O que deverá ser desenvolvido</summary><br />

Você irá desenvolver uma aplicação que gerencia tarefas, um ToDo List. Nessa aplicação será possível adicionar e remover uma tarefa nova, marcar uma tarefa como concluída além de listar uma única tarefa ou todas as tarefas. Parece fácil né? E realmente é!

Esse exercício vai deixar nítido como uma API REST em Java funciona, como criar os endpoints de diferentes verbos HTTP. Será essencial para fixar seu aprendizado.

</details>

<details>
  <summary><strong>📝 Habilidades a serem trabalhadas</strong></summary>

Neste exercício, verificamos se você é capaz de:

- Utilizar anotações do Spring para mapear rotas e métodos HTTP aos controladores 
- Configurar e manipular os parâmetros de rotas e requisições HTTP nos endpoints
- Integrar os endpoints com outras camadas do sistema, como a camada de serviço e a camada de persistência


</details>

## Orientações

<details>

   <summary><strong>‼ Antes de começar a desenvolver </strong></summary>

1. Clone o repositório

- Use o comando: `git clone <url do repositório>`
- Entre na pasta do repositório que você acabou de clonar:
    - `cd <nome do repositório>`

2. Instale as dependências

    - `mvn install`  

3. Crie uma branch a partir da branch `main`

- Verifique que você está na branch `main`
    - Exemplo: `git branch`
- Se você não estiver, mude para a branch `main`
    - Exemplo: `git checkout main`
- Agora, crie uma branch à qual você vai submeter os `commits` do seu exercício:
    - Você deve criar uma branch no seguinte formato: `nome-sobrenome-nome-do-exercício`;
    - Exemplo: `git checkout -b maria-soares-lessons-learned`

4. Crie na raiz do exercício os arquivos que você precisará desenvolver:

- Verifique que você está na raiz do exercício:
    - Exemplo: `pwd` -> o retorno vai ser algo tipo _/Users/maria/code/**sd-0x-project-lessons-learned**_
- Crie os arquivos index.html e style.css:
    - Exemplo: `touch index.html style.css`

5. Adicione as mudanças ao _stage_ do Git e faça um `commit`

- Verifique que as mudanças ainda não estão no _stage_:
    - Exemplo: `git status` (devem aparecer listados os novos arquivos em vermelho)
- Adicione o novo arquivo ao _stage_ do Git:
    - Exemplo:
        - `git add .` (adicionando todas as mudanças - _que estavam em vermelho_ - ao stage do Git)
        - `git status` (devem aparecer listados os arquivos em verde)
- Faça o `commit` inicial:
    - Exemplo:
        - `git commit -m 'iniciando o exercício. VAMOS COM TUDO :rocket:'` (fazendo o primeiro commit)
        - `git status` (deve aparecer uma mensagem tipo _nothing to commit_ )

6. Adicione a sua branch com o novo `commit` ao repositório remoto

- Usando o exemplo anterior: `git push -u origin maria-soares-lessons-learned`

7. Crie um novo `Pull Request` _(PR)_

- Vá até a página de _Pull Requests_ do [repositório no GitHub](https://github.com/tryber/sd-0x-project-lessons-learned/pulls)
    - Clique no botão verde _"New pull request"_
    - Clique na caixa de seleção _"Compare"_ e escolha a sua branch **com atenção**
- Coloque um título para o seu _Pull Request_
    - Exemplo: _"Cria tela de busca"_
- Clique no botão verde _"Create pull request"_

- Adicione uma descrição para o _Pull Request_, um título nítido que o identifique, e clique no botão verde _"Create pull request"_

 <img width="1335" alt="Exemplo de pull request" src="https://user-images.githubusercontent.com/42356399/166255109-b95e6eb4-2503-45e5-8fb3-cf7caa0436e5.png">

- Volte até a [página de _Pull Requests_ do repositório](https://github.com/tryber/sd-0x-project-lessons-learned/pulls) e confira que o seu _Pull Request_ está criado

</details>

<details>

<summary><strong>⌨️ Durante o desenvolvimento</strong></summary>

Faça `commits` das alterações que você fizer no código regularmente, pois assim você garante visibilidade para o time da Trybe e treina essa prática para o mercado de trabalho :) ;

- Lembre-se de sempre após um (ou alguns) `commits` atualizar o repositório remoto;
- Os comandos que você utilizará com mais frequência são:
    - `git status` _(para verificar o que está em vermelho - fora do stage - e o que está em verde - no stage)_;
    - `git add` _(para adicionar arquivos ao stage do Git)_;
    - `git commit` _(para criar um commit com os arquivos que estão no stage do Git)_;
    - `git push -u origin nome-da-branch` _(para enviar o commit para o repositório remoto na primeira vez que fizer o `push` de uma nova branch)_;
    - `git push` _(para enviar o commit para o repositório remoto após o passo anterior)_.

</details>

<details>
<summary><strong>🎛 Checkstyle</strong></summary>

Para garantir a qualidade do código, vamos utilizar neste exercício o `Checkstyle`. Assim o código estará alinhado com as boas práticas de desenvolvimento, sendo mais legível e de fácil manutenção! Para poder rodar o `Checkstyle` certifique-se de ter executado o comando `mvn install` dentro do repositório.

Para rodá-los localmente no repositório, execute os comandos abaixo:

```bash
mvn checkstyle:check
```

Se a análise do `Checkstyle` encontrar problemas no seu código, tais problemas serão mostrados no seu terminal. Se não houver problema no seu código, nada será impresso no seu terminal.

Você pode também instalar o plugin do `Checkstyle` na sua `IDE`. Para isso, volte na primeira seção do conteúdo.

⚠️ **PULL REQUESTS COM ISSUES NO `Checkstyle` NÃO SERÃO AVALIADAS. ATENTE-SE PARA RESOLVÊ-LAS ANTES DE FINALIZAR O DESENVOLVIMENTO!** ⚠️

</details>

<details>
<summary><strong>🛠 Testes</strong></summary>

Para executar todos os testes basta rodar o comando:
```bash
mvn test
```

Para executar apenas uma classe de testes:
```bash
mvn test -Dtest="TestClassName"
```

</details>

## Requisitos

### 1 - Crie o DTO (Data Transfer Objects) de resposta para tarefas

<details>
  <summary>Implemente o DTO que será usado nas respostas da sua aplicação</summary><br />

O DTO deve seguir os seguinte critérios:

- Ser nomeado `TaskDto`.
- Deve ser implementado usando `record`.
- Ser localizado no package `com.betrybe.taskmanager.dto`.
- Possuir os seguintes campos:
  - `id` do tipo `String`
  - `title` do tipo `String`
  - `description` do tipo `String`
  - `ownerName` do tipo `String`
  - `isComplete` do tipo `Boolean`

  _Dica: Utilize `record` para implementar seu DTO_

</details>

### 2 - Crie o endpoint GET /tasks para retornar todos as tarefas

<details>
  <summary>Implemente o endpoint responsável por retornar a lista de tarefas</summary><br />

O endpoint deve seguir os seguintes critérios:

- A aplicação possui a componente Spring `FakeTaskDatabase` que implementa a interface `TaskDatabaseInterface` e deve ser utilizada para a camada de acesso ao banco de dados.
- Ao receber uma requisição no endpoint `GET /tasks` deve retornar a lista de tarefas retornadas pela `FakeTaskDatabase` devidamente serializadas para o `TaskDto` criado no requisito anterior.
- Utilize a arquitetura em camadas.

</details>

### 3 - Crie o endpoint GET /tasks/{id} para retornar a tarefa com determinado id

<details>
  <summary>Implemente o endpoint responsável por retornar uma única tarefa</summary><br />

O endpoint deve seguir os seguintes critérios:

- Assim como no requisito anterior, a componente Spring `FakeTaskDatabase` deve ser utilizada.
- Ao receber uma requisição no endpoint `GET /tasks/{id}` com id existente na `FakeTaskDatabase`, deve retornar a tarefa com aquele id devidamente serializada para o `TaskDto` criado no requisito 1.
- Ao receber uma requisição para um id inexistente na `FakeTaskDatabase`, deve retornar status `404`.

</details>

### 4 - Crie o DTO (Data Transfer Objects) de requisição para tarefas

<details>
  <summary>Implemente o DTO que será usado nas requisições à sua aplicação</summary><br />

Esse DTO será utilizado por requisições do verbo `POST` para a criação de novas tarefas, ele deve seguir os seguinte critérios:

- Ser nomeado `TaskCreationDto`.
- Deve ser implementado usando `record`.
- Ser localizado no package `com.betrybe.taskmanager.dto`.
- Possuir os seguintes campos:
  - `title` do tipo `String`
  - `description` do tipo `String`
  - `ownerName` do tipo `String`

_Dica: Utilize `record` para implementar seu DTO_
</details>

### 5 - Crie o endpoint POST /tasks para criar novas tarefas

<details>
  <summary>Implemente o endpoint responsável por criar uma nova tarefa</summary><br />

O endpoint deve seguir os seguintes critérios:

- Assim como nos requisitos anteriores, a componente Spring `FakeTaskDatabase` deve ser utilizada.
- Ao receber uma requisição no endpoint `POST /tasks` com o `TaskCreationDto` do requisito anterior, deve retornar:
  - status `201`.
  - o `id` da nova tarefa como `body` da resposta.

</details>

### 6 - Crie o endpoint PUT /tasks/{id} para alterar o status da tarefa para 'Concluída'

<details>
  <summary>Implemente o endpoint responsável por alterar o estado de uma tarefa</summary><br />

O campo `isComplete` da `TaskModel` é um `Boolean` que representa se a tarefa está em 'Andamento' ou se foi 'Concluída', utilize dessa informação para completar esse requisito.

O endpoint deve seguir os seguinte critérios:

- Assim como nos requisitos anteriores, a componente Spring `FakeTaskDatabase` deve ser utilizada.
- Ao receber uma requisição no endpoint `PUT /tasks/{id}`, deve:
  - retornar status `204`.
  - Deve alterar no banco de dados o status da tarefa para 'Concluída', de modo que uma subsequente requisição `GET /tasks/{id}` retorne os dados da tarefa como concluída.

</details>

### 7 - Crie o endpoint DELETE /tasks/{id} para a remoção de tarefas

<details>
  <summary>Implemente o endpoint responsável por remover uma tarefa</summary><br />

O endpoint deve seguir os seguintes critérios:

- Assim como nos requisitos anteriores, a componente Spring `FakeTaskDatabase` deve ser utilizada.
- Ao receber uma requisição no endpoint `REMOVE /tasks/{id}` deve retornar status `204`.
- Deve remover a tarefa do banco de dados, de modo que uma subsequente requisição `GET /tasks/{id}` retorne status `404`.

</details>

<details>
<summary><strong> 🗣 Nos dê feedbacks sobre o exercício!</strong></summary>

Ao finalizar e submeter o exercício, não se esqueça de avaliar sua experiência preenchendo o [formulário](https://be-trybe.typeform.com/to/ZTeR4IbH#cohort_hidden=CH1&template=betrybe/java-0x-exercicio-gerenciador-de-tarefas).
**Leva menos de 3 minutos!**

</details>

---

<!-- mdi versão 1.0 exercício como projeto ⚠️ não exclua esse comentário -->
