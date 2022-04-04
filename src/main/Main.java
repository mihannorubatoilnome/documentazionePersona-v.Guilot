package main;

public class Main {

    public static void main(String[] args) {
        persona p1 = new persona("Edmard", "Guilot", "g l t d r d 03a05d612s");
        persona p2 = new persona(p1);
        
        p2.setNome("Miguel");
        p2.setCodice("zxcvbnm123456789");
        
        System.out.println(p2.isOmino(p1));
        System.out.println(p1.toString());
        System.out.println(p2.toString());
    }
    
}
