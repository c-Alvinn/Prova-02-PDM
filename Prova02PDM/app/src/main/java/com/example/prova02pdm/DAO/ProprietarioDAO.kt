package com.example.prova02pdm.DAO;

import android.content.ContentValues
import android.util.Log
import com.example.prova02pdm.banco.MyDataBaseHelper;
import com.example.prova02pdm.classes.Inquilino
import com.example.prova02pdm.classes.Proprietario

class ProprietarioDAO(banco : MyDataBaseHelper) {

    var banco : MyDataBaseHelper

    init {
        this.banco = banco
    }

    fun inserirProprietario(proprietario : Proprietario): Boolean{
        val db_insercao = this.banco.writableDatabase
        val valores = ContentValues().apply{
            put("CPF_prop", proprietario.CPF_prop)
            put("nome", proprietario.nome)
            put("email", proprietario.email)
        }
        val confirmaInsercao = db_insercao?.insert("Proprietario",  null, valores)
        Log.i("Teste","Inserção: "+confirmaInsercao)
        if (confirmaInsercao?.toInt()!! <= 0){
            return false
        }
        return true
    }

}
