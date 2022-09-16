/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.bean;

/**
 *
 * @author Rodrigo
 */
public class CadastroCanal {
    
        private int can_id;
    private String can_empresa;
    private String can_plataforma;
    private String can_autentificacao;

    public int getCan_id() {
        return can_id;
    }

    public void setCan_id(int can_id) {
        this.can_id = can_id;
    }

    public String getCan_empresa() {
        return can_empresa;
    }

    public void setCan_empresa(String can_empresa) {
        this.can_empresa = can_empresa;
    }

    public String getCan_plataforma() {
        return can_plataforma;
    }

    public void setCan_plataforma(String can_plataforma) {
        this.can_plataforma = can_plataforma;
    }

    public String getCan_autentificacao() {
        return can_autentificacao;
    }

    public void setCan_autentificacao(String can_autentificacao) {
        this.can_autentificacao = can_autentificacao;
    }
    
}
