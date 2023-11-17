# overlay-de-dados
Monitoramento de dados do hardware de um computador
<br>Estado : Finalizado

## sobre
O Overlay faz parte de um projeto que está sendo feito em grupo por alunos da faculdade são paulo tech school, onde consiste no monitoramento de peças de hardware

# Requisitos
- É necessário ter a JVM instalada em sua maquina para rodar o projeto ou um kit de desenvolvimento em java; <br>
- É recomendado ter o mysql um sistema de gerenciamento de banco de dados, para que você possa fazer as inserções no database; <br>
- Para que o projeto funcione corretamente você precisa importar para a library do seu ambiente de desenvolvimento o mysql-connector-j. O mesmo está na baixado nesse projeto, basta adicionar.

# Funções 
- O usuário pode minimizar o overlay, deixando somente o ícone para que o mesmo seja aberto novamente <br>
- futuramente terá um canal de suporte clicando no botão centralizado <br>
- Poderá fechar totalmente o overlay clicando no botão a direita (ou no X) <br>

# Como usar
- Adicione o mysql-connector como dependência do projeto;
- É necessário criar um novo evento no sistema completo.
- após isso basta passar o apelido que foi dado pelo sistema para os computadores. Esse apelido poderá ser encontrado na tela de relatórios. 

# Observação
- O projeto está enviando dados para o banco de dados EC2 do projeto SuperVisiON. Caso você queira trocar o banco de dados, Ir para a classe conexão.
Ao optar pelo uso do MySQL, acesse o pacote "Registros" e proceda descomentando ou apagando as linhas que contenham 'conn = Conexao.createConnectionToMySQL();', ao mesmo tempo em que comenta as linhas relacionadas ao SQL Server

## Tela do projeto
![image](https://github.com/winycios/overlay-de-dados/assets/79330086/5b9a60c5-e059-44a0-b3a3-701688090116)
