package DAO;

import DTO.BairroDTO;
import DTO.ClienteDTO;
import DTO.FornecedorDTO;
import DTO.FuncionarioDTO;
import INTER.BasicoCRUD;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
//import java.util.Scanner;

public class BairroDAO implements BasicoCRUD{

    //Scanner scanner = new Scanner(System.in);
    
    public void cadastrar(BairroDTO objbairrodto) {
        //System.out.println("Digite o nome do bairro a ser cadastrado: ");
        //objbairrodto.setNome(scanner.nextLine());
        String sql = "INSERT INTO bairro(logradouro) VALUES (?)";
        try(Connection conn = new ConexaoDAO().conectarBD();
            PreparedStatement pstm = conn.prepareStatement(sql)){
            pstm.setString(1,objbairrodto.getNome());
            pstm.executeUpdate();
            if(pstm !=null){
                pstm.close();
            }
            
        }catch(SQLException e){
            e.printStackTrace();
        }
    }

    public void atualizar(BairroDTO objbairrodto) {
        //System.out.println("Digite o id do bairro a ser atualizado: ");
        //objbairrodto.setId(scanner.nextInt());
      //  System.out.println("Digite o nome do bairro a ser cadastrado: ");
       // objbairrodto.setNome(scanner.next());
        String sql = "UPDATE bairro SET logradouro = ? WHERE id_bairro = ?";
        try (Connection conn = new ConexaoDAO().conectarBD();
            PreparedStatement pstm = conn.prepareStatement(sql)) {
            pstm.setString(1, objbairrodto.getNome());
            pstm.setInt(2, objbairrodto.getId()); // Certifique-se de que você tem um método getId() no seu DTO
            pstm.executeUpdate();
            if (pstm != null) {
                pstm.close();
            }
        } catch (SQLException e) {
            e.printStackTrace(); 
        }
    }

    public void excluir(BairroDTO objbairrodto) {
      //  System.out.println("Digite o id do bairro a ser excluido: ");
      //  objbairrodto.setId(scanner.nextInt());        
        String sql = "DELETE FROM bairro WHERE id_bairro = ?";
        try (Connection conn = new ConexaoDAO().conectarBD();
            PreparedStatement pstm = conn.prepareStatement(sql)){
            pstm.setInt(1, objbairrodto.getId());
            pstm.executeUpdate();
            if (pstm != null) {
                pstm.close();
            }
        }catch (SQLException e){
            e.printStackTrace(); // Ou você pode lançar uma exceção personalizada
        }
        //scanner.close();
    }
    
    /*public ArrayList<BairroDTO> listaBairros(){//Pascal Case = A
        ArrayList<BairroDTO> listaBairros =  new ArrayList<>();
        String sql = "SELECT * FROM bairro";
        try (Connection conn = new ConexaoDAO().conectarDB();
                PrepareStatement
                )
    }*/

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
