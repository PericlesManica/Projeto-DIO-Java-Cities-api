# Projeto consulta Cidades API REST

​	Projeto Bootcamp DIO/Java para criação de um API REST, onde é possível consultar as Cidades e Estados brasileiros, paises do mundo e possui função de medir a distância entre as cidades brasileiras, tanto em milhas como em metros. 

​	O projeto foi construido utilizando o Idea Intellij Community.

## Tecnologias/ferramentas
1. Java
2. Docker
2. Hibernate
3. Heroku
4. GitHub
5. PostgreSQL
6. Spring Boot

## Descrição

​	Inicialmente foi utilizado o Docker para gerar um container com o banco de dados PostgreSQL, desta maneira não havia necessidade de instalar um banco de dados, pois seria utilizado diretamente do Docker, foram inseridas a tabelas com os Paises, Estados e Cidades. Foi acessada a pagina do Spring para criar um projeto base escolhendo a linguagem, banco e interface entre linguagem e banco.  No Idea Intellij, foi construido todo o código em Java da API, após o termino, foi feito um commit e um push para o GitHub, acessado o Heroku inseridas as mesmas tabelas que foram inseridas no Docker e sincronizado o Heroku com o GitHub, tornando a API disponível na Internet.



## Links para teste

​	Os links retornarão as informações em formato JSON.

Paises

https://murmuring-shelf-27123.herokuapp.com/countries



Estados

https://murmuring-shelf-27123.herokuapp.com/staties



Cidades

https://murmuring-shelf-27123.herokuapp.com/cities



Distância em milhas Cascavel-PR x São Paulo-SP

https://murmuring-shelf-27123.herokuapp.com/distances/by-points?from=2853&to=5270



Distância em metros Cascavel-PR x São Paulo-SP

https://murmuring-shelf-27123.herokuapp.com/distances/by-cube?from=2853&to=5270



Obs.: O Heroku deixa o DB em stand by até que aconteça uma consulta, após a primeira consulta leva certa de 2 minutos para que o banco entre em funcionamento.



## Aluno

​	Péricles Manica, Analista de Sistemas, procurando uma colocação no mercado de trabalho.

 [![Gmail Badge](https://img.shields.io/badge/-manicap@gmail.com-c14438?style=flat-square&logo=Gmail&logoColor=white&link=mailto:manicap@gmail.com)](mailto:manicap@gmail.com)

