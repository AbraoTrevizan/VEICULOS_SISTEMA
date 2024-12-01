package oi;
import java.sql.Connection;
import java.sql.Statement;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
         
        	
            Connection conn = ConexaoBanco.getConnection();
            
            boolean continuar = true;
            while (continuar) {
                
                System.out.println("Escolha o tipo de veículo a ser inserido:");
                System.out.println("1. Automóvel");
                System.out.println("2. Motocicleta");
                System.out.println("3. Caminhão");
                System.out.println("4. Bicicleta");
                System.out.println("5. Skate");
                System.out.println("6. Sair");
                int escolha = scanner.nextInt();
                scanner.nextLine();
                

              
                Statement stmt = conn.createStatement();

                switch (escolha) {
                    case 1:
                    
                        break;
                    case 2:
                        break;
                    case 3:                      
                        break;
                    case 4:
                        
                        System.out.println("Informe o modelo da bicicleta:");
                        String modeloBicicleta = scanner.nextLine();
                        System.out.println("Informe o ano de fabricação:");
                        int anoFabricacaoBicicleta = scanner.nextInt();
                        scanner.nextLine(); 
                        System.out.println("Informe a montadora:");
                        String montadoraBicicleta = scanner.nextLine();  
                        System.out.println("Informe a cor:");
                        String corBicicleta = scanner.nextLine();
                        System.out.println("Informe a kilometragem:");
                        int kilometragemBicicleta = scanner.nextInt();
                        scanner.nextLine();
                        System.out.println("Informe o material da bicicleta:");
                        String material = scanner.nextLine();
                        System.out.println("Informe a quantidade de marchas:");
                        int quantidadeMarchas = scanner.nextInt();
                        System.out.println("Possui amortecedor? (true/false):");
                        boolean amortecedor = scanner.nextBoolean();

                        
                        Bicicleta bicicleta = new Bicicleta(modeloBicicleta, anoFabricacaoBicicleta, montadoraBicicleta, corBicicleta, kilometragemBicicleta, material, quantidadeMarchas, amortecedor);
                        String sqlBicicleta = bicicleta.gerarInsert();
                        
                       
                        
                        stmt.executeUpdate(sqlBicicleta);
                        System.out.println("Bicicleta inserida com sucesso!");
                        break;

                    case 5:
                      
                        System.out.println("Informe o modelo do skate:");
                        String modeloSkate = scanner.nextLine();
                        System.out.println("Informe o ano de fabricação:");
                        int anoFabricacaoSkate = scanner.nextInt();
                        scanner.nextLine();
                        System.out.println("Informe a montadora:");
                        String montadoraSkate = scanner.nextLine(); 
                        System.out.println("Informe a cor:");
                        String corSkate = scanner.nextLine();
                        System.out.println("Informe a kilometragem:");
                        int kilometragemSkate = scanner.nextInt();
                        scanner.nextLine(); 
                        System.out.println("Informe o tipo das rodas:");
                        String tipoRodas = scanner.nextLine();

                     
                        Skate skate = new Skate(modeloSkate, anoFabricacaoSkate, montadoraSkate, corSkate, kilometragemSkate, tipoRodas);
                        String sqlSkate = skate.gerarInsert();
                        
                    
                        stmt.executeUpdate(sqlSkate);
                        System.out.println("Skate inserido com sucesso!");
                        break;

                    case 6:
                        continuar = false;
                        System.out.println("Saindo do sistema.");
                        break;

                    default:
                        System.out.println("Opção inválida, por favor escolha novamente.");
                        break;
                }
            }


            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

