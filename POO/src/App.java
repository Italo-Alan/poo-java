public class App {
    public static void main(String[] args) throws Exception {
        Carro meuCarro = new Carro();

        meuCarro.setMarca("Fiat");
        meuCarro.setCor("Branco");
        meuCarro.setModelo("Argo");
        meuCarro.setTanqueGasolina(47);

        System.out.println(meuCarro.getMarca());
        System.out.println(meuCarro.getCor());
        System.out.println(meuCarro.getModelo());
        System.out.println(meuCarro.getTanqueGasolina());
        System.out.println(meuCarro.calculaValorTotal(5.25));


        System.out.println("-------");

        Carro meuSegundoCarro = new Carro("Volkswagen","Cinza","Virtus", 52);
        System.out.println(meuSegundoCarro.getMarca());
        System.out.println(meuSegundoCarro.getCor());
        System.out.println(meuSegundoCarro.getModelo());
        System.out.println(meuSegundoCarro.getTanqueGasolina());
        System.out.println(meuSegundoCarro.calculaValorTotal(5.25));

    }
}
