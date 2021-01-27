# Bootcamp-DevSuperior-Crud Client 

## Trabalho final do capítulo-01

### Enunciado do trabalho

Você deverá entregar um projeto String Boot 2.4.x contendo um CRUD completo de web services REST para acessar um recurso de clientes, contendo as cinco operações báiscas apreendidas no capítulo:

Busca paginada de recursos
Busca de recursos por id
Inserir novo recurso
Atualizar recurso
Deletar recurso

O projeto deverá estar com um ambiente de testes configurado acessando o #banco de dados H2, devera usar o #Maven como gerenciador de dependência, e Java 11 como linguagem.

Um cliente possui nome, CPF, renda, data de nascimento, e quantidade de filhos. A especificação da entidade Client é mostrado a seguir (você deve seguir à risca os nomes da classe e atributos mostrados no diagrama):

<Imagem>
  
  Seu projeto deverá fazer um seed de pelo menos 10 clientes com dados SIGNIFICATIVOS ( não é para usar dados sem significados como "Nome 1", "Nome 2", etc.).
  
## Correção
  
### 1) Importação do projeto

O professor deverá ser capaz de fazer um simples clone do projeto no GitHub, e importar e executar o mesmo no STS sem necessidade de qualquer configuração especial diferente das aulas.

### 2) Testes manuais no Postman

Todas as requisições deverão funcionar perfeitamente.

## Buscar paginada de clientes

#### GET /clients?page=0&linesPerPage=12&direction=ASC&orderBy=name

## Buscar de cliente por id

### GET /clients/1

## Inserção de novo cliente

### POST /clients
#### {
####         "name" : "Maria Madalena Magali",
####         "cpf"  : "13578902468",
####         "income": 9100.87,
####         "birthDate": "1991-08-14T11:30:01Z"
####         "children": 0
#### }

## Atualização de cliente

### PUT /clients/1
#### {
####         "name" : "Maria Magali Madalena",
####         "cpf"  : "13578902468",
####         "income": 10200.99,
####         "birthDate": "1991-08-14T11:30:01Z"
####         "children": 0
#### }

## Deleção de Cliente

### DELETE /clients/1

