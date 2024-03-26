
package DAO;

import DTO.BairroDTO;
import DTO.ClienteDTO;
import DTO.FornecedorDTO;
import DTO.FuncionarioDTO;
import INTER.BasicoCRUD;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class FuncionarioDAO implements BasicoCRUD {
   private Scanner scanner = new Scanner(System.in);
    
   public void cadastrar(FuncionarioDTO objfornecedordto) {
        System.out.println("Digite o nome do funcionario a ser cadastrado: ");
        objfornecedordto.setNome(getScanner().nextLine());
        String sql = "INSERT INTO funcionario(nome_funcionario) VALUES (?)";
        try(Connection conn = new ConexaoDAO().conectarBD();
            PreparedStatement pstm = conn.prepareStatement(sql)){
            pstm.setString(1,objfornecedordto.getNome());
            pstm.executeUpdate();
            if(pstm !=null){
                pstm.close();
            }
            
        }catch(SQLException e){
            e.printStackTrace();
        }
    }

    public void atualizar(FuncionarioDTO objfornecedordto) {
        System.out.println("Digite o id do funcionario a ser atualizado: ");
        objfornecedordto.setId(getScanner().nextInt());
        System.out.println("Digite o nome do funcionario a ser cadastrado: ");
        objfornecedordto.setNome(getScanner().next());
        String sql = "UPDATE funcionario SET nome_funcionario = ? WHERE id_funcionario = ?";
        try (Connection conn = new ConexaoDAO().conectarBD();
            PreparedStatement pstm = conn.prepareStatement(sql)) {
            pstm.setString(1, objfornecedordto.getNome());
            pstm.setInt(2, objfornecedordto.getId()); // Certifique-se de que você tem um método getId() no seu DTO
            pstm.executeUpdate();
            if (pstm != null) {
                pstm.close();
            }
        } catch (SQLException e) {
            e.printStackTrace(); 
        }
    }

    public void excluir(FuncionarioDTO objfornecedordto) {
        System.out.println("Digite o id do funcionario a ser excluido: ");
        objfornecedordto.setId(getScanner().nextInt());        
        String sql = "DELETE FROM funcionario WHERE id_funcionario = ?";
        try (Connection conn = new ConexaoDAO().conectarBD();
            PreparedStatement pstm = conn.prepareStatement(sql)){
            pstm.setInt(1, objfornecedordto.getId());
            pstm.executeUpdate();
            if (pstm != null) {
                pstm.close();
            }
        }catch (SQLException e){
            e.printStackTrace(); // Ou você pode lançar uma exceção personalizada
        }
        getScanner().close();
    }



    /**
     * @return the scanner
     */
    public Scanner getScanner() {
        return scanner;
    }

    /**
     * @param scanner the scanner to set
     */
    public void setScanner(Scanner scanner) {
        this.scanner = scanner;
    }

    @Override
    public void cadastrar(BairroDTO objbairrodto, ClienteDTO objclientedto, FornecedorDTO objfornecedordto, FuncionarioDTO objfuncinariodto) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void atualizar(BairroDTO objbairrodto, ClienteDTO objclientedto, FornecedorDTO objfornecedordto, FuncionarioDTO objfuncinariodto) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void excluir(BairroDTO objbairrodto, ClienteDTO objclientedto, FornecedorDTO objfornecedordto, FuncionarioDTO objfuncinariodto) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
