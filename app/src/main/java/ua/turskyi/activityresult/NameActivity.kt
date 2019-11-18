package ua.turskyi.activityresult

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText

class NameActivity : Activity(), View.OnClickListener {
    var etName: EditText? = null
    var btnOK: Button? = null
    override fun onCreate(savedInstanceState: Bundle?) { // TODO Auto-generated method stub
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_name)
        etName = findViewById<View>(R.id.etName) as EditText
        btnOK = findViewById<View>(R.id.btnOK) as Button
        btnOK!!.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        val intent = Intent()
        intent.putExtra("name", etName!!.text.toString())
        setResult(RESULT_OK, intent)
        finish()
    }
}