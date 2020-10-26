package com.example.snackbar.`interface`

import android.app.AlertDialog

interface ContractMainActivity {
    fun callFragDetailGastos()

    // Args -> campos
    fun gerarDialog(vararg args: String)
}