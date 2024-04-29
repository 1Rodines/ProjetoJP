/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.descompila.controller;

import br.com.descompila.projetologin.CadastroView;
import java.sql.Connection;

/**
 *
 * @author mdnvi
 */
public class LoginController {

    
public void cadastroUsuario(CadastroView view){

 Connection conexao = new conexao().getConnection();
 LoginDAO cadastro = new LoginDAO();
 cadastro.cadastrarUsuario(view.getjTextFieldUsuario().getText(), view.getjPassawordFieldSenha().getText);
 
 
 
 
         
 
 
 
 
 
}

}