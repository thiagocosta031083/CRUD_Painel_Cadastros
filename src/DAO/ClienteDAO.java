
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


public class ClienteDAO implements BasicoCRUD{

    private Scanner scanner = new Scanner(System.in);
    
   public void cadastrar(ClienteDTO objclientedto) {
        System.out.println("Digite o nome do cliente a ser cadastrado: ");
        objclientedto.setNome(getScanner().nextLine());
        String sql = "INSERT INTO cliente(nome_cliente) VALUES (?)";
        try(Connection conn = new ConexaoDAO().conectarBD();
            PreparedStatement pstm = conn.prepareStatement(sql)){
            pstm.setString(1,objclientedto.getNome());
            pstm.executeUpdate();
            if(pstm !=null){
                pstm.close();
            }
            
        }catch(SQLException e){
            e.printStackTrace();
        }
    }

    public void atualizar(ClienteDTO objclientedto) {
        System.out.println("Digite o id do cliente a ser atualizado: ");
        objclientedto.setId(getScanner().nextInt());
        System.out.println("Digite o nome do cliente a ser cadastrado: ");
        objclientedto.setNome(getScanner().next());
        String sql = "UPDATE cliente SET nome_cliente = ? WHERE id_cliente = ?";
        try (Connection conn = new ConexaoDAO().conectarBD();
            PreparedStatement pstm = conn.prepareStatement(sql)) {
            pstm.setString(1, objclientedto.getNome());
            pstm.setInt(2, objclientedto.getId()); // Certifique-se de que você tem um método getId() no seu DTO
            pstm.executeUpdate();
            if (pstm != null) {
                pstm.close();
            }
        } catch (SQLException e) {
            e.printStackTrace(); 
        }
    }

    public void excluir(ClienteDTO objclientedto) {
        System.out.println("Digite o id do cliente a ser excluido: ");
        objclientedto.setId(getScanner().nextInt());        
        String sql = "DELETE FROM cliente WHERE id_cliente = ?";
        try (Connection conn = new ConexaoDAO().conectarBD();
            PreparedStatement pstm = conn.prepareStatement(sql)){
            pstm.setInt(1, objclientedto.getId());
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

    public void cadastrar(BairroDTO objbairrodto, ClienteDTO objclientedto, Object objfornecedordto, Object objfuncinariodto) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public void atualizar(BairroDTO objbairrodto, ClienteDTO objclientedto, Object objfornecedordto, Object objfuncinariodto) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public void excluir(BairroDTO objbairrodto, ClienteDTO objclientedto, Object objfornecedordto, Object objfuncinariodto) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
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
