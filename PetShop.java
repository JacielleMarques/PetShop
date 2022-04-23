public class PetShop {

    public static void main(String[] arsg){

        Cachorro c1 = new Cachorro();
        c1.nome = "Briza";
        c1.raca = "Vira-Lata";
        c1.cor = "Branca com pintas marron";
        c1.sexo='F';
        c1.idade = 4;

        Cachorro c2 = new Cachorro();

        Gato g1  = new Gato();

        g1.nome = "Simba";
        g1.raca = "Ragdoll";
        g1.sexo = 'M';
        g1.cor = "Preto";
        g1.idade = 2;

        System.out.println("Objeto c1");
        System.out.println(c1.nome);
        System.out.println(c1.raca);
        System.out.println("---------------------------------------------------");
    
        System.out.println("Objeto c2");
        System.out.println(c2.nome);
        System.out.println(c2.raca);
        System.out.println("---------------------------------------------------");

        System.out.println("Objeto g1");
        System.out.println(g1.nome);
        System.out.println(g1.raca);
       

    }

    
}
