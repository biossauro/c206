public class Cliente {
    /*
    Cliente associa-se com Empresa em um relacionamento "muitos para muitos", ou seja, uma empresa
    presta serviço a vários clientes e um cliente solicita serviço de várias empresas.
     */
    public String nome;

    public Cliente(String nome) {
        this.nome = nome;
    }

    public void contratarServico(Empresa empresa) {
        /*
        Na ASSOCIAÇÃO, não há regra bem definida para como devemos implementar uma funcionalidade...

        Aqui, por exemplo, o cliente contrata o serviço de uma empresa através da passagem de um
        objeto do tipo Empresa por referência em uma função.
         */
        System.out.println(nome + " contratou a empresa " + empresa.nome + ".");
    }
}
