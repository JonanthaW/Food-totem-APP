# Food-totem-APP
A complete food totem APP used in fast food restaurants.


## Ferramentas utilizadas:

* Java 21
* Spring framework
* Lombok
* Spring Security
* Spring JPA
* Thymeleaf
* Postman
* PostGreSQL


## Features:

#### ENUM catalogo
* 'PEDEN' -> Pendente
* 'PREPC' -> Em preparação
* 'PRNTO' -> Pedido pronto para busca
* 'CANCEL' -> Pedido cancelado
* 'FINLZ' -> Finalizado e entregue


#### Back-end:

-> Usuários

* Usuários podem adicionar cupons com desconto, se o cupom existir, retorna ok (GET).
* Usuários podem receber uma lista com cupons disponíveis (GET).
* Usuários recebem automaticamente uma lista com comidas disponíveis (GET).
* Usuários recebem automaticamente uma lista com categorias (GET).
* Usuários podem olhar produtos apenas por categorias específicas (GET).
* Usuários enviam os pedidos até a cozinha para que sejam preparados (POST).

-> Atendentes

* Atendentes podem enviar os pedidos prontos para a tela de notificação no balcão para que os usuários busquem (GET).
* Atendentes podem cancelar pedidos se eles ainda não estiverem prontos. (DELETE);


-> Admnistradores:

* Podem criar cupons válidos com valores de descontos e datas de expiração (POST).
* Admnistradores podem apagar cupons antes do prazo de validade (DELETE).



#### Database:
*  Cupom
*  Categorias
*  Comidas
*  Pedidos
*  Balcao


## Front-end:


#### Telas da aplicação (Clique nas setas à esquerda para mostrar as imagens):

<details>
  <Summary>Balcão de apresentação para pedidos prontos</Summary>
<p align="center">
  <img src="https://github.com/JonanthaW/Food-totem-APP/blob/main/Images/balcao.PNG">
</p>
</details>


<details>
  <Summary>Tela de criação de cupons da Admnistração</Summary>
<p align="center">
  <img src="https://github.com/JonanthaW/Food-totem-APP/blob/main/Images/cuponsCriar.PNG">
</p>
</details>

<details>
  <Summary>Tela de login para a admnistração</Summary>
<p align="center">
  <img src="https://github.com/JonanthaW/Food-totem-APP/blob/main/Images/loginADM.PNG">
</p>
</details>
