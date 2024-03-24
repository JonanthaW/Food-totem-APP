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

## ENUM catalogo
* 'PEDEN' -> Pendente
* 'PREPC' -> Em preparação
* 'PRNTO' -> Pedido pronto para busca
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



#### Database:
*  Cupom
*  Categorias
*  Comidas
*  Pedidos
*  Balcao
