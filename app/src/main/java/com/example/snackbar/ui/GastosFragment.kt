package com.example.snackbar.ui

import android.app.AlertDialog
import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import com.example.snackbar.R
import com.example.snackbar.`interface`.ContractMainActivity
import com.google.android.material.textfield.TextInputEditText
import java.time.LocalDate
import java.time.LocalDateTime
import java.time.LocalTime

class GastosFragment : Fragment() {
    private var descricao: String = ""
    private var categoria: String = ""
    private var dataHora: String = ""
    private var valor: String = ""
    private lateinit var cma: ContractMainActivity
    private lateinit var alertDialog: AlertDialog


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_gasto, container, false)
    }

    companion object{
        fun newInstance() = GastosFragment()
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        val supostoBotão: Button? = null

        supostoBotão!!.setOnClickListener {
            this.preencher()
            cma.gerarDialog(
                this.descricao,
                this.categoria,
                this.dataHora,
                this.valor
            )
        }
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        if (context is ContractMainActivity) {
            cma = context
        }
    }

    private fun preencher() {
        val descricao: TextInputEditText? = null

        if (descricao!!.text != null) {
            this.descricao = descricao!!.text.toString()
        }

        val categoria: TextInputEditText? = null
        if (categoria!!.text != null) {
            this.categoria = categoria!!.text.toString()
        }

        val dataHora: TextInputEditText? = null
        if (dataHora!!.text != null) {
            // Sem cabeça para parsear para data...
            this.dataHora = dataHora!!.text.toString()
        }
        val valor: TextInputEditText? = null
        if (valor!!.text != null) {
            this.valor = valor!!.text.toString()
        }

    }
}