package com.example.prova02pdm.classes

class Inquilino(CPF_inq : String, nome : String, Valor_depositado : Float){

    var CPF_inq : String
    var nome : String
    var Valor_depositado : Float

    init {
        this.CPF_inq = CPF_inq
        this.nome = nome
        this.Valor_depositado = Valor_depositado
    }

    override fun toString(): String {
        return "Inquilino(CPF_inq='$CPF_inq', nome='$nome', Valor_depositado=$Valor_depositado)"
    }
}