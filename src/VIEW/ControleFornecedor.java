package VIEW;

import DAO.FornecedorDAO;
import DTO.FornecedorDTO;
import java.util.Scanner;

public class ControleFornecedor {


    public static void main(String[] args) {
        FornecedorDTO objfornecedordto = new FornecedorDTO();
        FornecedorDAO objclientedao = new FornecedorDAO();
        
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
                    objclientedao.cadastrar(objfornecedordto);
                    break;
                case 2:
                    objclientedao.atualizar(objfornecedordto);
                    break;
                case 3:
                    objclientedao.excluir(objfornecedordto);
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
