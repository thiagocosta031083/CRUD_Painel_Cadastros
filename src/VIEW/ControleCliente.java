
package VIEW;

import DAO.ClienteDAO;
import DTO.ClienteDTO;
import java.util.Scanner;


public class ControleCliente {

    public static void main(String[] args) {
        ClienteDTO objclientedto = new ClienteDTO();
        ClienteDAO objclientedao = new ClienteDAO();
        
        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;

        while (continuar) {
            System.out.println("1. Criar");
            System.out.println("2. Atualizar");
            System.out.println("3. Excluir");
            System.out.println("4. Sair");

            System.out.print("Escolha uma opção: ");
            int escolha = scanner.nextInt();

            switch (escolha) {
                case 1:
                    objclientedao.cadastrar(objclientedto);
                    break;
                case 2:
                    objclientedao.atualizar(objclientedto);
                    break;
                case 3:
                    objclientedao.excluir(objclientedto);
                    break;
                case 4:
                    continuar = false;
                    break;
                default:
                    System.out.println("Opção inválida.");
                    break;
            }
        }

        scanner.close();
    }
    
}
