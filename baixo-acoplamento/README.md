# Padrões GRASP - Baixo acoplamento

O princípio de baixo acoplamento busca reduzir a dependência entre as partes de um sistema, minimizando as interações diretas entre classes e objetos. Neste sistema de gerenciamento de floricultura, isso foi alcançado distribuindo responsabilidades de forma adequada e mantendo relações entre classes fracas e flexíveis. Cada classe e interface tem uma responsabilidade bem definida e independente, promovendo a modularidade, reutilização e manutenção do código.

* As interfaces Planta e Pessoa possuem apenas métodos relacionados às suas respectivas entidades, como obter nome, preço, tipo, descrição para plantas, e nome, informações, registrar vendas para pessoas.

* As classes Cactos, Frutiferas, Ornamentais e Aromaticas implementam a interface Planta, cada uma com seus métodos e atributos específicos relacionados ao tipo de planta.

* As classes Funcionario e Cliente implementam a interface Pessoa, com métodos e atributos que fazem sentido para cada entidade. Por exemplo, o Funcionario tem um salário e cargo, enquanto o Cliente tem informações de contato e uma lista de compras.

* A classe Administrativo implementa a interface Pessoa, com métodos e atributos relacionados à administração do sistema, como gerar relatórios de vendas.
