public class App {
    public static void main(String[] args) throws Exception {
        ClasseMae[] classes = new ClasseMae[]{new ClasseFilha1(), new ClasseFilha2(), new ClasseMae()};

        //Basicamente funciona como um forEach
        //Sobrescrita com polimorfismo
        for(ClasseMae classe: classes){
            classe.metodo1();
        }
        
        System.out.println("");
        
        //Sobrescrita com polimorfismo
        for(ClasseMae classe: classes){
            classe.metodo2();
        }

        System.out.println("");

        ClasseFilha2 classeFilha2 = new ClasseFilha2();
        //Sobrescrita pura
        classeFilha2.metodo2();
    }
}
