# Padrões GRASP - Polimorfismo

O polimorfismo simplifica o código, permitindo-nos trabalhar com diferentes tipos de objetos de maneira uniforme através de uma única interface comum, tornando o código mais flexível e fácil de entender.

* Temos uma classe Media que define um método reproduzir(). As classes Video e Imagem estendem Media e fornecem sua própria implementação do método reproduzir().
* A classe Galeria possui uma lista de medias que aceita qualquer tipo de media.
* A classe Video possui dois métodos mudaVelocidade().