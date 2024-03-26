package VIEW;

import DAO.FuncionarioDAO;
import DTO.FuncionarioDTO;
import java.util.Scanner;

public class ControleFuncionario {

    public static void main(String[] args) {
        FuncionarioDTO objfuncionariodto = new FuncionarioDTO();
        FuncionarioDAO objfuncionariodao = new FuncionarioDAO();
        
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
                    objfuncionariodao.cadastrar(objfuncionariodto);
                    break;
                case 2:
                    objfuncionariodao.atualizar(objfuncionariodto);
                    break;
                case 3:
                    objfuncionariodao.excluir(objfuncionariodto);
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
    
