package system.cpu;
import system.memory.*;

public class TestAssembly {
    public static void main(String[] args){
       // Inicializando
        Memory memory = new Memory();
        ControlUnit cu = new ControlUnit();
        Assembly functions = new Assembly(memory,cu);
      
        // Para testar a saida de um valor de reg:
        // memory.getValue(cu.getRegisterLocation("R4")).getValue()

       // Testando Funcoes
       System.out.println("Memória antes: ");
        memory.getMemory();
        
        functions.LDI("R1", 2);
        functions.LDI("R3", 5);
        functions.STD(2, "R3");
        functions.LDX("R4", "R1");
        System.out.println("Valor em R4: " + memory.getValue(cu.getRegisterLocation("R4")).getValue());


        // Testando as funcoes
        System.out.println("Memória Depois: ");
        memory.getMemory();



        
    }
}