/**
 * UTFPR - Universidade Tecnológica Federal do Paraná
 * DAINF - Departamento Acadêmico de Informática
 * IF62C - Fundamentos de Programação 2
 * 
 * Template de projeto de programa Java usando Maven.
 * @author Wilson Horstmeyer Bogado <wilson@utfpr.edu.br>
 */
public class Pratica91 {
    public static void main(String[] args) {
        System.out.println(System.getProperty("os.name"));
        System.out.println(Runtime.getRuntime().availableProcessors());
        System.out.println(Runtime.getRuntime().totalMemory()/(1000*1024));
        System.out.println(Runtime.getRuntime().freeMemory()/(1000*1024));
        System.out.println(Runtime.getRuntime().maxMemory()/(1000*1024));
    }
}