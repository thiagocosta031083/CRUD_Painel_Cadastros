package VIEW;

import DAO.BairroDAO;
import DTO.BairroDTO;
import java.util.Scanner;



public class ControleBairro {

    public static void main(String[] args) {
        BairroDTO objbairrodto = new BairroDTO();
        BairroDAO objbairrodao = new BairroDAO();
        
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
                    objbairrodao.cadastrar(objbairrodto);
                    break;
                case 2:
                    objbairrodao.atualizar(objbairrodto);
                    break;
                case 3:
                    objbairrodao.excluir(objbairrodto);
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
