package com.example.prova02pdm.DAO

import android.content.ContentValues
import android.util.Log
import com.example.prova02pdm.banco.MyDataBaseHelper
import com.example.prova02pdm.classes.Inquilino

class InquilinoDAO(banco : MyDataBaseHelper) {

    var banco : MyDataBaseHelper

    init {
        this.banco = banco
    }

    fun inserirInquilino(inquilino : Inquilino): Boolean{
        val db_insercao = this.banco.writableDatabase
        val valores = ContentValues().apply{
            put("CPF_inq", inquilino.CPF_inq)
            put("nome", inquilino.nome)
            put("Valor_depositado", inquilino.Valor_depositado)
        }
        val confirmaInsercao = db_insercao?.insert("Inquilino",  null, valores)
        Log.i("Teste","Inserção: "+confirmaInsercao)
        if (confirmaInsercao?.toInt()!! <= 0){
            return false
        }
        return true
    }
}