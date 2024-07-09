import java.util.Scanner;

public class Ahorcado {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        
        String palabraSecreta = "inteligencia";
        int intentosMax = 10;
        int intentos = 0;
        boolean adivinado = false;

        char[] letrasAdivinadas = new char[palabraSecreta.length()];

        for (int i = 0; i < letrasAdivinadas.length; i++) {
            letrasAdivinadas[i] = '_';
        }

        while(!adivinado && intentos < intentosMax){
            System.out.println("Palabra a adivinar: "+String.valueOf(letrasAdivinadas)+" ("+palabraSecreta.length()+" letras)");
            System.out.println("Introduce una letra: ");
            char letra = Character.toLowerCase(scanner.next().charAt(0)); //devolver primera letra

            boolean letraCorrecta = false;
            for (int i = 0; i < palabraSecreta.length(); i++) {
                if(palabraSecreta.charAt(i) == letra){
                    letrasAdivinadas[i] = letra;
                    letraCorrecta = true;
                }
            }

            if(!letraCorrecta){
                intentos++;
                System.out.println("Incorrecto! Te quedan "+(intentosMax - intentos)+" intentos.");
            }

            if(String.valueOf(letrasAdivinadas).equals(palabraSecreta)){
                adivinado = true;
                System.out.println("Adivinaste!");
                System.out.println("Palabra secreta: "+palabraSecreta);
            }
        }

        if(!adivinado){
            System.out.println("¡Te has quedado sin intentos!");
        }

        scanner.close();

    }
}
