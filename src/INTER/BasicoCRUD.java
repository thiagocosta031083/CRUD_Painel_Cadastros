package INTER;
import DTO.BairroDTO;
import DTO.ClienteDTO;
import DTO.FornecedorDTO;
import DTO.FuncionarioDTO;
 
public interface BasicoCRUD {
     
    public void cadastrar(BairroDTO objbairrodto, ClienteDTO objclientedto, FornecedorDTO objfornecedordto, FuncionarioDTO objfuncinariodto);
    public void atualizar(BairroDTO objbairrodto, ClienteDTO objclientedto, FornecedorDTO objfornecedordto, FuncionarioDTO objfuncinariodto);
    public void excluir(BairroDTO objbairrodto, ClienteDTO objclientedto, FornecedorDTO objfornecedordto, FuncionarioDTO objfuncinariodto);
      
}
