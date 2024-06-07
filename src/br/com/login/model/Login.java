/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.login.model;

/**
 *
 * @author mdnvi
 */
public class Login {
    
    
    private String nome, idade,  email, CPF;

    public Login(String email, String CPF) {
        this.email = email;
        this.CPF = CPF;
    }
    
    
    public void cadastrar(String email, String CPF, String nome, String idade){
        
        this.email = email;
        this.CPF = CPF;
        this.nome = nome;
        
                
    
    
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getIdade() {
        return idade;
    }

    public void setIdade(String idade) {
        this.idade = idade;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }
    


    



}