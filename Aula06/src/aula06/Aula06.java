package aula06;
public class Aula06 {
    public static void main(String[] args) {
        
        //Nao usamos nenhum getter ou setter mas ism os metodos deiponniveis na interface
        ControleRemoto c1 = new ControleRemoto();
        c1.ligar();
        c1.maisVolume();
        c1.abrirMenu();
        c1.fecharMenu();
     }
   
}
