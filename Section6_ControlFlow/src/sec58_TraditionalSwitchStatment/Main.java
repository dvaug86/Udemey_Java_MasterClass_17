/*
 * In this challange we will be using the NATO alphabet to replace a character or letter with NATO's standard word
 * The NATO phonetic alphabet
 * A = Able, B = Baker, C = Charlie, D = Dog, E = Easy,
 * F = Fox, G = George, H = How, I  = Item, J = Jig,
 * K = King, L = Love, M = Mike, N = Nan, O = Oboe,
 * P = Peter, Q = Queen, R = Roger, S = Sugar, T = Tare,
 * U = Uncle, V = Victor, W = William, X = X-ray, Y = Yoke, Z = Zebra
 * 
 * Create a new char variable 
 * use the traditional switch statement that test the value
 */

package sec58_TraditionalSwitchStatment;

public class Main {
    public static void main(String[] args) {
        char charValue = 'A'; //remember char needs single quotes
        switch(charValue){
            case 'A': 
            System.out.println("A is Able");
            break;
            case 'B': 
            System.out.println("B is Baker");
            break;
            case 'C': 
            System.out.println("C is Charlie");
            break;
            case 'D': 
            System.out.println("D is Dog");
            break;
            case 'E': 
            System.out.println("E is Easy");
            break;
            default: 
            System.out.println("Letter " + charValue + " is invalid"); 
            break;
        }
    }

}
