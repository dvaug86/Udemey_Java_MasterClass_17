/*
 * Write a method called printMegaBytesAndKiloBytes that has 1 parameter of type int with the name kiloBytes.

The method should not return anything (void) and it needs to calculate the megabytes and remaining kilobytes from the kilobytes parameter.

Then it needs to print a message in the format "XX KB = YY MB and ZZ KB".

XX represents the original value kiloBytes.
YY represents the calculated megabytes.
ZZ represents the calculated remaining kilobytes.

For example, when the parameter kiloBytes is 2500 it needs to print "2500 KB = 2 MB and 452 KB"

If the parameter kiloBytes is less than 0 then print the text "Invalid Value".
 */



public class CodingExercise3_MegaBytesConverter {
    public static void main(String[] args) {
        printMegaBytesAndKiloBytes(2500);
    }
    public static void printMegaBytesAndKiloBytes(int kiloBytes) {
        if(kiloBytes <0 ){
            System.out.println("Invalid Value");
            return;
        }
        int YY = kiloBytes / 1024; //megabytes
        int ZZ = kiloBytes % 1024; //remainder kbs
        System.out.println(kiloBytes + " KB = " + YY + " MB and " +ZZ +" KB");
        
        }
    
    
}
