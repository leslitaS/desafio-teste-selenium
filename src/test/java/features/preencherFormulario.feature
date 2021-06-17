# language: pt
# encoding: utf-8

Funcionalidade: Accesar o site da tricentis e preencheer o formulario da tricentis

  Cenario: Entrar no site da tricentis e preencher o formulario “Enter Vehicle Data”
    Dado que estou no site da tricentis
    E seleciono uma Marca 
    E seleciono um Modelo 
    E digito a capacidade do cilindro
    E digito o Desempenho do motor [kW]
    E insiro a Data de fabricação 
    E seleciono o Numero de assentos
    E escolho novamente o numero de assento
    E escolho o tipo de direção
    E seleciono o Tipo de combustível
    E digito o Preço de tabela [$]
    E digito o Número da matrícula
    E digito  a Milhagem anual [mi]
    Entao clico no botao next para ir ao formulario Enter Insurant Data
  
  Cenario: Estou no site da tricentis e preencho o formulario da aba “Enter insurant Data”
        
    Dado que estou no site da tricentis no Formulario "Enter Insurant Data"
    E que digito o Nome
    E digito o Sobrenome
    E insiro a Data de nascimento
    E escolho um Gênero
    E digito o Endereço
    E escolho um País
    E digito o CEP
    E digito a cidade
    E seleciono uma Ocupação
    E escolho um Hobbie
    E insiro o local na rede de internet
    E faco upload da Foto
    Entao clico no botao next para Enter Product Data     
    
Cenario: Estou no site da tricentis e preencho o formulario da aba “Enter Product Data”
  
    Dado que estou no site da tricentis no Formulario "Enter Product Data" 
    E seleciono uma Data de início 
    E seleciono uma Soma do seguro
    E seleciono uma Classificação de mérito
    E escoseleciono Seguro de Danos
    E escolho Produtos Opcionais
    E seleciono Carro de cortesia
    Entao clico no botao next para ver o formulario Select Price Option
      
  Cenario: Estou no site da tricentis e preencho o formulario da aba “Select Price Option”
  
    Quando escolhe uma opcao 
    Entao clico no botao Next para receber orçamento

  Cenario: que estou no site da tricentis e preencho os dados do Formulario "Send Quote"
    E digito o email 
    E digito um telefone 
    E digito um nome de usuario
    E digito uma senha 
    E confirmo a senha
    E digito comentarios
    Quando clico em Send
    Entao Verifico a mensagem "Sending e-mail success!"
    E clico no botao Ok