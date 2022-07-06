# IFace
## Projeto de Rede de Relacionamentos para a disciplina de Projeto de Software
------------------------------------------------------------------------------
#### Aplicação feita totalmente em Java

## Design Patterns
- Command: Menu de funções retirado do arquivo Main e realocado para os arquivos Command, utilizando a classe abstrata CommandMenuParent
- Generative Speculation: Retirada de trechos de código desnecessários
  - AccountManager: linhas 5 e 6, retirada de imports sem uso.
  - AccountManager: linhas 212, retirada variável sem uso.
  - Comunity: linha 3, retirada de import sem uso.
  - Message: linha linha 1, retirada de import sem uso.
  - Main: linhas 5 e 6, retirada de imports sem uso.
  - Message: linha 7, Constructor sem uso.


### Branch Main possui o código refatorado

### Branch v1.0 possui o código incial, antes de refatorar
### Branch v1.1 possui o código refatorado
- Herança, Classe Abstrata, Polimorfismo e Encapsulamento implementados :white_check_mark:



### Como Rodar:
1. javac Main.java
2. java Main
## Funções:

### Criação de Conta :white_check_mark:
- O usuário pode se cadastrar no IFace digitando seu login, sua senha e seu username.
<br/>

### Edição de Conta :white_check_mark:
- O usuário pode criar novos dados para sua conta(ex. idade) e também modificar qualquer um de seus dados.
<br/>

### Adição de Amigos :white_check_mark:
- O usuário pode solicitar a um outro usuário a sua adição na lista de amigos, o destinatário pode aceitar ou recusar.
<br/>

### Mensagens Diretas :white_check_mark:
- O usuário pode enviar mensagens diretamente para um outro usuário do IFace.
<br/>

### Criação de Comunidade :white_check_mark:
- O usuário pode criar uma comunidade, adiconando um nome e uma descrição a ela.
<br/>

### Entrar em uma comunidade :white_check_mark:
- O usuário pode entrar em uma comunidade já criada por outro usuário.
<br/>

### Remoção de Conta :white_check_mark:
- O usuário pode, a qualquer momento, encerrar sua conta no IFace.
<br/>

### Recuperação de Conta :white_check_mark:
- Uma vez com a conta encerrada, o usuário pode recuperá-la com seu login e senha.
<br/>

### Envio de Mensagens no Feed :white_check_mark:
- O usuário pode mandar mensagens para o feed do IFace, ele também pode escolher se a mensagens irá para o feed geral, ou se será restrita aos seus amigos.
<br/>

### Listagem de Atributos do Perfil :white_check_mark:
- O usuário pode solicitar que o aplicativo liste todas as suas informações, desde os atributos, até suas mensagens.
<br/>
